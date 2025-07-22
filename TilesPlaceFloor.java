public class TilesPlaceFloor {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2; // either place vertically or horizontally
        }
        if (n < m) {
            return 1;
        }
        // vertically
        int verticallyPlacement = placeTiles(n - m, m);
        // horizontally
        int horizontallyPlacement = placeTiles(n - 1, m);
        return verticallyPlacement + horizontallyPlacement;
    }

    public static void main(String[] args) {
        int n = 4, m = 5;
        System.out.println(placeTiles(n, m));
    }
}
