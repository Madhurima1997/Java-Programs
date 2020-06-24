public int removeElement(int[] nums, int val) {
        int i=0,j;
        for(j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];//replacing array element if not matched with given value
                i++;
            }
        }
        return i;
    }
