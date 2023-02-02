import java.util.*;
public class ChefAndBoredGames {
    public static void main(String[] args) throws java.lang.Exception {
        int test;
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();
        while (test-- > 0) {
            int n;
            n = sc.nextInt();
            int check=n;
            int[] list = new int[n + 1];
            for (int i = 1; i <= n; i++)
            {
                list[i] = check * check;check--;
                System.out.print(list[i]+" ");
            }
            System.out.println();
            int sum = 0;
            int i = 1;
            while (i <= n) {
                System.out.println(list[i]);
                sum += list[i];
                i += 2;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}