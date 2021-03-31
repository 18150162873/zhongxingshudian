package com.rtx.zhongxing.test.jdi;

import java.util.List;
import java.util.Map;

import com.sun.jdi.Bootstrap;
import com.sun.jdi.IncompatibleThreadStateException;
import com.sun.jdi.LocalVariable;
import com.sun.jdi.ObjectReference;
import com.sun.jdi.ReferenceType;
import com.sun.jdi.StackFrame;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.Value;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.VirtualMachineManager;
import com.sun.jdi.connect.AttachingConnector;
import com.sun.jdi.connect.Connector.Argument;
import com.sun.jdi.event.BreakpointEvent;
import com.sun.jdi.event.Event;
import com.sun.jdi.event.EventQueue;
import com.sun.jdi.event.EventSet;
import com.sun.jdi.event.ExceptionEvent;
import com.sun.jdi.request.EventRequest;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.request.ExceptionRequest;

@SuppressWarnings("all")
public class JDIHelp {

	public static void main(String[] args) throws Exception {
		
		VirtualMachineManager VirtualMachineManager= Bootstrap.virtualMachineManager();
		List<AttachingConnector> attachingList = VirtualMachineManager.attachingConnectors();
		
		AttachingConnector attachingConnector = null;
		for(AttachingConnector attach:attachingList) {
			if("dt_socket".equals(attach.transport().name())) {
				attachingConnector = attach;
			}
		}
		
		Map<String, Argument> arguments = attachingConnector.defaultArguments();
		Argument hostname =arguments.get("hostname");
		Argument port =arguments.get("port");
		hostname.setValue("127.0.0.1");
		port.setValue("8000");
		
		VirtualMachine vm = attachingConnector.attach(arguments);
		
		EventRequestManager evenManager = vm.eventRequestManager();
//		ReferenceType referenceType = vm.classesByName("com.rtx.zhongxing.test.jdi.Test").get(0);
//		Location location = referenceType.locationsOfLine(9).get(0);
//		BreakpointRequest breakpoint = evenManager.createBreakpointRequest(location);
//		breakpoint.setSuspendPolicy(EventRequest.SUSPEND_EVENT_THREAD);
//		breakpoint.setEnabled(true);
		
		ReferenceType exceptionReferenceType = vm.classesByName("java.lang.RuntimeException").get(0);
		ExceptionRequest exceptionRequest =evenManager.createExceptionRequest(exceptionReferenceType, true, true);
		exceptionRequest.setSuspendPolicy(EventRequest.SUSPEND_EVENT_THREAD);
		exceptionRequest.setEnabled(true);
		
		EventQueue queue = vm.eventQueue();
		while(true) {
			EventSet set = queue.remove();
			for(Event event:set) {
				if(event instanceof BreakpointEvent) {
					handleExceptionEvent(event);
				}else if(event instanceof ExceptionEvent) {
					handleBreakPoitEvent(event);
				}
			}
		}
	}
	
	private static void handleExceptionEvent(Event event) throws Exception {
		BreakpointEvent breakpointEvent = (BreakpointEvent)event;
		ThreadReference threadReference = breakpointEvent.thread();
		StackFrame StackFrame = threadReference.frame(0);
		List<LocalVariable> localvalList =  StackFrame.visibleVariables();
		for(LocalVariable localval:localvalList) {
			Value value = StackFrame.getValue(localval);
			System.out.println(localval.name());
			System.out.println(value.type().name());
			System.out.println(value);
		}
	}
	
	private static void handleBreakPoitEvent(Event tempEvent) throws Exception {
		ExceptionEvent event = (ExceptionEvent)tempEvent;
		System.out.println(event.catchLocation().codeIndex());
		ObjectReference objectReference = event.exception();
		System.out.println(objectReference.getClass().getName());
		RuntimeException runtimeException = (RuntimeException)objectReference;
		
		System.out.println(event.location().codeIndex());
		ThreadReference threadReference = event.thread();
		StackFrame stackFrame = threadReference.frame(0);
		List<LocalVariable> localvalList =  stackFrame.visibleVariables();
		for(LocalVariable localval:localvalList) {
			Value value = stackFrame.getValue(localval);
			System.out.println(localval.name());
			System.out.println(value.type().name());
			System.out.println(value);
		}
		System.out.println(1);
	}
}
