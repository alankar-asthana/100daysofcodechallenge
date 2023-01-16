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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode temp=null;
        if(l1==null && l2==null)
            return head;
        if(l1==null && l2!=null)
            return l2;
        if(l2==null  && l1!=null)
            return l1;

        int carry=0,sum=0;
        while(l1!=null||l2!=null){
            sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            sum=sum%10;
            ListNode newnode = new ListNode(sum);
            if(temp==null){
                temp=head=newnode;
            }
            else{        
                temp.next=newnode;
                temp=temp.next;
            }
        }
        if(carry>0){
            ListNode newnode = new ListNode(carry);
            if(head==null){
                temp=head=newnode;
            }
            else{        
                temp.next=newnode;
                temp=temp.next;
            }    
        }
        return head;

    }
}
