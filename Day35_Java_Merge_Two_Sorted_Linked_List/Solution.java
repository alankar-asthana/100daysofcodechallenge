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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode head=null;
        if(list1==null&&list2==null)
            return head;
        if(list1==null&&list2!=null)
            return head=list2;
        if(list2==null&&list1!=null)
            return head=list1;

        ListNode tail=new ListNode(0);
        head=tail;
        while(list1!=null || list2!=null){

            if(list1==null&&list2!=null){
                tail.next=list2;
                list2=list2.next;
            }
            else if(list2==null&&list1!=null){
                tail.next=list1;
                list1=list1.next;
            }
            else if(list1.val<=list2.val){
                tail.next=list1;
                list1=list1.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
            }
            tail=tail.next;
        }
        head=head.next;
        return head;
    }
}
