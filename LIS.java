 public int lengthOfLIS(int[] nums) {
        int max=0,i,j;
        int lis[]=new int[nums.length];// declaring dp for storing the indexes of the subsequence digits
        for(i=0;i<nums.length;i++) // initialising with one as every number in itself is a subsequence
            lis[i]=1;
        for(i=1;i<nums.length;i++){
            for(j=0;j<=i;j++){
                if(nums[i]>nums[j] && lis[i]<=lis[j]) //checking if it's strictly increasing and if we have a subsequence or not
                    lis[i]=1+lis[j]; // incrementing the indexes
            }
        }
        //finding the longest subsequence
        for(i=0;i<lis.length;i++){
            if(lis[i]>max)
                max=lis[i];
        }
        return max;
    }
