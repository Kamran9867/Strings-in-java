public class revrseString {
    public static void main(String[] args) {

        String name = "Kamran";
        System.out.println(reverseString(name));

    }
    public static String reverseString(String name){
       String reverse = "";
       int n = name.length();
       for(int i= n-1;i>=0; i-- ){
           char ch =name.charAt(i);
           reverse = reverse + ch;
       }
       return reverse;
    }
}
