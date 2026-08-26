
/*
 * LeetCode 234 - Palindrome Linked List
 * https://leetcode.com/problems/palindrome-linked-list/
 *
 * Pattern: Fast & Slow Pointers + Linked List Reversal
 *
 * Approach:
 * - Use slow and fast pointers to find the middle.
 * - For an odd-length list, skip the middle node.
 * - Reverse the second half.
 * - Compare the first half with the reversed second half.
 *
 * Time: O(n)
 * Space: O(1)
 */

public class palindromeLinkedList {

    static ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        slow = reverse(slow);
        fast = head;

        while (slow != null && fast != null) {
            if (fast.val != slow.val) {
                return false;
            }

            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }
}