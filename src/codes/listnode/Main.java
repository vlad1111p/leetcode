package codes.listnode;

import codes.ListNode;

public class Main {

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode listNode = new ListNode();

        while (l1.next != null) {

            listNode.val = (l1.val + l2.val) % 10;
            l1 = l1.next;
            l2 = l2.next;
            ListNode listNode1 = new ListNode();
            listNode.next = listNode1;
            listNode = listNode1;
        }
        return listNode;
    }
}
