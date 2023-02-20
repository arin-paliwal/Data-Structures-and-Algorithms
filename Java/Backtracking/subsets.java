import java.util.ArrayList;
import java.util.List;

class subsets {
    private static void solve(int[] nums, int i, List<Integer> subset, List<List<Integer>> powerset) {
        if (powerset.contains(subset))
            return;
        if (i == nums.length) {
            powerset.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        solve(nums, i + 1, subset, powerset);
        subset.remove(subset.size() - 1);
        solve(nums, i + 1, subset, powerset);
    }

    public static List<List<Integer>> subset(int[] nums) {
        List<List<Integer>>powerset=new ArrayList<>();
        List<Integer>subset=new ArrayList<>();
        solve(nums,0,subset,powerset);
        return powerset;
    }

    public static void main(String[] args) {
        int nums[] = new int[] { 1, 2, 3 };
        List<List<Integer>> ans = new ArrayList<>();
        ans = subset(nums);
        System.out.println(ans.toString());
    }
}