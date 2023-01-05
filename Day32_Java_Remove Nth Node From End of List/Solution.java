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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return null;
        else{
            ListNode temp=head;
            ListNode prev=null;
            ListNode last=head;
            int j=1;
            while(last.next!=null){
                prev=last;
                last=last.next;
                j++;
            }
            if(n>j)
                return head;
            if(n==j){
                head=head.next;
                return head;
            }
            else{
                int pos=j-n;
                for(int i=0;i<pos;i++){
                    prev=temp;
                    temp=temp.next;
                }
                prev.next=temp.next;
                temp.next=null;
                return head;
            }
        }
    }
}
