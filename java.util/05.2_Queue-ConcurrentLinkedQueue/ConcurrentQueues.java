import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentQueues{

	public static void main(String[] args){

		Queue<Integer> queues = new ConcurrentLinkedQueue<Integer>();

         queues.add(1);
         queues.add(2);
         queues.add(3);
         queues.add(4);
         queues.add(5);
         queues.add(6);
         queues.add(7);
         queues.add(8);
         queues.add(9);
         queues.add(10);

         System.out.println("Queue: " + queues);
         System.out.println("Deque: " + queues.poll());
         System.out.println("Queue: " + queues);
	}
}