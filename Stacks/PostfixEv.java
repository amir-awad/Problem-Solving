import java.util.Scanner;
import java.util.Stack;
import java.io.PrintWriter;

public class PostfixEv {
	
	/* problem statement

	Write a class PostfixEv.java that allows for the evaluation of postfix expressions using a static method
	int evaluate(String s). Your evaluate method will be passed a string representing a postfix expressi-
	on containing space-separated elements ("2 3 4 + *",etc.) and is required to evaluate the expression and return the
	resulting value. The valid set of characters is {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, +, -, *, / }. Assume that that the syntax of
	the postfix expression is correct. Make use of a stack to solve this problem.
			
	*/

	public static int evaluate(String str){
		String[] arr = str.split(" ");

		Stack<Integer> s = new Stack<Integer>(); 

		for(int i=0; i < arr.length;i++){

			if(!arr[i].equals("*") && !arr[i].equals("/") && !arr[i].equals("-") && !arr[i].equals("+") )
				s.push(Integer.parseInt(arr[i]));
			
			else{
				
				if(arr[i].equals("*")){
					int elem1 = s.pop();
					int elem2 = s.pop();
					s.push(elem1*elem2);
				}

				else if(arr[i].equals("/")){
					int elem1 = s.pop();
					int elem2 = s.pop();
					s.push(elem2/elem1);
				}
				
				else if(arr[i].equals("+")){
					int elem1 = s.pop();
					int elem2 = s.pop();
					s.push(elem1+elem2);
				}
				
				else if(arr[i].equals("-")){
					int elem1 = s.pop();
					int elem2 = s.pop();
					s.push(elem1-elem2);
				}


			}
		}

		return s.pop();

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		String str = sc.nextLine();

		pw.println("The result of the expression is : " + evaluate(str));
		pw.flush();

		
	}
	
}
