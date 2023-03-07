// You are given an array time where time[i]denotes the time taken by the ith bus to complete one trip.

// Each bus can make multiple trips successively;that is,the next trip can start immediately after completing the current trip.Also,each bus operates independently;that is,the trips of one bus do not influence the trips of any other bus.

// You are also given an integer totalTrips,which denotes the number of trips all buses should make in total.Return the minimum time required for all buses to complete at least totalTrips trips.

class minimumTime{
        // Range Based Binary Search
        // TC : O(nlogn)
        // SC : O(1)
        public static long findMinimumTime(int[] time, int totalTrips) {
            long left = 0;
            long right = 0;
            long min = time[0];
            for (int i : time)
                min = Math.min(min, i);
            right = totalTrips * min;
            while (left < right) {
                long mid = (right - left) / 2 + left;
                long total = totalTripInGivenTime(time, mid);
                if (total < totalTrips)
                    left = mid + 1;
                else
                    right = mid;
            }
            return left;
        }

        private static long totalTripInGivenTime(int[] time, long mid) {
            long total = 0l;
            for (int i : time)
                total += mid / (long) i;
            return total;
        }
        public static void main(String[] args) {
            int [] time = new int[]{1,2,3};
            int totalTrips = 5;
            System.out.println(findMinimumTime(time,totalTrips));
        }
    }