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
    public ListNode reverseList(ListNode head){
        ListNode prev=null,curr=head,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            }
        return prev;
        
  }      
        
        
        
    public boolean isPalindrome(ListNode head) {
        ListNode sp=head,fp=head;
        while(fp!=null && fp.next!=null){
            sp=sp.next;
            fp=fp.next.next;
         }
        sp=reverseList(sp);
        fp=head;
        if(sp==fp) return true;
        while(sp!=null && fp!=null){
            if(sp.val!=fp.val) return false;
            fp=fp.next;
            sp=sp.next;
            }
        return true;
                
    }
}