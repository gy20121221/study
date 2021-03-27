package aost;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Ams4 {
    public static void main(String[] args) {

        ListNode a = new ListNode(2);
        ListNode b = new ListNode(7);
        ListNode c = new ListNode(6);
        ListNode d = new ListNode(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next=a;
//        sc(a);
//        ListNode a1 = ReverseList(a);
//        sc(a1);


        System.out.println(hasCycle(a));
        System.out.println(hasCycle1(a));
        System.out.println(hasCycle2(a));

    }


    //输出链表
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

    //反转链表
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


    //判断链表是否有环  快慢指针,
    public static boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode fast=head;
        ListNode low=head;
        while (fast!=null&&fast.next!=null){
            low=low.next;
            fast=fast.next.next;
            if (low==fast)
                return true;
        }
        return false;
    }

    //判断链表是否有环  Set存储指针 再比较 速度慢,空间浪费大
    public static boolean hasCycle1(ListNode head) {

        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            //如果重复出现说明有环
            if (set.contains(head))
                return true;
            //否则就把当前节点加入到集合中
            set.add(head);
            head = head.next;
        }
        return false;
    }


    //判断链表是否有环  破坏查找
    public static boolean hasCycle2(ListNode head) {

        ListNode p = head;
        while(p!=null){
            ListNode aft = p.next;
            if(aft==head) return true;
            p.next=head;
            p=aft;
        }
        return false;
    }






}
