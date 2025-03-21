import java.util.Scanner;

public class FineMaxCommonDivisorAdvance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = in.nextInt(), b = in.nextInt();
        int r,oa=a,ob=b;
        while(b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        System.out.println("The "+oa+" and"+ob+"'s max common divisor is: "+a);
    }
}
