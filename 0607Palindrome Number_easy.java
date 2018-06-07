/*Determine whether an integer is a palindrome. 
An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.*/

//思路：先reverse，再与被判断数相减，结果为0则判断为回文
class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int xyuan=x;
        while(x!=0){
            reverse=reverse*10+x%10;
            x=x/10;
        }
        return (Math.abs(reverse)-xyuan==0);
    }
}