class Solution {
    public String countAndSay(int n) {
        String x="1",ns="";
        int i=0,k=1;
        while(n!=1){
            ns="";i=0;
            while(i<x.length()){
                k=1;// to keep a count of the digits
                while(i+1<x.length() && x.charAt(i+1)==x.charAt(i)){//taking count
                    k++;i++;
                }
                ns+=Integer.toString(k)+x.charAt(i);//forming the count n say first part is the count seconf is the digit
                i++;
            }
            n--;
            x=ns;
        }
        return x;
    }
}
