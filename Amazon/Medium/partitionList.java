
/*
 * LeetCode 86 - Partition List
 * https://leetcode.com/problems/partition-list/
 *
 * Pattern: Linked List
 *
 * - Create two lists: one for nodes < x and one for nodes >= x.
 * - Traverse the original list only once.
 * - Attach each node to the appropriate list.
 * - Connect the before list to the after list.
 * - Use dummy nodes to easily build both lists.
 *
 * Time: O(n)
 * Space: O(1)
 */

public class partitionList {
    class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

    public ListNode partition(ListNode head, int x) {

        ListNode before_head = new ListNode(0);
        ListNode before = before_head;

        ListNode after_head = new ListNode(0);
        ListNode after = after_head;

        while (head != null) {

            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }

            head = head.next;
        }

        after.next = null;
        before.next = after_head.next;

        return before_head.next;
    }
}