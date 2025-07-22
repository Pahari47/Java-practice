import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "race";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] str1Arry = str1.toCharArray();
            char[] str2Arry = str2.toCharArray();

            Arrays.sort(str1Arry);
            Arrays.sort(str2Arry);

            boolean result = Arrays.equals(str1Arry, str2Arry);

            if (result) {
                System.out.println("they are anagrams");
            } else {
                System.out.println("They are not anagrams");
            }
        } else {
            System.out.println("They are not anagrams");
        }
    }
}
