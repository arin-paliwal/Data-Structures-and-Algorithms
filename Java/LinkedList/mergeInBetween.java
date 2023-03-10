/*1669. Merge In Between Linked Lists
You are given two linked lists: list1 and list2 of sizes n and m respectively.

Remove list1's nodes from the ath node to the bth node, and put list2 in their place.

The blue edges and nodes in the following figure indicate the result:
*/

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

    ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1, keep = null, change = list2;
        int size = 0;
        while (temp.next != null) {
            size += 1;
            if (size == a) {
                keep = temp.next;
                temp.next = change;
                temp = change;
            }
            temp = temp.next;
        }
        int res = b - a;
        for (int i = 0; i <= res; i++)
            keep = keep.next;
        temp.next = keep;
        return list1;
    }
}