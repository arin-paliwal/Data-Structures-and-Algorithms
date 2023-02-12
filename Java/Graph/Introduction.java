import java.util.ArrayList;

//adjacency matrix
// public class Introduction {
//     public static void main(String[] args) {
//         int vertices=5;
//         int edges=10;
//         int arr[][]=new int[vertices+1][vertices+1];
//         for (int i = 1; i < arr.length; i++) {
//             for (int j = 1; j < arr.length; j++) {
//                 arr[i][j]=0;
//             }
//         }
//         //edge between 1 & 2
//         arr[1][2]=1;
//         arr[2][1]=1;
//         //edge between 2 & 4
//         arr[2][4]=1;
//         arr[4][2]=1;
//         //edge between 4 & 1
//         arr[4][1]=1;
//         arr[1][4]=1;
//         //edge between 1 & 5
//         arr[1][5]=1;
//         arr[5][1]=1;
//         //edge between 5 & 3
//         arr[5][3]=1;
//         arr[3][5]=1;

//         //displaying graph
//         for (int i = 1; i < arr.length; i++) {
//             for (int j = 1; j < arr.length; j++) {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//adjacency list

public class Introduction {
    public static void main(String[] args) {
        int vertices=5;
        int edges=10;
        int arr[][]=new int[vertices+1][vertices+1];
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            list.add(new ArrayList<Integer>());
        }
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> list,int source,int destination){
        list.get(source).add(destination);
        list.get(destination).add(source);
    }
}
