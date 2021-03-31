package com.rtx.zhongxing.proxy.parameter;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

import com.rtx.zhongxing.proxy.parameter.build.ParamerBuilder;
import com.rtx.zhongxing.proxy.parameter.build.ParameterBuildFactory;

@SuppressWarnings("all")
public class RtxParameterHandel{

//	private Parameter[] parameters;
//	private Object[] args;
//	private RtxMethodType methodType;

//	public RtxParameterHandel(Parameter[] parameters, Object[] args) {
//		super();
//		this.parameters = parameters;
//		this.args = args;
//	}

	public RtxProxyParameter getMethodParameterMapping(Method method,Parameter[] parameters,Object[] args) throws Exception {
		RtxProxyParameter proxyParameter = new RtxProxyParameter();
		
		List<OriginalProxyParameter> totalParamMappingList = new ArrayList<OriginalProxyParameter> ();
		
		for(int i = 0;i<parameters.length;i++) {
			//方法参数
			Parameter parameter = parameters[i];
			//实参
			Object parameterValue = args[i];
			//对代理方法参数解析并进行映射
			OriginalProxyParameter originalProxyParameter = new OriginalProxyParameter(parameter, parameterValue);
			
			totalParamMappingList.add(originalProxyParameter);
		}
		
		RtxProxyParameter rtxProxyParameter = reBuildParameter(method,totalParamMappingList);
		return rtxProxyParameter;
	}
	
	
	private RtxProxyParameter reBuildParameter(Method method,List<OriginalProxyParameter>  originalProxyParameter) {
		ParameterBuildFactory parameterBuildFactory = new ParameterBuildFactory();
		ParamerBuilder paramerBuilder = parameterBuildFactory.getRtxProxyParameter(method, originalProxyParameter);
		return paramerBuilder.build(originalProxyParameter);
	};
}
