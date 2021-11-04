import java.util.Stack;
import java.io.PrintWriter;

public class stackDecompose {

	/* problem statement

	You are required to implement a method public static Stack<Integer> decompose(Stack<Integer> x)
	where x is a stack of ints. The method is required to decompose the values stored in the stack x into two groups:
		• values in the odd positions remain in the stack x
		• values in the even positions should be stored in a new stack, say y
	The method should finally return the newly created stack y containing the values in the even positions. We will
	assume that the value on top of the stack is in position 1.

	*/

	public static Stack<Integer> decompose(Stack<Integer> x){
	
		Stack<Integer> temp_odd = new Stack<Integer>();
		Stack<Integer> temp_even = new Stack<Integer>();

		int i=1;
		for(int j=x.size()-1; j>= 0 ;j--){
			if(i%2!=0)temp_odd.push(x.peek());
			else temp_even.push(x.peek());
			x.pop();
			i++;
		}
		
		while(!temp_odd.isEmpty()){
			x.push(temp_odd.peek());
			temp_odd.pop();
		}
		Stack<Integer> y = new Stack<Integer> ();
		
		while(!temp_even.isEmpty()){
			y.push(temp_even.peek());
			temp_even.pop();
		}
		
		return y;
	}


	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);
		Stack<Integer> x = new Stack<Integer>();
		x.push(6);
		x.push(9);
		x.push(3);
		x.push(5);
		x.push(4);
		x.push(1);
		x.push(2);
		x.push(7);

		pw.println(x);

		pw.println(decompose(x));
		
		pw.println(x);

		pw.flush();
	}
}
