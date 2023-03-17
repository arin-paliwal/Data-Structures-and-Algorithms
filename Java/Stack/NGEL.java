import java.util.*; 

class NGEL { // Next Greater Element to Left

	public static ArrayList<Integer> nextGreaterElementToLeft(int arr[], int n) {
		ArrayList<Integer> v = new ArrayList<>();
		Stack<Integer> s = new Stack<>();

		for(int i = 0; i < n; i++) {
		    while(!s.empty() && s.peek() <= arr[i]) {
    			s.pop();
    		}
    		if(s.empty()) {
    		    v.add(-1);
    		}
    		else  {
    		    v.add(s.peek());
    		}
    		s.push(arr[i]);
		}
		
		return v;
	}

	public static void main(String[] args) {
		
		int arr[] = {3,0,0,2,0,4}; 
		ArrayList<Integer> ans = nextGreaterElementToLeft(arr, arr.length); 
		System.out.println(ans.toString());

	}
}