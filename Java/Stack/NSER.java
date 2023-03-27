import java.util.*; 

class NSER { //Next Smallest Element to Right
 
	public static ArrayList<Integer> nextSamllerElementToRight(int arr[], int n) {
		ArrayList<Integer> v = new ArrayList<>();
		Stack<Integer> s = new Stack<>();

		for(int i = n - 1; i >= 0; i--) {
		    while(!s.empty() && s.peek() >= arr[i]) {
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
		Collections.reverse(v);
		return v;
	}

	public static void main(String[] args) {
		
		int arr[] = {6,2,5,4,5,1,6}; 
		ArrayList<Integer> ans = nextSamllerElementToRight(arr, arr.length); 
		System.out.println(ans.toString());

	}
}