public class Number_of_ways_in_an_nxm_matrix {
    public static void main(String[] args) {
      int x=2,y=3;
        System.out.println(matrix(x,y));
    }

    private static int matrix(int x, int y) {
        int rus =0;
        if(x==1||y==1){
            return 1;

        }
        rus =matrix(x-1,y) + matrix(x,y-1);
        return rus;
    }
}
