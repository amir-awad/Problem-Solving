import java.util.LinkedList;
import java.util.Queue;
public class queueReverse{

	/* problem statement

		Write a method reverse that takes as a parameter a 
		queue containing a sequence of objects and reverse it.
		You should implement the method using only queues.

	*/


	// Reversing a queue using recursion
	public static void reverseRec(Queue<Integer> q){
		if(q.isEmpty())
			return;
		int element = (int) q.remove();
		
		reverseRec(q);

		q.add(element);
	}

	// Driver method
	public static void main(String[] args){
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(4);
		q.add(3);
		q.add(2);

		reverseRec(q);
	}

}