// Last updated: 7/6/2026, 8:06:52 PM
// Approached this question using one even and one odd pointer
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
12    public ListNode oddEvenList(ListNode head) {
13        if(head == null) return null;
14        if(head.next == null || head.next.next == null) return head;
15        ListNode odd = head;
16        ListNode even = head.next;
17        ListNode evenPointer = even;
18        while(odd != null && even != null) {
19            if(even.next == null) {
20                odd.next = evenPointer;
21                return head;
22            }
23            odd.next = even.next;
24            odd = odd.next;
25            even.next = odd.next;
26            even = even.next;
27        }
28        odd.next = evenPointer;
29        return head;
30    }
31}