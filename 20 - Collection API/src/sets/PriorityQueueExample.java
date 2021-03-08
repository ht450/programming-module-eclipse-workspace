package sets;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<Double> q = new PriorityQueue<Double>();
		
		q.add(10.1);
		q.add(3.3);
		q.add(5.2);
		
		System.out.println("Queue order : "+q.toString());
		
		int loop=1;
		while(loop<=q.size()) {
			System.out.println("Peek "+q.peek());
			q.remove();
		}
	}
}
