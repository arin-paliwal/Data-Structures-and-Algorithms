import java.util.*; 

class NSEL { //Next Smallest Element to Left
 
	public static ArrayList<Integer> nextSamllerElementToLeft(int arr[], int n) {
		ArrayList<Integer> v = new ArrayList<>();
		Stack<Integer> s = new Stack<>();

		for(int i = 0; i < n; i++) {
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
		return v;
	}

	public static void main(String[] args) {
		
		int arr[] = {6,2,5,4,5,1,6}; 
		ArrayList<Integer> ans = nextSamllerElementToLeft(arr, arr.length); 
		System.out.println(ans.toString());

	}
}