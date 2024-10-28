package skl_oopb2;

/*
 * Name :-Pathan Mugaira Zakeer
 * Div:-A Roll.no:-25 UIN:- 231P084
 * Aim:-Write a program to implement
/* Multithreading in java
 * 
 */
public class exp11A extends Thread //inheriting the properties of thread 
{ 
 public static void main(String args[])// main method  
{ 
exp11A ex=new exp11A();//creating object of main class 
ex.create(); // creating main thread 
System.out.println("this is the main thread!");//displaying string 
} 
public void create()// creating another thread 
{ 
 Thread t=new Thread(this); // creating object of Thread class  
t.start(); //starting a thread 
} 
public void run()// running a thread 
{ 
while(true) //while terminate  
{ 
try 
{ 
System.out.println("this is the child thread!");//displaying string 
 Thread.sleep(500); // sleep for 500 ms 
 } 
 catch (InterruptedException e) { } 
 } 
  
  
} 
} 
