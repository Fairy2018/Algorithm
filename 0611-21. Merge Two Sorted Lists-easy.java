/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null) return null;
        if(l1!=null&&l2==null) return l1;
        if(l2!=null&&l1==null) return l2;
        ListNode l3=new ListNode(l1.val<=l2.val?l1.val:l2.val);
        ListNode p=l3;
        if(l1.val<=l2.val) {l1=l1.next;}
        else {l2=l2.next;}
        while(l1!=null&&l2!=null){
            p.next=new ListNode(l1.val<=l2.val?l1.val:l2.val);
            p=p.next;
            if(l1.val<=l2.val) {l1=l1.next;}
            else {l2=l2.next;}
        }
        if(l1!=null) p.next=l1;
        if(l2!=null) p.next=l2;
        return l3;
    }
}