import java.util.*;

class Largest_Rectangle_Binary_Matrix {
    public static int find_max_area(int[] ar, int n) {
        ArrayList<Integer> arr = new ArrayList<>(); // moving elements to array list
        for (int i = 0; i < n; i++) {
            arr.add(ar[i]);
        }
        Stack<ArrayList<Integer>> s = new Stack<>();
        ArrayList<Integer> nsr = new ArrayList<>();
        ArrayList<Integer> nsl = new ArrayList<>();
        ArrayList<Integer> diff = new ArrayList<>();
        ArrayList<Integer> area = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            while (!s.empty() && s.peek().get(0) >= arr.get(i)) { // nsl
                s.pop();
            }
            if (s.empty()) {
                nsl.add(-1);
            } else {
                nsl.add(s.peek().get(1));
            }

            ArrayList<Integer> tempList = new ArrayList<>();
            tempList.add(arr.get(i));
            tempList.add(i);
            s.push(tempList);
        }
        while (!s.isEmpty())
            s.pop();
        System.out.println("RE" + arr.toString());
        // nsr
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr.get(i));
            while (!s.empty() && s.peek().get(0) >= arr.get(i)) { // nsr
                s.pop();
            }
            if (s.empty()) {
                nsr.add(n);
            } else {
                nsr.add(s.peek().get(1));
            }

            ArrayList<Integer> tempList = new ArrayList<>();
            tempList.add(arr.get(i));
            tempList.add(i);
            s.push(tempList);
        }
        Collections.reverse(nsr);
        System.out.println("the nsl" + nsl.toString());
        System.out.println("the nsr" + nsr.toString());
        for (int i = 0; i < n; i++) {
            diff.add(nsr.get(i) - nsl.get(i) - 1);
        }
        for (int i = 0; i < n; i++) {
            area.add(diff.get(i) * arr.get(i));
        }
        System.out.println("the area" + area.toString());
        int r = Collections.max(area);
        return r;

    }

    public static void main(String[] args) {
        int row, col;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                arr[i][j] = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        int[] temp = new int[col];
        int j = 0;
        for (int a = 0; a < row; a++) {
            if (a == 0) {
                j = 0;
                for (int i = 0; i < col; i++) {
                    temp[j] = arr[a][i];
                    j += 1;
                }
                int res = find_max_area(temp, temp.length);
                result.add(res);
            } else {
                j = 0;
                for (int i = 0; i < col; i++) {
                    if(arr[a][i]!=0)
                    temp[j] += arr[a][i];
                    else
                    temp[j]=0;
                    j += 1;
                }
                int res = find_max_area(temp, temp.length);
                result.add(res);
            }
        }
        System.out.println("The ans");
        System.out.println(result.toString());
        System.out.println(Collections.max(result));
        sc.close();
    }
} 
