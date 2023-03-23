package com.Hugus.SimpleDemo;

import java.util.ArrayList;

/**
 * Copyright (C), 2021-2022, www.hugusPain.com
 *
 * @ClassName MergeListDemo
 * @Description 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * @Author hugus
 * @Date 2023/3/23 11:48
 * @Version V1.0
 * History:
 * <author>          <time>          <version>          <desc>
 * hugus         2023/3/23 11:48     V1.0           Initial class
 */
public class MergeListDemo {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }else if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }

    }

    public static ArrayList<Integer> getEles(ListNode list1) {
        ArrayList<Integer> nums = new ArrayList<>();
        if(list1.next.next == null){
            return nums;
        }else {
            nums.add(list1.val);
            nums.add(getEles(list1.next).get(1));
        }
        return nums;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(6,new ListNode(7))));
        ListNode list2 = new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(6))));
        /*ArrayList<Integer> eles = getEles(list1);
        System.out.println(eles.size());*/
        ListNode listNode = mergeTwoLists(list1, list2);
        showAllNode(listNode);
    }

    private static void showAllNode(ListNode listNode) {
        if(listNode.next != null){
            System.out.print(listNode.val + " -> ");
            showAllNode(listNode.next);
        }else{
            System.out.print(listNode.val + " . ");
        }
    }


}

  //Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

