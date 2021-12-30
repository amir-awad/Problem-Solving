class Solution {
    public boolean isValid(String input) {
        Stack<Character> s = new Stack<Character>();
        
			boolean f = true;
			for(int i=0; i < input.length(); i++){
				
				if(input.charAt(i) == '[' || input.charAt(i) == '(' || input.charAt(i) == '{') s.push(input.charAt(i));
				
				 else if(!s.isEmpty() && ((input.charAt(i) == ']'&& s.peek()!='[') || (input.charAt(i) == ')'&& s.peek()!='(') || (input.charAt(i) == '}'&& s.peek()!='{'))) {
                       			 f = false;
                       			 break;
				 }
                
                else if(s.isEmpty() && ((input.charAt(i) == ']') || (input.charAt(i) == ')') || (input.charAt(i) == '}'))){
                   f = false;
                    break;
                }
				
				
			
				else s.pop();
                
			}

			return (f&&s.isEmpty()==true?true:false);
    }
}