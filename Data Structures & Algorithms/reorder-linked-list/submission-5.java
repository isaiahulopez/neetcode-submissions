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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        
        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(second != null){
            ListNode nxt = second.next;
            second.next = prev;
            prev = second;
            second = nxt;
        }

        second = prev;
        while (second != null) {
            ListNode t1 = head.next, t2 = second.next;
            head.next = second;
            second.next = t1;
            head = t1;     
            second = t2;
        }
    }
}
