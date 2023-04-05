import java.util.Scanner;

public class Josephus_problem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=s.nextInt(),k=s.nextInt();
        System.out.println(Josephus(n,k));
    }

    private static int Josephus(int n, int k) {
        if(n==1){
            return 0;
        }
        int x = Josephus(n-1,k);
        int y = (x +k)%n;
        return y;
    }
}
