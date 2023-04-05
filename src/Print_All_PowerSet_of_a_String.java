public class Print_All_PowerSet_of_a_String {


    public static void main(String[] args) throws Exception {
        String s ="abc";
        Prints(s,0,"");
        
    }

    private static void Prints(String s,int i ,String cur) {
        if (i==s.length()){
            System.out.println(cur);
            return;
        }
        Prints(s,i+1,cur + s.charAt(i));
        Prints(s,i+1,cur );


    }
}
