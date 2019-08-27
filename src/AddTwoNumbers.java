/**
 * @author Jacob
 * @date 2018/7/10
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int up = (l1.val + l2.val) / 10;

        ListNode result = new ListNode((l1.val + l2.val) % 10);

        ListNode p = result;

        while((l1 != null && l1.next != null) || (l2 != null && l2.next != null) || up != 0) {
            l1 = (l1 != null ? l1.next: null);
            l2 = (l2 != null ? l2.next: null);
            int v1 = (l1 == null ? 0 : l1.val);
            int v2 = (l2 == null ? 0 : l2.val);
            int temp = v1 + v2 + up;
            up = temp / 10;
            p.next = new ListNode(temp % 10);
            p = p.next;

        }

        return result;
    }


    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(8);

        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);

        System.out.print("[");
        while (result != null) {

            System.out.print(result.val);

            result = result.next;
            if (result != null) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}


 class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
