package com.soumyadeep;

import java.util.List;

public class MergeSort {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=middleNode(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);

        return mergeTwoLists(left,right);
    }

    ListNode mergeTwoLists(ListNode f, ListNode s) {
        ListNode ans=new ListNode();
        ListNode tail=ans;
        while(f!=null && s!=null){
            if(f.val<s.val){
                tail.next=f;
                f=f.next;
            }else{
                tail.next=s;
                s=s.next;
            }
            tail=tail.next;
        }
        tail.next=(f!=null)?f:s;
        return ans.next;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

}
