public class LinkedList {
	ListNode head;
	LinkedList(int x){
		this.head=new ListNode(x);
	}
	LinkedList(int[] x){
		this(x[0]);
		int len=x.length;
		if(len>1) {
			ListNode n1=new ListNode(x[1]);
			this.head.next=n1;
			for(int i=2;i<len;i++) {
				n1.next=new ListNode(x[i]);
				n1=n1.next;
			}
		}
	}
	@Override
	public String toString() {
		ListNode s=this.head;
		StringBuilder str=new StringBuilder("");
		while(s!=null) {
			str.append(s.val+"->");
			s=s.next;
		}
		str.append("null");
		return str.toString();
	}
	class ListNode{
		int val;
	    ListNode next;
	    ListNode(int x){
		val=x; 
		}
	}
}

