package sets;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {

	public static void main(String[] args) {
		
		int time = 10;
		
		// create the implementation of the queue
		Queue<Integer> queue = new LinkedList<Integer>();
		
		// populate the queue with the times between start and 0
		for (int i=time; i>=0; i--) {
			queue.add(i);
		}
		
		System.out.println("Queue items : " + queue.toString());
		
		// remove each item (from front of queue) and delay next removal by 1 second
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
