// import java.util.ArrayList;
public class AdjacencyMatrix {
     public static void main(String[] args) {
         int vertices=5;
         int edges=10;
         int arr[][]=new int[vertices+1][vertices+1];
         //initialising all to zero
         for (int i = 1; i < arr.length; i++) {
             for (int j = 1; j < arr.length; j++) {
                 arr[i][j]=0;
             }
         }
         //edge between 1 & 2
         arr[1][2]=1;
         arr[2][1]=1;
         //edge between 2 & 4
         arr[2][4]=1;
         arr[4][2]=1;
         //edge between 4 & 1
         arr[4][1]=1;
         arr[1][4]=1;
         //edge between 1 & 5
         arr[1][5]=1;
         arr[5][1]=1;
         //edge between 5 & 3
         arr[5][3]=1;
         arr[3][5]=1;

        //  displaying adjacency matrix
         for (int i = 1; i < arr.length; i++) {
             for (int j = 1; j < arr.length; j++) {
                 System.out.print(arr[i][j]+" ");
             }
             System.out.println();
         }
     }
 }