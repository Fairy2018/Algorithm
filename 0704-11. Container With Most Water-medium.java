//11. Container With Most Water
class Solution {
    public int maxArea(int[] height) {
        int len=height.length;
        if(len==0&&len==1) return 0;
        int low=0;
        int high=len-1;
        int result=0;
        while(low<high){
            int min=height[low]<=height[high]?height[low]:height[high];
            int sum=(high-low)*min;
            if(sum>result) result=sum;
            if(height[low]<=height[high]) low++;
            else high--;
        }
        return result;
    }
}