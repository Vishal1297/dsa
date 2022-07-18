package org.vishal.dsa.problems.list;

public class FindKthFromLast {

    public static int findKth(ListNode head, int k){
        if (head == null) return -1;
        int length = getLength(head);
        ListNode temp = head;
        while (temp != null && (length - k) != 0){
            temp = temp.next;
            k++;
        }
        return temp == null ? -1 : temp.val;
    }

    public static int getLength(ListNode head){
        int len = 0;
        ListNode temp = head;
        while (temp != null){
            temp = temp.next;
            len++;
        }
        return len;
    }
}
