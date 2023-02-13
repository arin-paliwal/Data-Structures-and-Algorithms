package Tree;

public class BSTfromSortedArray {
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            int start = 0;
            int end = nums.length - 1;
            return tobst(nums, start, end);
        }

        public TreeNode tobst(int arr[], int start, int end) {
            if (start > end)
                return null;
            int mid = (start + end) / 2;
            TreeNode root = new TreeNode(arr[mid]);
            root.left = tobst(arr, start, mid - 1);
            root.right = tobst(arr, mid + 1, end);
            return root;
        }
    }
}
