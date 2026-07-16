/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeList(ListNode head1,ListNode head2){
        ListNode dummy=new ListNode(-1);
        ListNode temp1=head1;
        ListNode temp2=head2;
        ListNode temp=dummy;
        while(temp1!=null && temp2!=null){
            temp.next=temp1;
            temp=temp1;
            temp1=temp1.next;
            temp.next=temp2;
            temp=temp2;
            temp2=temp2.next;

        }
        if(temp1!=null) temp.next=temp1;
        if(temp2!=null) temp.next=temp2;
        return dummy.next;
    }
     public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        ListNode frwd=null;
        while(curr!=null){
            frwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=frwd;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode r=slow.next;
        slow.next=null;
        r=reverseList(r);
        mergeList(head,r);
    }
}
