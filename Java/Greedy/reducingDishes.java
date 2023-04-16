// 1402. Reducing Dishes
// A chef has collected data on the satisfaction level of his n dishes.Chef can cook any dish in 1 unit of time.

// Like-time coefficient of a dish is defined as the time taken to cook that dish including previous dishes multiplied by its satisfaction level i.e.time[i]*satisfaction[i].

// Return the maximum sum of like-time coefficient that the chef can obtain after dishes preparation.

// Dishes can be prepared in any order and the chef can discard some dishes to get this maximum value.

import java.util.ArrayList;
import java.util.Collections;

public class reducingDishes{
    public static int maxSatisfaction(int[] satisfaction) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<satisfaction.length;i++)
        list.add(satisfaction[i]);
        Collections.sort(list); // sorting the array
        int total=0;
        int n=list.size();
        int start=n-1; // starting from rear
        for(int i=n-1;i>=0;i--){
            total+=list.get(i);
            if(total<0) break; // if total gets negative so break
            start--;
        }
        start++; // adding it is decremented once more due to false condition
        // getting the start value
        int k=1; // time hour
        total=0;
        for(int i=start;i<n;i++)
        total+=(k++)*(list.get(i));
        return total;
    }
    public static void main(String[] args) {
        int[] satisfaction=new int[]{-1,-8,0,5,-9};
        System.out.println(maxSatisfaction(satisfaction));
    }
}