import java.util.*;

public class Question2 {

    static String simplyfyPath(String str) {
        Stack<String> stack = new Stack<String>();
        String res = "";
        res += "/";

        for(int i = 0; i < str.length();) {
            String dir = "";

            while (i < str.length() && str.charAt(i) == '/') {
                i++;
            }

            while (i < str.length() && str.charAt(i) != '/') {
                dir += str.charAt(i);
                i++;
            }

            if (dir.equals("..")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else if (dir.equals(".") || dir.equals("")) {
                
            } {
                stack.pop(dir);
            }
        }
        Stack<String> st1 = new Stack<String>();
        while (!stack.empty()) {
            st1.push(stack.pop());
        }

        while (!st1.empty()) {
            if (st1.size() != 1) {
                res += (st1.pop() + "/");
            } else {
                res += st1.pop();
            }
        }

        return res;
    }
    public static void main(String[] args) {
        String str = new String("/a/./b/../../c/");
        String res = simplyfyPath(str);

        System.out.println(res);

    }
}
