//LeetCode 746

public class Minimum_climbing_stairs {
    public static int solve(int n,int [] cost){
        if(n<=1) return 0;
        int oneStep=cost[n-1]+solve(n-1,cost);
        int twoStep=cost[n-2]+solve(n-2,cost);
        return Math.min(oneStep,twoStep);
    }
    public static int mincost(int [] cost){
        return Minimum_climbing_stairs.solve(cost.length,cost);
    }
    public static void main(String[] args) {
        int [] cost=new int[]{1,100,1,1,1,100,1,1,100,1};
        System.out.println(Minimum_climbing_stairs.mincost(cost));
    }
}
