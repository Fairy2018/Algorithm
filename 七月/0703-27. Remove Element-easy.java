class Solution {
    public int removeElement(int[] nums, int val) {
        int len=nums.length;
        if(len==0) return 0;
        if(len==1&&nums[0]==val) return 0;
        if(len==1&&nums[0]!=val) return 1;
        int low=0;
        int high=len-1;
        while(low<high){
            if(nums[low]==val){
               while(nums[high]==val&&high>low){--high;}
                if(high==low) return low;
                int exch=nums[high];
                nums[high]=nums[low];
                nums[low]=exch;
                --high; 
            }
            ++low;
        }
        return nums[low]==val?low:low+1;
    }
}