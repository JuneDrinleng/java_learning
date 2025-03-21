import java.util.Scanner;

public class SplitInt {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int mod;
        do{
            mod=num%10;
            num=num/10;
            System.out.print(mod);
        }while (num>0);
    }
}
