import java.util.*;

public class DecodeString {
    static String decode(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int k = 0;

        for(int i = 0; i< s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(currentString);

                k = 0;
                currentString = "";
            } else if (ch == ']') {
                int repeatTimes = countStack.pop();
                String prevString = stringStack.pop();

                StringBuilder temp = new StringBuilder(prevString);
                for(int j = 0; j< repeatTimes; j++) {
                    temp.append(currentString);
                }

                currentString = temp.toString();
            } else {
                currentString += ch;
            }
        }

        return currentString;
    }
    public static void main(String[] args) {
        System.out.println(decode("3[b2[v]]"));
    }
}
