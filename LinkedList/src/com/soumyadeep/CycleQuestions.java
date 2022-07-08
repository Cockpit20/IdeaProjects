package com.soumyadeep;

public class CycleQuestions {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
          val = x;
          next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public int lengthCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode temp=slow;
                int length=0;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=fast);
                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        int length=0;

        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        if(length==0)
            return null;

        ListNode f=head;
        ListNode s=head;

        while(length>0){
            s=s.next;
            length--;
        }

        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }

    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;

        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while (fast!=slow);

        return slow == 1;
    }

    private int findSquare(int number){
        int ans=0;
        while(number>0){
            int rem=number%10;
            ans+=rem*rem;
            number/=10;
        }
        return ans;
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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode present=head;
        ListNode prev=null;
        for (int i = 0; present!=null && i < left-1; i++) {
            prev=present;
            present=present.next;
        }
        ListNode last=prev;
        ListNode newEnd=present;

        assert present != null;
        ListNode next=present.next;
        for (int i = 0; present!=null && i < right - left + 1; i++) {
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }
        newEnd.next=present;
        return head;
    }

    public ListNode reverseList(ListNode head) {
        if(head==null) {
            return null;
        }
        ListNode prev=null;
        ListNode present=head;
        ListNode next=present.next;

        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        head=prev;
        return head;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode headSecond=reverseList(mid);
        ListNode reReverseHead=headSecond;

        while(head!=null && headSecond!=null){
            if(head.val != headSecond.val){
                break;
            }
            head=head.next;
            headSecond=headSecond.next;
        }
        reverseList(reReverseHead);
        return head == null || headSecond == null;
    }

    public void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return;
        }

        ListNode mid=middleNode(head);
        ListNode hs=reverseList(mid);
        ListNode hf=head;

        while(hf!=null && hs!=null){
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }
        if(hf!=null){
            hf.next=null;
        }
    }

    public ListNode reverseAlternateKGroup(ListNode head,int k){
        if(k<=1 || head==null){
            return head;
        }

        ListNode present=head;
        ListNode prev=null;

        while(present!=null){
            ListNode last=prev;
            ListNode newEnd=present;

            ListNode next=present.next;
            for (int i = 0; present!=null && i < k; i++) {
                present.next=prev;
                prev=present;
                present=next;
                if(next!=null){
                    next=next.next;
                }
            }

            if(last!=null){
                last.next=prev;
            }else{
                head=prev;
            }

            newEnd.next=present;

            for (int i = 0; present!=null && i < k; i++) {
                prev=present;
                present=present.next;
            }
        }
        return head;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(k <= 0 || head==null || head.next==null){
            return head;
        }
        ListNode last=head;
        int length=1;
        while(last.next!=null){
            last=last.next;
            length++;
        }
        last.next=head;
        int rotations=k%length;
        int skip=length-rotations;
        ListNode newLast=head;
        for (int i = 0; i < skip - 1; i++) {
            newLast=newLast.next;
        }
        head=newLast.next;
        newLast.next=null;
        return head;
    }

    public static void main(String[] args) {

    }
}
