public class HallowRectangle {
    public static void hollow_rectangle(int Rows, int columns) {
        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == Rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid(int n) {
        for(int i = 1; i <= n; i++){
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void inverted_halfPyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j= 1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void foyds_triange(int n) { 
        int counter = 1;
        for(int i = 1; i<=n; i++) {
            for(int j= 1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void butterflyPattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Tilted_rombas(int n) {
        for(int i=1; i<=n; i++) {
            for(int j = 1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rombas(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int j =1; j<=n; j++) {
                if (i == 1 || i ==n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print( " ");
                }
            }
            System.out.println();
        }
    }
    public static void Diamond_pattern(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=(n - i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=(2 * i) - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--) {
            for(int j = 1; j<=(n - i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=(2 * i) - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollow_rectangle(4, 5);
        // halfPyramid(4);
        // inverted_halfPyramid(5);
        // foyds_triange(5);
        // zero_one_triangle(5);
        // butterflyPattern(5);
        // Tilted_rombas(5);
        // hollow_rombas(5);
        Diamond_pattern(5);
    }
}
