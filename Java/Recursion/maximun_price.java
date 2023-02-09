public class maximun_price {
    public static int solve(int[]winePrice,int left,int right,int year){
        if(left>right) return 0;
     int leftcost=winePrice[left]*year+solve(winePrice, left+1, right, year+1);
     int rightcost=winePrice[right]*year+solve(winePrice, left, right-1, year+1);
     return Math.max(leftcost,rightcost);
    }
    public static int maxPrice(int[]winePrice){
        return solve(winePrice,0,winePrice.length-1,1);
    }
    public static void main(String[] args) {
        int[]winePrice=new int[]{2,3,5,1,4};
        System.out.println(maximun_price.maxPrice(winePrice));
    }
}
