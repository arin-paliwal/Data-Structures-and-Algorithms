import java.util.Arrays;
public class SingleElementInArray {
        public static int singleNonDuplicate(int[] nums) {
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max)
                    max = nums[i];
            }
            int[] keep = new int[max * 2 + 1];
            Arrays.fill(keep, 0);
            for (int i = 0; i < nums.length; i++) {
                keep[nums[i]]++;
            }
            for (int i = 0; i < keep.length; i++) {
                if (keep[i] == 1)
                    return i;
            }
            return -1;
        }
    public static void main(String[] args) {
        int [] nums=new int[]{1,1,2};
        System.out.println(singleNonDuplicate(nums));
    }
}
