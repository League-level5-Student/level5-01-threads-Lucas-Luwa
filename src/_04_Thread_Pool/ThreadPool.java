package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	Thread[] th;
	ConcurrentLinkedQueue<Task> taskQue;

	public ThreadPool(int totalThreads) {
		th = new Thread[totalThreads];
		taskQue = new ConcurrentLinkedQueue<Task>();
		for (int i = 0; i < th.length; i++) {
			th[i] = new Thread(new Worker(taskQue));
		}

	}

	public void addTask(Task task) {
		taskQue.add(task);
	}

	public void start() {
		for (int i = 0; i < th.length; i++) {
			th[i].start();
		}
		for (int i = 0; i < th.length; i++) {
			try {
				th[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}