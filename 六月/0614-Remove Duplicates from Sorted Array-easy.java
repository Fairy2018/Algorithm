//第26题，这道题写出来效率还挺高的。
//学习一点，为什么返回一个int型，能够返回的是数组的前int个数据呢？我猜应该是内部有另外一个函数。
class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        if(len<2) return len;
        int index=1;
        for(int i=1;i<len;i++){
               if(nums[i]!=nums[i-1]) {nums[index]=nums[i];index++;}
        } 
        return index;
    }
}