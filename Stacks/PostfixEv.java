import java.util.Scanner;
import java.util.Stack;
import java.io.PrintWriter;

public class PostfixEv {


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