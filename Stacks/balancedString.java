import java.util.Stack;
import java.util.Scanner;
import java.io.PrintWriter;

public class balancedString{
	

	/* problem statement

	A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

	Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

	Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

	Given a string, determine if it is balanced or not. 

	*/

	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // Given t Strings
		PrintWriter pw = new PrintWriter(System.out);
		
		while (t-- > 0) {
			String input=sc.next();
					
			Stack<Character> s1 = new Stack<Character>();
			Stack<Character> s2 = new Stack<Character>();
			Stack<Character> s3 = new Stack<Character>();
		
			boolean f1 = true;
			boolean f2 = true;
			boolean f3 = true;
			
			for(int i=0; i < input.length(); i++){
				if(input.charAt(i) == '{') s1.push(input.charAt(i));
				
				else if(input.charAt(i) == '}') {

				if(s1.isEmpty()){
					f1 = false;
					break;
				}
				else s1.pop();
				}
			}
			
			for(int i=0; i < input.length(); i++){
				if(input.charAt(i) == '(') s2.push(input.charAt(i));
				
				else if(input.charAt(i) == ')') {
				if(s2.isEmpty()){
					f2 = false;
					break;
				}
				else s2.pop();
				}
			}
			
			for(int i=0; i < input.length(); i++){
				if(input.charAt(i) == '[') s3.push(input.charAt(i));
				
				else if(input.charAt(i) == ']') {
				if(s3.isEmpty()){
					f3 = false;
					break;
				}
				else s3.pop();
				}
			}
			
			
			pw.println(f1&&f2&&f3&&s1.isEmpty()&&s2.isEmpty()&&s3.isEmpty() == true? true:false);
			
	}

	pw.flush();
}
}



