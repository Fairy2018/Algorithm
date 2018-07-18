//今天看了一点动态规划，然后我想问的是，之前说的求爬梯子有几种方法那个问题是这么写吗？
//感觉就是利用递归求解，是这样子的吗？
public class ClimbLadder {
	private int times;
	public int count(int n) {
		int count=0;
		if(n==1) count=1;
		if(n==2) count=2;
		if(n>2) count=count(n-1)+count(n-2);
		return count;
	}
	ClimbLadder(int n){
		this.times=this.count(n);
		System.out.println("爬"+n+"层梯子一共有"+this.times+"种方法！");
	}
}