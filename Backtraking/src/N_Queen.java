import java.util.Scanner;

public class N_Queen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int [][] arr =new int[n][n];
        n_queen(arr,"",n);
    }

    private static void n_queen(int[][] arr, String position, int row ){
        if (row== arr.length){
            return;
        }
        for (int col=0;col < arr.length;col++){
            if (isItSafeTopalceTheQueen(arr,row,col)==true)
            arr [row][col] =1;
            n_queen(arr,position+row+""+col,row+1);
            arr [row][col] =0;
        }
    }

    private static boolean isItSafeTopalceTheQueen(int[][] arr, int row, int col) {
        for (int i=row-1,j=col;i>=0;i--){
            if(arr[row][col]==1)
                return false;
        }
          for (int i=row-1,j=col; i>=0&&j>=0;i--,j--){
            if(arr[row][col]==1)
                return false;
        }
          for (int i=row-1,j=col; i>=0&&j>=0;i--,j++){
            if(arr[row][col]==1)
                return false;
        }

        return true;
    }


}
