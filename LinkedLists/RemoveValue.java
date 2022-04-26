/* Given a linked list and a value, remove all nodes containing the provided value, and return the resulting list. */
public class RemoveValue {
    public static void main(String[] args) {
        // 1->2->3->null, value = 3, return 1->2->null
        // 8->1->1->4->12->null, value = 1, return 8->4->12->null
        // 7->12->2->9->null, value = 7, return 12->2->9->null
        ListNode head = new ListNode(8);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(12);

        System.out.println(removeValue(head, 1));
    }

    public static ListNode removeValue(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode dummy = head;
        while (dummy != null) {
            if (dummy.next != null && dummy.next.val == val) {
                dummy.next = dummy.next.next;
            } else {
                dummy = dummy.next;
            }
        }

        return head;
    }
}
