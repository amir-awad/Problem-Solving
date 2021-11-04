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
					
			Stack<Character> s = new Stack<Character>();
        
			boolean f = true;
			for(int i=0; i < input.length(); i++){
				
				if(input.charAt(i) == '[' || input.charAt(i) == '(' || input.charAt(i) == '{') s.push(input.charAt(i));
				
				 else if(!s.isEmpty() && ((input.charAt(i) == ']'&& s.peek()!='[') || (input.charAt(i) == ')'&& s.peek()!='(') || (input.charAt(i) == '}'&& s.peek()!='{'))) {
                       			 f = false;
                       			 break;
				 }
                
               			else if(s.isEmpty() && ((input.charAt(i) == ']') || (input.charAt(i) == ')') || (input.charAt(i) == '}'){))
					   f = false;
					    break;
				}
				
			
				else s.pop();
                
			}

			System.out.println(f&&s.isEmpty()==true?true:false);
		}

	pw.flush();
}
}



