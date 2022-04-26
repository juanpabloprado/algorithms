/* Given a linked list and a value n, remove the nth to last node and return the resulting list. */
public class RemoveNthToLastNode {
    public static void main(String[] args) {
        // 1->2->3->null, n = 1, returns 1->2->null
        // 1->2->3->null, n = 2, returns 1->3->null
        // 1->2->3->null, n = 3, returns 2->3->null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        System.out.println(removeNthToLastNode(head, 3));
    }

    public static ListNode removeNthToLastNode(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
