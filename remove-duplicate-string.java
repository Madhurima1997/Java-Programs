public String removeDuplicates(String S) {
        int i=0;
        while(i<S.length()-1){
            if(S.charAt(i)==S.charAt(i+1)){
                return removeDuplicates(S.substring(0, i) + S.substring(i + 2));
            }
            else
                i++;
        }
        return S;
    }
