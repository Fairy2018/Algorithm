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
class Solution{
    public String convert(String s,int numRows){
        if(numRows==1) return s;
        List<StringBuilder> rows=new ArrayList<>();
        for(int i=0;i<Math.min(numRows,s.length());i++)
           rows.add(new StringBuilder());
        int curRow=0;
        boolean goingDown=false;
        for(char c:s.toCharArray()){
            rows.get(curRow).append(c);
            if(curRow==0||curRow==numRow-1) goingDown=!goingDown;
            curRow+=goingDown?1:-1;
        }
        StringBuilder ret=new StringBuilder();
        for(StringBuilder row:rows) ret.append(row);
        return ret.toString();
    }
}
直接寻址法
取关键字或者关键字的某个线性函数值为散列地址
数字分析法
平方取中法
折叠法
