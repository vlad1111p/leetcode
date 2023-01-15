package codes.cycle;

import codes.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public ListNode detectCycle(ListNode head) {

        Set<ListNode> map = new HashSet<>();

        while (head != null) {
            if (map.contains(head)) {
                return head;
            }
            map.add(head);
            head = head.next;
        }
        return null;
    }
}
