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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null ||head==null) return null;
        ListNode fast=head,slow=head,temp=head;
        while(fast.next!=null){
             
            if(fast.next.next==null) {
                fast=fast.next;
                slow=slow.next;
            }
            else {
                fast=fast.next.next;
                slow=slow.next;
            }
        }
        
        while(temp.next!=slow){
            temp=temp.next;
        }
       
        temp.next=slow.next;
        temp=head;
     return temp;
    }
}