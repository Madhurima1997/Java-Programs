 public String removeDuplicates(String s, int k) {
        if(s.length()<=k)
            return s;
        Stack<Character>buff=new Stack<Character>();
        int i=0,c=0;
        boolean flag=true;
        while(i<s.length()){
            if(buff.empty()){
                buff.push((Character)s.charAt(i));//pushing each character
                
            }
            else if((Character)s.charAt(i)!=(Character)buff.peek()){
                buff.push((Character)s.charAt(i));
                c=0;
            }
            else{
                c++;// keeping a check if 'k' consecutive duplicate characetrs have been pushed
                buff.push(s.charAt(i));
                if(c==k-1){
                    flag=false;
                    for(int j=0;j<k;j++)
                        buff.pop(); //removing the 'k' consecutive characters in a go.
                    c=0;
                }
            }
            i++;
        }
        String ans="";
        while(!buff.empty())
            ans=(char)buff.pop()+ans;//forming the modified string
       if(flag==true)
           return s;//if no more removal can be done then return the same string
        else 
            return removeDuplicates(ans,k);//recursively send back the newly formed string for further removals
    }
