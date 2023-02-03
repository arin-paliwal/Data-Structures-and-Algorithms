// /328. Odd Even Linked List
// Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list

// The first node is considered odd, and the second node is even, and so on.

// Note that the relative order inside both the even and odd groups should remain as it was in the input./


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return head;
        ListNode odd=new ListNode(-1);ListNode front=odd;
        ListNode even=new ListNode(-1);ListNode front1=even;
        ListNode temp=head,temp1=head.next,tail=front,tail1=front1;
        while(temp!=null){
        ListNode node = new ListNode(temp.val);
        tail.next = node;
        tail = node;
        if(temp.next==null)
        break;
        if(temp.next.next==null)
        break;
        temp=temp.next.next;
        }

        while(temp1!=null){
        ListNode node = new ListNode(temp1.val);
        tail1.next = node;
        tail1 = node;
        if(temp1.next==null)
        break;
        if(temp1.next.next==null)
        break;
        temp1=temp1.next.next;
        }

        tail.next=front1.next;
        ListNode dummy=odd;
        return dummy.next;
    }
}