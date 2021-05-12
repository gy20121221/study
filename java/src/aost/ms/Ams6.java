package aost.ms;

public class Ams6 {
    public static void main(String[] args) {

        ListNode a = new ListNode(2);
        ListNode b = new ListNode(7);
        ListNode c = new ListNode(6);
        ListNode d = new ListNode(6);
        a.next = b;
        b.next = c;
        c.next = d;
        sc(a);

        sc(reverseKGroup(a, 2));

    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        // write code here
        if (head == null || head.next == null || k == 1) return head;
        int t = k - 1;
        ListNode p0 = null, p1 = head, p2 = head;
        while (p2 != null) {
            if (t != 0) {
                p2 = p2.next;
                t--;
            }
            if (t == 0 && p2 != null) {
                reverse(p1, p2);

                if (p0 == null) {
                    head = p2;
                } else {
                    p0.next = p2;
                }
                p0 = p1;
                p1 = p1.next;
                p2 = p1;
                t = k - 1;
            }
        }
        return head;
    }

    public static void reverse(ListNode head, ListNode tail) {
        ListNode p1 = head, p2 = head.next, p = head, last = tail.next;
        while (p2 != last && p2 != null) {
            p1.next = p2.next;
            p2.next = p;
            p = p2;
            p2 = p1.next;
        }
    }


    private static void ex(ListNode p1, ListNode p2) {
        ListNode z1 = p1;
        ListNode n1 = p1.next;
        ListNode z2 = p1;
        ListNode n2 = p2.next;
        if (z1 != p2 && n2 != null) {
            z1 = n1.next;
            n1.next = z2;
            z2 = n1;
            n1 = z1;
        }
    }


    //链表
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    private static ListNode sc(ListNode head) {
        if (head == null)
            return null;
        ListNode next;
        next = head;
        while (head != null) {
            System.out.print(next.val);
            next = head.next;
            head = head.next;
        }
        System.out.println();
        return null;
    }

}
