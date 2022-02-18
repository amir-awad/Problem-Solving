class Solution {
    public int romanToInt(String s) {
        
        int ans=0;
        int i;
        for(i=0; i< s.length()-1;i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            
            if(c1=='I'){
                if(c2!='V'&&c2!='X')
                    ans+=1;
                else{
                    if(c2=='V')
                        ans+=4;
                    else 
                        ans+=9;
                    i++;
                }
            }
            
            else if(c1=='X'){
                if(c2!='L'&&c2!='C')
                    ans+=10;
                else{
                    if(c2=='L')
                        ans+=40;
                    else 
                        ans+=90;
                    i++;
                }
            }
            
            else if(c1=='C'){
                if(c2!='D'&&c2!='M')
                    ans+=100;
                else{
                    if(c2=='D')
                        ans+=400;
                    else 
                        ans+=900;
                    i++;
                }
            }
            
            else if(c1=='V') ans+=5;
            else if(c1=='L') ans+=50;
            else if(c1=='D') ans+= 500;
            else ans+=1000;
        }
        if(i==s.length()-1){
            char c = s.charAt(i);
            if(c=='I') ans+=1;
            else if(c=='X') ans+=10;
            else if(c=='C') ans+=100;
            else if(c=='V') ans+=5;
            else if(c=='L') ans+=50;
            else if(c=='D') ans+= 500;
            else ans+=1000;
        }
        return ans;
    }
}