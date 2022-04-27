/* Given a linked list, containing unique numbers, return whether it has a cycle.
Note: a cycle is a circular arrangement (i.e. one node points back to a previous node) */
public class ContainsCycle {
    public static void main(String[] args) {
        // 1->2->3->1 -> true (3 points back to 1)
        // 1->2->3 -> false
        // 1->1 true (1 points to itself)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = head;
        System.out.println(containsCycle(head));
    }

    public static boolean containsCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
