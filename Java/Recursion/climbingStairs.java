public class climbingStairs {
        public static int solve(int currStair, int n) {
            if (currStair == n)
                return 1;
            if (currStair > n)
                return 0;
            int leftcount = solve(currStair + 1, n);
            int rightcount = solve(currStair + 2, n);
            return leftcount + rightcount;
        }

        public static int findWays(int n) {
            return climbingStairs.solve(0, n);
        }

        public static void main(String[] args) {
            int n;
            n=4;
            System.out.println(climbingStairs.findWays(n));
        }
    }
