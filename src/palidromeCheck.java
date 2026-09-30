public class palidromeCheck {
    public static void main(String[] args) {
         String num = "mom";

//         isPalindrome(num,name);
        System.out.println(isPalindrome(num));
    }
    public static boolean isPalindrome(String num) {
        String original = num;
        String reverse = reverseString(original);
        //compare
        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if (ch1 != ch2) {
                // no match
                return false;
            }
        }
        return  true;

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
