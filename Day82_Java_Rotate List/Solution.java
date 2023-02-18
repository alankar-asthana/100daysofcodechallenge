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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
        
        ListNode temp=head;
        int len=1;
        while(temp.next!=null){
                temp=temp.next;
                len++;
        }
        k=k%len;
        for(int i=0;i<k;i++){
            temp=head;
            ListNode prev=null;
            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            temp.next=head;
            head=temp;
            prev.next=null;
        }
        return head;
    }
}
