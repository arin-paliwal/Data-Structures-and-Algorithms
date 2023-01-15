/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode test = new ListNode(0); // creating an dummy list
        ListNode ur = test;
        if (l1.val==0 && l2.val==0){
        if (l1.next==null && l2.next==null)
        {System.out.println("ARIN");
        return ur;}}
        
        int size1=0;
        ListNode curr=l1,next=null,prev=null,temp=l1;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            size1++;
            curr=next;
        }
        l1=prev;

        ListNode cur=l2,nex=null,pre=null,tem=l2;
        int size2=0;
        while(cur!=null){
            nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
            size2++;
        }

        l2=pre;
        long sum=0,s=0;
        ListNode arin=l1;
        while(arin!=null){
            int rem=(int)Math.pow(10,--size1);
            sum+=(long)(arin.val)*rem;
            arin=arin.next;
        }

        ListNode rin=l2;
        while(rin!=null){
            int rem=(int)Math.pow(10,--size2);
            s+=(long)(rin.val)*rem;
            rin=rin.next;
        }
        long res=sum+s;
        System.out.println(s); 
        System.out.println(sum);
        System.out.println(res);
        ListNode dummy = new ListNode(0); // creating an dummy list
        ListNode urr = dummy;
        long value=res%10;
        res/=10;
        System.out.println("VALUE"+value);
        urr.val=(int)value;
        urr.next=null;
        System.out.println("URR "+urr.val);
        ListNode pointer=urr;
        while(res>0){
            System.out.println("REM"+res%10);
            ListNode node=new ListNode((int)res%10);
            pointer.next=node;
            pointer=node;
            res/=10;
        }
        return urr;

    }
}