import java.util.Scanner;

public class board {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final  int Size=3;
        int [][] board= new int[Size][Size];
        for (int i=0;i<Size;i++){
            for (int j=0;j<Size;j++){
                System.out.print("Enter the value of board line"+(i+1)+"  and column"+(j+1)+":");
                board[i][j]=in.nextInt();
            }
        }
        MainLOOP:
        for (int i=0;i<Size;i++){
            int const_num=board[i][0];
            for (int j=0;j<Size;j++){
                if (board[i][j]!=const_num){
                    break;
                }
                else if (board[i][j]==const_num && j==Size-1){
                    System.out.print(const_num+" wins ");
                    break MainLOOP;
                }
            }
        }
        MainLOOP2:
        for (int j=0;j<Size;j++){
            int const_num=board[0][j];
            for (int i=0;i<Size;i++){
                if (board[i][j]!=const_num){
                    break;
                }
                else if (board[i][j]==const_num && i==Size-1){
                    System.out.print(const_num+" wins ");
                    break MainLOOP2;
                }
            }
        }
        int const_num=board[0][0];
        for (int i=0;i<Size;i++){
            if (board[i][i]!=const_num){
                break;
            }
            else if (board[i][i]==const_num && i==Size-1){
                System.out.print(const_num+" wins ");
                break;
            }
        }
        const_num=board[0][Size-1];
        for (int i=0;i<Size;i++){
            if (board[i][Size-1-i]!=const_num){
                break;
            }
            else if (board[i][Size-1-i]==const_num && i==Size-1){
                System.out.print(const_num+" wins ");
                break;
            }
        }
    }
}
