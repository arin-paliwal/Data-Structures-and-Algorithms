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
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer>s=new Stack<>();
        int j=0;
        int size=0,n=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        ListNode curr=head,prev=null,nex=head;
        while(curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        head=prev;
        ListNode temp1=head;
        int[]res=new int[n];
        while(temp1==null){
            if(s.isEmpty()){
                System.out.println("INLOOP1");
                res[j]=0;j++;
                s.push(temp1.val);size++;
            }
            else if(s.peek()>temp1.val){
                System.out.println("INLOOP2");
                res[j]=s.peek();j++;
                s.push(temp1.val);size++;
            }
            else if(s.peek()<=temp1.val){
                System.out.println("INLOOP3");
                while(size>0 && s.peek()<=temp1.val)
                {
                    s.pop();
                    size--;
                    // if(size==0) break;
                    System.out.println("Run");
                }
                if(s.isEmpty()){
                    res[j]=0;j++;
                    s.push(temp1.val);size++;
                }
                else if(s.peek()>temp1.val){
                    res[j]=s.peek();j++;
                    s.push(temp1.val);size++;
                }
            }
            temp1=temp1.next;
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
        int[]result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=res[n0-i];
        }
    }
}