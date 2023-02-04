import java.util.ArrayList;
// LC 4
public class mediam_of_2_sorted_array {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] < nums2[p2]) {
                list.add(nums1[p1]);
                p1++;
            } else {
                list.add(nums2[p2]);
                p2++;
            }
        }
        while (p1 < nums1.length) {
            list.add(nums1[p1]);
            p1++;
        }
        while (p2 < nums2.length) {
            list.add(nums2[p2]);
            p2++;
        }
        System.out.println(list.toString());
        int s = list.size();
        if (s % 2 == 0) {
            double med = list.get(s / 2) + list.get((s / 2) - 1);
            return med / 2;
        } else
            return list.get(s / 2);
    }

    public static void main(String[] args) {
        int a1[] = {1,3,4,7,10,12};
        int a2[] = {2,3,6,15};
        System.out.println(findMedianSortedArrays(a1, a2));
    }
}
