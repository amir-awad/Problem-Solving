import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class shift {

	/* problem statement

		Write a static method shiftZeroes which takes an instance of the Queue class. The method should take all
		the zeroes in a queue and place them at the back. For instance, if we have the following instance of a Queue q
		with the sequence [5, 0, 1, 4, 3, 0, 0, 6, 1, 0]
		we could call shiftZeroes(q), and the sequence would be [5, 1, 4, 3, 6, 1, 0, 0, 0, 0]
		after the call. Note that the order of the non-zero elements stays the same.

	*/

	public static void shiftZeros(Queue<Integer> q){
		Stack<Integer> s = new Stack<Integer>();// to store all the zeros
		
		int size=q.size();

		for(int i=0;i < size;i++){
			if((int) q.peek()== 0) s.push(q.remove());
			else q.add(q.remove());
		}		

		while(!s.isEmpty())
			q.add(s.pop()); //add all the zeros at the end of the queue
		
	}

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(5);
		q.add(0);
		q.add(1);
		q.add(4);
		q.add(3);
		q.add(0);
		q.add(0);
		q.add(6);
		q.add(1);
		q.add(0);
		
		shiftZeros(q);
	
	}

}
