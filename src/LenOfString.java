public class LenOfString {
    public static void main(String[] args) {

        String str= "Kamran";
       int  n = str.length();

        int count = 0;
        for(int i=0;i<n; i++){
            str.charAt(i);
            count++;
        }
        System.out.println(count);
    }
}
