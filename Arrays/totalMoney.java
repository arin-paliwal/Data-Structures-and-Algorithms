// 1716. Calculate Money in Leetcode Bank 

class Solution {
    public int totalMoney(int n) {
        int[] arr = new int[7];
        int rem = 0, sum = 0;
        for (int i = 0; i < 7; i++)
            arr[i] = i + 1;
        int s = 28;
        if (n <= 7) {
            for (int i = 0; i < n; i++)
                sum += arr[i];
            return sum;
        } else {
            int d = n / 7;
            rem = n % 7;
            for (int i = 0; i < d; i++) {
                for (int j = 0; j < 7; j++)
                    arr[j] += 1;
                if (i + 1 != d) {
                    for (int k = 0; k < 7; k++)
                        s += arr[k];
                }
            }
            for (int k = 0; k < rem; k++)
                s += arr[k];
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        return s;
    }
}