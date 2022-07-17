package org.vishal.dsa.problems.list;

public class RemoveNode {

    public static void deleteNode(ListNode node) {
        ListNode prev = node;
        while (node.next != null) {
            prev = node;
            node.val = node.next.val;
            node = node.next;
        }
        prev.next = null;
    }

}
