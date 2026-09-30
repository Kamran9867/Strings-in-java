public class vowelCount {
    public static void main(String[] args) {

        String name = "Kamran";
        System.out.println(getTotalVowel(name));


    }

    public static int getTotalVowel(String name) {
        int vowel = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }

        }
        return vowel;
    }
}
