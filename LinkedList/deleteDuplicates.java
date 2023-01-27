/*82. Remove Duplicates from Sorted List II
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.*/

class ListNode {
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

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head, node;
        if (head == null || head.next == null)
            return head;
        while (temp != null && temp.next != null && temp.val == temp.next.val) {
            if (temp.val == temp.next.val) {
                head = next(temp, temp.val);
                temp = head;
            }
        }
        if (head == null || head.next == null)
            return head;
        while (temp != null && temp.next != null && temp.next.next != null) {
            if (temp.next.val != temp.next.next.val) {
                temp = temp.next;
            } else {
                node = next(temp.next, temp.next.val);
                temp.next = node;
            }
        }
        return head;
    }

    public ListNode next(ListNode head, int val) {
        while (head.val == val && head != null) {
            if (head.next != null)
                head = head.next;
            else
                return null;
        }
        return head;
    }
}