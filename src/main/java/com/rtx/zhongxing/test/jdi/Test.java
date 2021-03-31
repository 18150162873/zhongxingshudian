package com.rtx.zhongxing.test.jdi;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		while(true) {
			Thread.sleep(1000*6);
			int testvalue = 1;
			System.out.println(testvalue);
			try {
				throw new RuntimeException("test");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
