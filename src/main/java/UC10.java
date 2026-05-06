public class UC10 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        board = new char[][] {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'O', 'X', 'O'}
        };

        System.out.println(isDraw());
    }

    static boolean isDraw() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}