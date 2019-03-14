package _03_Threaded_Reverse_Greeting;


public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	static void printThread(int i) {
		System.out.println(i);
		
			if(i>0) {
				new Thread(() -> {
				System.out.println("Hello from Thread " + i + "!");
				printThread(i-1);
				}).start();
			}
		
	}
	public static void main(String[] args) {
		printThread(50);
	}
	
}