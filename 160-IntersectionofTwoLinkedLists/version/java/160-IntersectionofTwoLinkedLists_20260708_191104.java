// Last updated: 7/8/2026, 7:11:04 PM
// to find the intersection point of linked list with two heads first joined the tail with one of the header and using Tortoise&Hare pointer found the intersection point.
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode pointer1 = headA;
15
16        while(pointer1.next != null) {
17            pointer1 = pointer1.next;
18        }
19        pointer1.next = headA;
20
21        ListNode slow = headB;
22        ListNode fast = headB;
23        boolean isLoop = false;
24        while(fast != null && fast.next != null) {
25            slow = slow.next;
26            fast = fast.next.next;
27            if(fast == slow) {
28                slow = headB;
29                isLoop = true;
30                break;
31            }
32        }
33
34        if(!isLoop) {
35            pointer1.next = null;
36            return null;
37        }
38        // System.out.println(slow.next.val+" "+fast.next.val);
39        while(fast != slow) {
40            slow = slow.next;
41            fast = fast.next;
42        }
43        pointer1.next = null;
44        return slow;
45    }
46}