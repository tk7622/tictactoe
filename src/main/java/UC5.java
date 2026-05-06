import java.util.Random;

public class UC5 {

    static char[][] board = new char[3][3];

    static char player1Symbol;
    static char player2Symbol;
    static char currentPlayerSymbol;

    public static void main(String[] args) {
        initializeBoard();
        performToss();
        printBoard();

        int slot = getUserSlot();

        int row = getRowFromSlot(slot);
        int col = getColFromSlot(slot);

        if (isValidMove(row, col)) {
            System.out.println("Valid Move");
        } else {
            System.out.println("Invalid Move");
        }
    }

    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }
    }


    public static void performToss() {
        Random rand = new Random();
        int toss = rand.nextInt(2);

        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayerSymbol = player1Symbol;

            System.out.println("Player 1 starts and is 'X'");
            System.out.println("Player 2 is 'O'");
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayerSymbol = player2Symbol;

            System.out.println("Player 2 starts and is 'X'");
            System.out.println("Player 1 is 'O'");
        }
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getUserSlot() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }
    public static int getColFromSlot(int slot) {

        if(slot==1 || slot==4 || slot==7){
            return 0;
        }
        else if(slot==2 || slot==5 || slot==8){
            return 1;
        }
        else{
            return 2;
        }
    }
    public static int getRowFromSlot(int slot) {

        if(slot==1 || slot==2 || slot==3){
            return 0;
        }
        else if(slot==4 || slot==5 || slot==6){
            return 1;
        }
        else{
            return 2;
        }
    }
    public static boolean isValidMove(int row, int col) {

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        if (board[row][col] != '_') {
            return false;
        }

        return true;
    }
}