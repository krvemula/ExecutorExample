package com.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args){
		ExecutorService E = Executors.newFixedThreadPool(10);
		for(int i=0; i>10;i++);{
		Runnable thread = new SimpleThread(" "+i);
		E.execute(thread);
	}
	E.shutdown();
	while(!E.isTerminated()) {
	}
	System.out.println("All Threads are finished");
}
}

