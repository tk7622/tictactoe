import java.util.Scanner;

public class UC6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        char symbol=sc.next().charAt(0);

        placeMove(row,col,symbol);

    }
    public static void placeMove(int row,int col,char symbol){

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==row && j==col){
                    System.out.print(symbol);
                }
                else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}