import java.util.Scanner;

public class Lexicographical_Order {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = 10;
        for (int i=1;i<9;i++){
            lex(i,n);
        }
    }

    private static void lex(int i, int n) {
        if (i<n){
            return;
        }
        System.out.println(i);
        for (int j=0;j<10;j++){
            lex(i*10+j,n);
        }
    }
}
