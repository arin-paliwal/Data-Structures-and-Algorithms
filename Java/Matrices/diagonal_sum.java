// package Matrices;
import java.util.Scanner;
// import java.util.*;
// 1572. Matrix Diagonal Sum
class diagonal_sum{
    public static int find_diagonal_sum(int[][] mat) {
        int sum=0;
        int row=mat.length;
        int col=mat[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==j)
                {
                    sum+=mat[i][j];
                }
                if(row==col && row%2!=0)
                {
                    if(i+j==row-1 && i!=row/2 && j!=col/2)
                {
                    sum+=mat[i][j];
                }
                }
                if(row==col && row%2==0)
                {
                    if(i+j==row-1)
                {
                    sum+=mat[i][j];
                }
                }
            }
        
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        int row,column;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Rows & Columns");
        row=sc.nextInt();
        column=sc.nextInt();
        int [][] arr=new int[row][column];
        int result=find_diagonal_sum(arr);
        System.out.println(result);
        sc.close();
    }
}