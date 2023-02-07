import java.util.*;
class maximum_area_histogram {
    public static int find_max_area(ArrayList<Integer> arr,int n) {
        Stack<ArrayList<Integer>> s = new Stack<>();
        ArrayList<Integer> nsr=new ArrayList<>();
        ArrayList<Integer> nsl=new ArrayList<>();
        ArrayList<Integer> diff=new ArrayList<>();
        ArrayList<Integer> area=new ArrayList<>();

        for(int i = 0; i < n; i++) {
		    while(!s.empty() && s.peek().get(0) >= arr.get(i)) { // nsl
    			s.pop();
    		}
    		if(s.empty()) {
    		    nsl.add(-1);
    		}
    		else  {
    		    nsl.add(s.peek().get(1));
    		}

    		ArrayList<Integer> tempList = new ArrayList<>();
    		tempList.add(arr.get(i));
    		tempList.add(i);
			s.push(tempList);
		}
        while(!s.isEmpty()) s.pop();
        System.out.println("RE"+arr.toString());
        // nsr 
        for(int i = n-1; i >=0; i--) {
            System.out.println(arr.get(i));
		    while(!s.empty() && s.peek().get(0) >= arr.get(i)) { // nsr
    			s.pop();
    		}
    		if(s.empty()) {
    		    nsr.add(n);
    		}
    		else  {
    		    nsr.add(s.peek().get(1));
    		}

    		ArrayList<Integer> tempList = new ArrayList<>();
    		tempList.add(arr.get(i));
    		tempList.add(i);
			s.push(tempList);
		}
        Collections.reverse(nsr);
        System.out.println("the nsl"+nsl.toString());
        System.out.println("the nsr"+nsr.toString());
        for(int i=0;i<n;i++){
            diff.add(nsr.get(i)-nsl.get(i)-1);
        }
        for (int i=0;i<n;i++) {
            area.add(diff.get(i)*arr.get(i));
        }
        System.out.println("the area"+area.toString());
        int r=Collections.max(area);
        return r;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(5);
        arr.add(6);
        arr.add(2);
        arr.add(3);
        // arr.add(6);
        int result=find_max_area(arr,arr.size());
        System.out.println(result);
        System.out.println("N"+arr.size());

    }
}
