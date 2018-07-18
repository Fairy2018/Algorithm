//198. House Robber
//这道题有点奇怪，当输入[1,1,1,1]的时候我自己的编译器结果是正确的，但是在LeetCode里面就是错的
class Solution {
    private static int[] store=new int[1000];
    static int robber(int n,int[] nums){
        if(store[n]!=0) return store[n];
        if(n==0) return nums[0];
        if(n==1) return nums[1];
        if(n==2) return nums[0]+nums[2];
        else {
            int res=nums[n]+(robber(n-2,nums)>=robber(n-3,nums)?robber(n-2,nums):robber(n-3,nums));
            store[n]=res;
            return res;
        }
    }
    public static int rob(int[] nums) {
        int len=nums.length;
        if(len==0) return 0;
        if(len==1) return nums[0];
        if(len==2) return nums[0]>nums[1]?nums[0]:nums[1];
        int res1=robber(len-1,nums);
        int res2=robber(len-2,nums);
        return res1>=res2?res1:res2;
    }
}