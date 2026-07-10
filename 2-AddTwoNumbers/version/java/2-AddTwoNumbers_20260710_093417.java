// Last updated: 7/10/2026, 9:34:17 AM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode pointer1 = l1;
14        ListNode pointer2 = l2;
15
16        ListNode l3 = null;
17        ListNode temp = null;
18        int carry = 0;
19        while(pointer1 != null && pointer2 != null) {
20            int sum = pointer1.val + pointer2.val + carry;
21            int lastDigit = sum % 10;
22            carry = sum / 10;
23            pointer1 = pointer1.next;
24            pointer2 = pointer2.next;
25            if(temp == null && l3 == null) {
26                temp = new ListNode(lastDigit);
27                l3 = temp;
28            } else {
29                temp.next = new ListNode(lastDigit);
30                temp = temp.next;
31            }
32        }
33        while(pointer1 != null) {
34            int sum = pointer1.val + carry;
35            int lastDigit = sum % 10;
36            carry = sum / 10;
37            pointer1 = pointer1.next;
38            if(temp == null && l3 == null) {
39                temp = new ListNode(lastDigit);
40                l3 = temp;
41            } else {
42                temp.next = new ListNode(lastDigit);
43                temp = temp.next;
44            }
45        }
46        while(pointer2 != null) {
47            int sum = pointer2.val + carry;
48            int lastDigit = sum % 10;
49            carry = sum / 10;
50            pointer2 = pointer2.next;
51            if(temp == null && l3 == null) {
52                temp = new ListNode(lastDigit);
53                l3 = temp;
54            } else {
55                temp.next = new ListNode(lastDigit);
56                temp = temp.next;
57            }
58        }
59        if(carry > 0) {
60            temp.next = new ListNode(carry);
61            temp = temp.next;
62        }
63        return l3;
64    }
65}