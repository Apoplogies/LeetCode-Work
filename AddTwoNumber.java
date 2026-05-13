class AddTwoNumber {
    int carry = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode ans = answer;
        

        while (!(l1 == null && l2 == null)) {

            if (l1 == null) {
                int tempVal = determineCarryOver(l2.val);

                answer.next = new ListNode(tempVal);

                answer = answer.next;
                l2 = l2.next;
            }

            else if (l2 == null) {
                int tempVal = determineCarryOver(l1.val);

                answer.next = new ListNode(tempVal);

                answer = answer.next;
                l1 = l1.next;
            }

            else {
                int tempVal = determineCarryOver(l1.val, l2.val);

                answer.next = new ListNode(tempVal);

                answer = answer.next;
                l1 = l1.next;
                l2 = l2.next;
            }

        }

        if (carry == 1) {answer.next = new ListNode(1);}
        return ans.next;

    }

    public int determineCarryOver(int val1, int val2) {
        int tempVal = val1 + val2 + carry;
        if (tempVal >= 10) {
            carry = 1;
            tempVal = tempVal % 10;
        }
        else {
            carry = 0;
        }

        return tempVal;
    }
    public int determineCarryOver(int val1) {
        int tempVal = val1 + carry;
        if (tempVal >= 10) {
            carry = 1;
            tempVal = tempVal % 10;
        }
        else {
            carry = 0;
        }

        return tempVal;
    }
}
```
