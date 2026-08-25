/*
 * LeetCode 160 - Intersection of Two Linked Lists
 *
 * Pattern: Two Pointers
 *
 * - p1 starts at headA, p2 starts at headB.
 * - When a pointer reaches null, switch it to the other head.
 * - Both pointers then travel A + B distance.
 * - If they intersect, p1 == p2 at the intersection node.
 * - If not, both become null.
 *
 * Important:
 * Compare nodes using p1 == p2, NOT p1.val == p2.val.
 *
 * Time: O(n + m)
 * Space: O(1)
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class joinLinkedList{

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {
            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }

        return p1;
    }
}