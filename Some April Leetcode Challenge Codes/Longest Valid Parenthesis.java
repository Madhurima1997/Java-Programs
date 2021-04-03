class Solution {
    public int longestValidParentheses(String s) {
        if(s==null)
            return 0;
        else if(s.length()<2)
            return 0;
        else{
            Stack<Integer> st= new Stack<>();
            st.push(-1);
            int i, res=0;
            for(i=0;i<s.length();i++){
                if(s.charAt(i)=='(') //pushing the current index on reaching a '('
                    st.push(i);
                else{ // whenever a closing parenthesis is reached, pop out the topmost index, then calculate the maximum length using "current index-topmost index"
                    st.pop();
                    if(st.empty()){
                        st.push(i);
                    }
                    else{
                        res=Math.max(res,i-st.peek());
                    }
                }
            }
            return res;
        }
    }
}
