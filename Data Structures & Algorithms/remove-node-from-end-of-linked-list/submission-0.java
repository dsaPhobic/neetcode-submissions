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
        int count = 0;
        ListNode current = head;
        while(current!=null){
            count++;
            current = current.next;
        }
        int index = count-n;
        if (index == 0) return head.next;
        ListNode res = head;
        int tmp = 0;
        while(res!=null){
            tmp++;
            if(tmp==index){
                res.next = res.next.next;
                break;
            }
            res = res.next;
        }
        return head;
    }
}
