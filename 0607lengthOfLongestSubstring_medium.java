/*题目描述：
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. 
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

/*我的思路：
  利用set来判断是否出现重复的字母，用StringBuilder来存储substring
  如果出现重复的字母，就删除重复字母之前（包括该重复字母）的子串
  用一个sblen来存储子串的长度，如果子串变长，则赋值。
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int slen=s.length();
        if(slen==0&&s==null) return 0;
        StringBuilder sb=new StringBuilder();
        int sblen=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<slen;i++){
            if(!set.add(s.charAt(i))) {
            	String str=s.charAt(i)+"";
                int index=sb.indexOf(str);
                sb.delete(0,index+1);
            }
            sb.append(s.charAt(i));
            if(sblen<sb.length()) {
            sblen=sb.length();
            } 
        }
        return sblen;
    }
}