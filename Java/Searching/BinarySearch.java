class BinarySearch{
    public static int search(int[] nums, int target) {
        int n=nums.length;
        int front=0,rear=n-1;
        while(front<=rear){
            int mid=(front+rear)/2;
            if(target==nums[mid])
            return mid;
            else if(target<nums[mid])
                rear=mid+1;
            else
                front=mid+1; 
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={-1,0,3,5,9,12};
        int res=search(arr, 9);
        System.out.println("The index at which targe is found is "+res);
    }
}