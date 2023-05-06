public class ImplementationCircularQueue {
    int [] arr;
    int f,r,n;
    public ImplementationCircularQueue(int k) {
        n=k;
        arr=new int[k];
        f=-1;
        r=-1;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(f==-1){
            f=0;
            r=0;
        }
        else{
            r=(r+1)%n;
        }
        arr[r]=value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        // int x=arr[f];
        if(f==r){
            f=-1;
            r=-1;
        }
        else
        f=(f+1)%n;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        int x=arr[f];
        return x;
    }
    
    public int Rear() {
        // printit();
        if(isEmpty()) return -1;
        int x=arr[r];
        return x;
    }
    
    public boolean isEmpty() {
        if(f==-1) return true;
        return false;
    }
    
    public boolean isFull() {
        if((r+1)%n==f) return true;
        return false;
    }
    public void printit(){
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int k=3;
        ImplementationCircularQueue obj = new ImplementationCircularQueue(k);
        System.out.println(obj.enQueue(1));
        System.out.println(obj.enQueue(2));
        System.out.println(obj.enQueue(3));
        System.out.println(obj.Rear());
        System.out.println(obj.isFull());
        System.out.println(obj.deQueue());
        System.out.println(obj.enQueue(4));
        System.out.println(obj.Rear());
    }
}

