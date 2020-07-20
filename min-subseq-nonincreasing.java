class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer>l=new ArrayList<>();//declare a list
        int pair=0,rest=0,i,j=0;
        for (i = 0; i < nums.length; i++) //sorting in decreasing order to get the greatest sum pair (Greedy Approach)
        {
            for (int k = i + 1; k < nums.length; k++) 
            {
                if (nums[i] < nums[k]) 
                {
                    int temp = nums[i];
                    nums[i] = nums[k];
                    nums[k] = temp;
                }
            }
        }
        while(pair<=rest){ //keep iterating till we get a pair that has sum greater than the sum of the remaining elements
            j++;
            pair=0;rest=0;
            for(i=0;i<j;i++){ // sum of pair
                pair+=nums[i];
            }
            for(i=j;i<nums.length;i++)// sum of rest of elements
                rest+=nums[i];
        }
        for(i=0;i<j;i++){ // on getting the required subsequence, add into list
            l.add(nums[i]);
        }
        return l; // return list
    }
}
