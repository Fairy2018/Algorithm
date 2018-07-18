//第一次的解答，一个一个遍历相加
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        int[] two=new int[2];
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
            if(nums[i]+nums[j]==target)  {two[0]=i;two[1]=j;}
            }
        }
        return two;
    }
}
/*第二种解法，先排序再进行查找
其实这种解法是错误的。
因此排序之后，各个数之间的位置已经改变了，也就是下标和之前的不一样。
不过我学习了什么是快速排序，而且快速排序不用额外的空间，只需要在原来的数组中进行排序就行了。*/
class Solution{
public void quickSort(int[] a){
  if(a.length>0){
    quickSort(a,0,a.length-1);
  }
}
public void quickSort(int[] a,int low,int high){
  if(low>high){
    return;
  }
int key=a[low];
  int i=low;
  int j=high;
while(i<j){
    while(i<j&&a[j]>=key) {j--;}    
    while(i<j&&a[i]<=key) {i++;}
    if(i<j){
      int temp=a[high];
      a[high]=key;
      key=temp;
    }
    int p=a[i];
    a[i]=a[low];
    a[low]=p;
    quickSort(a,low,i-1);
    quickSort(a,i+1,high);
  }
}
  public int[] twoSum(int[] nums,int target){
int len=nums.length;
int[] newNums=new int[len];
int[] two=new int[2];
//排序算法
quickSort(nums);
//进行查找遍历
int low=0;
int high=len-1;
while(low<high){
  int sum=nums[low]+nums[high];
  if(sum==target) {two[0]=low;two[1]=high;break;}
  else
if(sum<target) low=low+1;
      else high=high-1;
}
return two;
}
}
//第三种解法，使用map
class Solution{
  public int[] twoSum(int[] nums,int target){
int len=nums.length;
int[] two=new int[2];
HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<len;i++){
  int key=target-nums[i];
  if(map.containsKey(nums[i])) {
if(map.get(nums[i])<=i){
two[0]=map.get(nums[i]);two[1]=i;break;
}
        else {two[0]=i;two[1]=map.get(nums[i]);break;}
      }
      else {map.put(key,i);}
}
return two;
}
}