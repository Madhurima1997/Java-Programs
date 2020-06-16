 //The function to return the zigzag pattern
 public String convert(String s, int numRows) {
        if(numRows==1)
            return s;
        else{
        String cons[]=new String[numRows];
        for(int i=0;i<numRows;i++)
            cons[i]="";
        int x=0;
        StringBuilder str=new StringBuilder();
        boolean move=false;
        for(int i=0;i<s.length();i++){
            cons[x]=cons[x]+s.charAt(i);
            if(x==0 || x== numRows-1)
                move=!move;
            if(move==true)
                x++;
            else
                x--;
        }
        for(int i=0;i<numRows;i++){
            str.append(cons[i]);
        }
           
        return str.toString();
    }
    }
