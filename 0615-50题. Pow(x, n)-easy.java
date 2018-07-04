
//第50题. Pow(x, n)
//不是很明白这道题要我做什么
//提一个问题，java如何表示无穷大
class Solution {
    public double myPow(double x, int n) {
        double result=1;
        if(n==0) return result;
        return Math.pow(x,n);
    }
}