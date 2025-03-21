import java.util.Scanner;

public class JudgePrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if (num<2){
            System.out.println(num + " can not decide whether it is prime number or not");
        }
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number.");
                    break;
                } else if (i == num - 1) {
                    System.out.println(num + " is a prime number.");
                }
            }
        }
    }
}
