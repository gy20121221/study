package aost;

public class Ams4 {
    public static void main(String[] args) {

        ListNode a=new ListNode(2);
        ListNode b=new ListNode(7);
        ListNode c=new ListNode(6);
        ListNode d=new ListNode(6);
        a.next=b;
        b.next=c;
        c.next=d;
        sc(a);
        ListNode a1 = ReverseList(a);
        sc(a1);

    }


    //输出链表
    private static ListNode sc(ListNode head) {
        if (head==null)
            return null;
        ListNode next;
        next=head;
        while (head!=null){
            System.out.print(next.val);
            next=head.next;
            head=head.next;
        }
        System.out.println();
        return null;
    }

    public static ListNode ReverseList(ListNode head) {
            if (head == null)
                return null;
            ListNode next;
            ListNode pre = null;
            while (head != null) {
                next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            return pre;
        }

        //链表
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    //判断链表是否有环
    public boolean hasCycle(ListNode head) {

        if (head ==null)
            return  false;
        ListNode next;
        ListNode pre=null;
        while (head!=null)
        {
            

        }



        return  false;
    }



}
