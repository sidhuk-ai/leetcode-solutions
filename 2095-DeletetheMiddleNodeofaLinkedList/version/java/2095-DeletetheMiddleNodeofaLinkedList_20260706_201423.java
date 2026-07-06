// Last updated: 7/6/2026, 8:14:23 PM
// used fast and slow pointers to find mid and also used temp which runs one step slower than slow to make deletion easy
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteMiddle(ListNode head) {
13        if(head == null || head.next == null) return null;
14        ListNode slow = head;
15        ListNode fast = head;
16        ListNode temp = null;
17        while(fast != null && fast.next != null) {
18            temp = slow;
19            slow = slow.next;
20            fast = fast.next.next;
21        }
22        temp.next = slow.next;
23        return head;
24    }
25}