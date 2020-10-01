package com.company.easy.linkedlist.easy;

import com.company.easy.linkedlist.ListNode;

public class GetDecimalValue {
//So if we get 1, we assume it’s just 1. Then we encounter 2. At this point, we realize that the previous was is no longer just a 1 but (1 x 10). So we do that arithmetic and then add the current value. This is how is looks like in tabular form.
//
//Loop	Character	Operation	  Result
//1	    ‘1’	        1	          1
//2	    ‘2’	        (1x10) + 2	  12
//3	    ‘3’	        (12*10) + 3	  123
//Note: Operation is always the previous multiplied by the counting system. In this this, we're doing decimal so x10. If we were doing hex, it'll x16. Binary will be x 2.
//
//Using this logic, let’s come back to binary. It’s exactly the same except for instead of multiplying by 10 when we encounter the next digit, we multiply by 2. So If we have a LinkeList 1 -> 0 -> 1 and apply the same logic, this is how it'll be
//
//Loop	Character	Operation	  Result
//1	    ‘1’	        1	          1
//2	    ‘0’	        (1x2) + 0	  2
//3	    ‘1’	        (2*2) + 1	  5

    public static int getDecimalValue(ListNode head) {
        int result = head.val;
        while (head.next != null) {
            result = result * 2 + head.next.val;
            head = head.next;
        }
        return result;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
//        listNode.next = new ListNode(0);
//        listNode.next.next = new ListNode(1);
        System.out.println(getDecimalValue(listNode));
    }
}
