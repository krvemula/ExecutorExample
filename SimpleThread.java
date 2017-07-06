package com.executorframework;

public class SimpleThread implements Runnable {
 private String id;
 public SimpleThread(String id){
	 super();
	 this.id=id; 
 }
 @Override
 public void run(){
	 System.out.println(Thread.currentThread().getName());
 }
}
