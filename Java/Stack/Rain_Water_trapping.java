import java.util.ArrayList;
import java.util.Collections;
class Rain_Water_trapping {

    public static int find_area_of_water(int[] ar, int n) {
        ArrayList<Integer> maxleft = new ArrayList<>();
        ArrayList<Integer> maxright = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(ar[i]);
        }
        int temp = arr.get(0);
        maxleft.add(arr.get(0));
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > temp)
                {
                    maxleft.add(arr.get(i));
                    temp=arr.get(i);
                }
            else
                maxleft.add(temp);
        }
        int temp1 = arr.get(n - 1);
        maxright.add(arr.get(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) > temp1)
                {
                    maxright.add(arr.get(i));
                    temp1=arr.get(i);
                }
            else
                maxright.add(temp1);
        }
        Collections.reverse(maxright);
        System.out.println(maxleft.toString());
        System.out.println(maxright.toString());
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (maxleft.get(i) <= maxright.get(i))
                res.add(maxleft.get(i));
            else
                res.add(maxright.get(i));
        }
        for (int i = 0; i < n; i++) {
            res.set(i, Math.abs(res.get(i) - arr.get(i)));
        }
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += res.get(i);
        System.out.println(res.toString());
        return sum;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int res = find_area_of_water(arr, arr.length);
        System.out.println("The Area is " + res);
    }
}
