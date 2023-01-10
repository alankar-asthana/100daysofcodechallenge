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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode start=head.next;
        ListNode temp=head;
        ListNode prev=null;
        ListNode curr=null;

            prev=temp;
            temp=temp.next;
            prev.next=temp.next;
            temp.next=prev;
            temp=prev.next;

        while(temp!=null){
            if(temp.next==null)
                return start;
            curr=prev;
            prev=temp;
            temp=temp.next;
            prev.next=temp.next;
            temp.next=prev;
            curr.next=temp;
            temp=prev.next;
        }
        return start;
    }
}
