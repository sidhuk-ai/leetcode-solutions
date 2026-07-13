// Last updated: 7/13/2026, 11:02:41 PM
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if(head == null) return head;
14        int size = 1;
15        ListNode temp = head;
16        while(temp.next != null) {
17            size++;
18            temp = temp.next;
19        }
20        int rotationSteps = k%size;
21
22        ListNode temp2 = head;
23        for(int i = 0; i < size-rotationSteps-1; i++) {
24            temp2 = temp2.next;
25        }
26        temp.next = head;
27        head = temp2.next;
28        temp2.next = null;
29        return head;
30    }
31}