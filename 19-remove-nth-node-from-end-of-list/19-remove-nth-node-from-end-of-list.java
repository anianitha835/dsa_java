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
        int length=findLength(head);
        //if(length==1 &&n==1) return null;
        ListNode cur=head;
        int i=0;
        ListNode prev=cur;
        while(i<(length-n)){
            prev=cur;
            cur=cur.next;
           
            i++;
        }
         if(i==0) return head.next;   
            
        prev.next=cur.next;
        return head;
        
        
    }
    public static int findLength(ListNode head){
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
            
        }
        return len;
    }
}