public class Palindrome_String {
    public static void main(String[] args) {
        String s ="afifa";
        int l=0;
        int r = s.length()-1;
        System.out.println(palindrome(s,l,r));
    }

    private static boolean palindrome(String s, int l, int r) {

        if(l>=r){
            return true;
        }
        if (s.charAt(l)!=s.charAt(r)){
            return false;
        }
        return palindrome(s,l+1,r-1);
    }

}
