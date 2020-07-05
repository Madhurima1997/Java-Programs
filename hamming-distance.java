public int hammingDistance(int x, int y) {
        int k=0;
        while(x>0 && y>0){
            if(x%2 != y%2)
                k++;
            x/=2;
            y/=2;
        }
        if(x>0){
            while(x>0){
                if(x%2==1)
                    k++;
                x/=2;
            }            
        }
        if(y>0){
            while(y>0){
                if(y%2==1)
                    k++;
                y/=2;
            }            
        }
        return k;
    }
