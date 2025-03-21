import java.util.Scanner;

public class JudgePrimeRange {
    public static void main(String[] args) {
        for (int j=2;j<=100;j++){
            if (j==2){
                System.out.print(j + " ");
            }
            for (int i = 2; i <j; i++) {
                if (j % i == 0) {
//                    System.out.println(j + " is not a prime number.");
                    break;
                } else if (i == j- 1) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}
