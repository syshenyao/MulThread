package com.yss.ams.juc.c_003;

public class ThreadCC extends Thread {
	private MyService myService;

	
	public ThreadCC(MyService myService) {
		super();
		this.myService = myService;
	}


	@Override
	public void run() {
		myService.methodC();
	}

}
