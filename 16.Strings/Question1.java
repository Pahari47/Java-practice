public class Question1 {

    public static void vowelsCount(String str) {
        int count = 0;
        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("the vowel in the string is : " + count);
    }
    public static void main(String[] args) {
        String str = "bceagimn";
        vowelsCount(str);
    }
}
