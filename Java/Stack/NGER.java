import java.util.*;

class NGER { // Next Greater Element to Right

    public static ArrayList<Integer> nextGreaterElement(int nums[]) {
        Stack<Integer> s = new Stack<>();
        int size = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (s.isEmpty()) {
                System.out.println("INLOOP1");
                res.add(-1);
                s.push(nums[i]);
                size++;
            } else if (s.peek() > nums[i]) {
                System.out.println("INLOOP2");
                res.add(s.peek());
                s.push(nums[i]);
                size++;
            } else if (s.peek() <= nums[i]) {
                System.out.println("INLOOP3");
                while (size > 0 && s.peek() <= nums[i]) {
                    s.pop();
                    size--;
                    System.out.println("Run");
                }
                if (s.isEmpty()) {
                    res.add(-1);
                    s.push(nums[i]);
                    size++;
                } else if (s.peek() > nums[i]) {
                    res.add(s.peek());
                    s.push(nums[i]);
                    size++;
                }
            }
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 3,0,0,2,0,4 };
        // int[] result = new int[arr.length];
        // Stack_Next_Greater obj=new Stack_Next_Greater();
        ArrayList<Integer> ans = nextGreaterElement(arr);
            System.out.println(ans.toString());
    }
}




// import java.util.*; 

// class NGER {

// 	public static ArrayList<Integer> nextGreaterElementToRight(int arr[], int n) {
// 		ArrayList<Integer> v = new ArrayList<>();
// 		Stack<Integer> s = new Stack<>();

// 		for(int i = n - 1; i >= 0; i--) {
// 		    while(!s.empty() && s.peek() <= arr[i]) {
//     			s.pop();
//     		}
//     		if(s.empty()) {
//     		    v.add(-1);
//     		}
//     		else  {
//     		    v.add(s.peek());
//     		}
//     		s.push(arr[i]);
// 		}
// 		Collections.reverse(v);
// 		return v;
// 	}

// 	public static void main(String[] args) {
		
// 		int arr[] = {7, 8, 1, 4}; 
// 		ArrayList<Integer> ans = nextGreaterElementToRight(arr, arr.length); 
// 		System.out.println(ans.toString());

// 	}
// }