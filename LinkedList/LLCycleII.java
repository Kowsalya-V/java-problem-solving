package LinkedList;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow= head;
        ListNode fast = head;
        ListNode pos = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                while(pos!=slow){
                    pos=pos.next;
                    slow = slow.next;
                }
                return pos;
            }
        }
        return null;
    }
}
