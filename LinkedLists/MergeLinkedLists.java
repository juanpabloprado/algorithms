/* Given two sorted linked lists,
merge them together in ascending order and return a reference to the merged list */
public class MergeLinkedLists {

    public static void main(String[] args) {
        // list1 = 1->2->3, list2 = 4->5->6->null, returns 1->2->3->4->5->6->null
        // list1 = 1->3->5, list2 = 2->4->6->null, returns 1->2->3->4->5->6->null
        // list1 = 4->4->7, list2 = 1->5->6->null, returns 1->4->4->5->6->7->null
        ListNode head1 = new ListNode(4);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(7);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(5);
        head2.next.next = new ListNode(6);

        System.out.println(mergeLists(head1, head2));

    }

    public static ListNode mergeLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }

        if (l1 != null) {
            dummy.next = l1;
        } else {
            dummy.next = l2;
        }

        return head.next;
    }
}
