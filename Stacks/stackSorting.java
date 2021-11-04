import java.util.Stack;
import java.io.PrintWriter;

public class stackSorting {
	
	/* problem statement

	Suppose we have a stack of integers. Initially the integers are not sorted. We would like to rearrange the stack using
	the insertion sort algorithm. The elements should be in ascending order where the
	smallest element will be on top of the stack and the largest at the bottom of the stack.

	*/

	public static void stackSort(Stack<Integer> s){
		
		Stack<Integer> temp1 = new Stack<Integer>();
		Stack<Integer> temp2 = new Stack<Integer>();
		Stack<Integer> temp3 = new Stack<Integer>();
		

		while(!s.isEmpty()){
			if(temp1.isEmpty()) temp1.push(s.pop());
			
			else{
				while(!temp1.isEmpty() && (Integer) temp1.peek() < (Integer) s.peek()){
					temp2.push(temp1.pop());
				}
				
				temp1.push(s.pop());

				while(!temp2.isEmpty())
					temp1.push(temp2.pop());
			}
		}
		
		while(!temp1.isEmpty())
			temp3.push(temp1.pop());
		
		while(!temp3.isEmpty())
			s.push(temp3.pop());

	}


	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(1);
		s.push(4);
		s.push(3);
		s.push(2);

		PrintWriter pw = new PrintWriter(System.out);
		
		pw.println(s);
		stackSort(s);
		pw.println(s);

		pw.flush();

	}
	
}
