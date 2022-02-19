class Solution {
   public static int lengthOfLongestSubstring(String s) {
        
		
		String str = "";
		int res=0;
		for(int k=0; k < s.length();k++){
			if(!str.contains(s.charAt(k) +"")){
			    str+= ""+ s.charAt(k);
			}
			
			else{
				
			    res = Math.max(res, str.length());
			    if(str.charAt(str.length()-1)==s.charAt(k)){
				    str = "";
			    }

			    else if(str.charAt(0)==s.charAt(k)){
				if(str.length()>1){
					str = str.substring(1, str.length());
				}
				else
					str = "";
				}
			
			    else{
				while(str.contains(s.charAt(k)+""))
				    str = str.substring(1,str.length());
				
				}

			    str+=s.charAt(k);
			}
			
		}
		if(str.length()>res) res = str.length();
		return res; //return the target string
	    
	}
}