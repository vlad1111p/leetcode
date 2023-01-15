package codes.middlenode;

import codes.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public ListNode middleNode(ListNode head) {

        List<ListNode> listOfNumber = new ArrayList<>();
        while (head != null) {
            listOfNumber.add(head);
            head = head.next;
        }

        return listOfNumber.get(listOfNumber.size() / 2);
    }
}
