import java.util.Scanner;

public class GetSum2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= in.nextInt();
        double sum=0.0;
        for (int i=1;i<=num;i++){
            sum=sum+(Math.pow(-1.0,i+1))*(1.0/i);
        }
        System.out.printf("The sum is:%.2f ",sum);
    }
}
