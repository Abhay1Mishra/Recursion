public class Main {
    public static void main(String[] args) {
        System.out.println(sumOf(5));
        System.out.println(power(2,3));

    }

    private static int sumOf(int n) {
        if (n==1){
            return 1;
        }
       return n + sumOf(n-1);
    }
    static int power(int a,int b){
        int rus =0;
        if(b==0){
            return 1;
        }
        rus = a*power(a,b-1);
        return rus;
    }

}