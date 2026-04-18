package LinkedList;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode list : lists) {
            if (list != null) {
                pq.add(list);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(!pq.isEmpty()){
            ListNode minNode = pq.poll();
            tail.next = minNode;
            tail = tail.next;
            if (minNode.next != null) {
                pq.add(minNode.next);
        }
	}
    return dummy.next;
    }
}

