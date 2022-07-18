package org.vishal.dsa.problems.list;

public class RemoveKthNodeFromLast {

    public static ListNode removeKthNode(ListNode head, int k){
        if (head == null) return null;
        int length = getLength(head);
        ListNode temp = head;
        if(length == k) {
            return temp.next;
        }
        while (temp != null && (length - k - 1) != 0){
            temp = temp.next;
            k++;
        }
        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
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
