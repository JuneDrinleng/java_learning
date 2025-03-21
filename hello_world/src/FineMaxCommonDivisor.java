import java.util.Scanner;

public class FineMaxCommonDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = in.nextInt(), b = in.nextInt();
        int common=1;
        for (int i=2; i<=Math.min(a,b);i++){
            if (a%i==0 && b%i==0){
                common=i;
            }
        }
        System.out.println("The common number is: "+common);
    }
}
