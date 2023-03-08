// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

// Return the minimum integer k such that she can eat all the bananas within h hours.
 

class koko_eating_bananas {
    // TC : O(log(M)*N) M=>number of bananas in one pile N=>number of piles
    // SC :O(1)
    private static boolean isValid(int[] piles, int h, int mid) {
        long midT = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] % mid == 0)
                midT += piles[i] / mid;
            else
                midT += piles[i] / mid + 1;
        }
        if (midT > h)
            return false;
        return true;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int ans = 0, low = 1, high = 0, n = piles.length;
        for (int i : piles)
            if (i > high)
                high = i;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isValid(piles, h, mid)) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int piles[] = new int[]{3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles,h));
    }
}
