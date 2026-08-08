// Last updated: 8/8/2026, 8:27:40 PM
1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        int fivesCounter = 0, tensCounter = 0;
4        for(int i = 0; i < bills.length; i++) {
5            if(bills[i] == 5) fivesCounter++;
6            else if(bills[i] == 10 && fivesCounter != 0) {
7                fivesCounter--;
8                tensCounter++;
9            }
10            else {
11                if(tensCounter > 0 && fivesCounter > 0) {
12                    fivesCounter--;
13                    tensCounter--;
14                }
15                else if(fivesCounter >= 3) {
16                    fivesCounter -= 3;
17                }
18                else {
19                    return false;
20                }
21            }
22        }
23        return true;
24    }
25}