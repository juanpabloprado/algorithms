/* Given a non-empty linked list, return the middle node of the list.
If the linked list contains an even number of elements, return the node closer to the end. */
public class FindMiddleElement {
    public static void main(String[] args) {
        // 1->2->3->null, returns 2
        // 1->2->3->4->null, returns 3
        // 1->null, returns 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.println(findMiddleElement(head).val);
    }

    public static ListNode findMiddleElement(ListNode head) {
        int count = 0;
        ListNode dummy = head;
        while (dummy != null) {
            dummy = dummy.next;
            count++;
        }

        for (int i = 0; i < count / 2; i++) {
            head = head.next;
        }

        return head;
    }
}
