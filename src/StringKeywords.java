import java.util.Locale;

public class StringKeywords {
    public static void main(String[] args) {


//        empty -> length =0
//        blank -> empty or sirf spaces h string
//        trim->  trim unnecessary spaces
//        String str =" ";
//        System.out.println(str.length());
//        System.out.println(str.isEmpty());
//        System.out.println(str.isBlank());
//        String name = "  Love   ";
//        System.out.println(name.length());
//        name = name.trim();
//        System.out.println(name.length());

        // finding substring from an string
//
//        String str = "My Name is Kamran";
//        System.out.println(str.substring(3, 7));
//           // contains keyword
//        System.out.println(str.contains("Kamran"));




         // lower & upper cases
//        String name = "love";
//        System.out.println(name.toUpperCase());
//        String str = "LOVe";
//        System.out.println(str.toLowerCase());

        // valueOf(any type) change type

//        int num = 5123;
//        String str = String.valueOf(num);
//        System.out.println(str+1);

      // startWith and endsWith keyword
//        String name = "Kamran Love Faridi";
//        System.out.println(name.startsWith("Kamran L"));
//        System.out.println(name.endsWith("Faridi"));

        // toCharArray keyword
//        String name= "kamran";
//        char[] crr = name.toCharArray();
//
//        // print the value
//        for(char ch: crr){
//            System.out.println("value of char: "+ch);
//        }

        // split keyword

//        String input = "My,name,is,kamran";
//        String [] words= input.split(",");
//        for(String str:words){
//            System.out.println(str+" ");
        //}

        // replace keyword
        String  name= "Kamran";
        name= name.replace("n","l");
        System.out.println(name);





    }
}
