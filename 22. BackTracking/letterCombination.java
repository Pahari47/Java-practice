public class letterCombination {
    final static char[][] L = {
        {}, {}, {'a','b','c'}, {'d','e','f'},
        {'g','h','i'}, {'j','k','l'}, {'m','n','o'},
        {'p','q','r','s'}, {'t','u','v'}, {'w','x','y','z'}
    };
    public static void combo(String D) {
        int len = D.length();
        if (len == 0) {
            System.out.println("");
            return;
        }

        bfs(0, len, new StringBuilder(), D);
    }

    public static void bfs(int position, int len, StringBuilder sb, String D) {
        if (position == len) {
            System.out.println(sb.toString());
        } else {
            char letters[] = L[Character.getNumericValue(D.charAt(position))];

            for(int i = 0; i< letters.length; i++) {
                bfs(position+1, len, new StringBuilder(sb).append(letters[i]), D);
            }
        }
    }
    public static void main(String[] args) {
        combo("34");
    }
}
