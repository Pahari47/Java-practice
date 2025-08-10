public class gridways {

    public static int gridWay(int i, int j, int m, int n) {
        if (i == n-1 && j == m-1) {
            return 1;
        } else if (i == n || j == n) {
            return 0;
        }
        int way1 = gridWay(i+1, j, m, n);
        int way2 = gridWay(i, j+1, m, n);
        return way1 + way2;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridWay(0, 0, m, n));
    }
}
