//1721. Swapping Nodes in a Linked List

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

    ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head, temp2 = head, temp3 = head;
        int size = 1, a = 0, b = 0, index = 0, index1 = 0;
        while (temp != null) {
            if (size == k) {
                a = temp.val;
                index = size;
            }
            temp = temp.next;
            if (temp != null)
                size += 1;
        }
        int get = 1;
        while (temp2 != null) {
            if (get == size - k + 1) {
                b = temp2.val;
                index1 = get;
            }
            temp2 = temp2.next;
            get += 1;
        }
        int track = 1;
        while (temp3 != null) {
            if (track == index)
                temp3.val = b;
            if (track == index1)
                temp3.val = a;
            temp3 = temp3.next;
            track += 1;
        }
        System.out.println(index);
        System.out.println(index1);
        // System.out.println(b);
        return head;
    }
}