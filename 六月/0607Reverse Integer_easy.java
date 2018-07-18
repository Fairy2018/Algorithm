/*题目描述
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers 
within the 32-bit signed integer range: [−2^31,  2^31 − 1]. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.*/
/*我的思路：
先分为两种情况：正数或者负数；如果是负数，当成正数处理，最后加上负号；不过不知道是不是多此一举。
主要是用这个语句判断：reverseInteger=reverseInteger*10+x%10;
判断是否溢出：就reverse回去，如果结果等于原来的值就没有溢出，否则有溢出返回0；*/
class Solution {
    public int reverse(int x) {
        int xx=x;
        x=Math.abs(x);
        int reverseInteger=0;
        int overflow=0;
        while(x!=0){
            overflow=reverseInteger;
            reverseInteger=reverseInteger*10+x%10;
            if((reverseInteger-x%10)/10!=overflow) return 0;
            x=x/10;
        }
        if(xx<0) return -reverseInteger;
        return reverseInteger;
    }
}
/*删了分成正负数的部分。
  那我在这里就有个疑问了：(这算是一个问题了(#^.^#))
  内部在计算的时候是把符号位单独了对吧哈哈哈。*/
class Solution {
    public int reverse(int x) {
        int reverseInteger=0;
        int overflow=0;
        while(x!=0){
            overflow=reverseInteger;
            reverseInteger=reverseInteger*10+x%10;
            if((reverseInteger-x%10)/10!=overflow) return 0;
            x=x/10;
        }
        return reverseInteger;
    }
}