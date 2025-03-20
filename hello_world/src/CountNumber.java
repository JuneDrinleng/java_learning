import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("欢迎来到判断位数");
        System.out.print("请输入需要判断的数: ");
        int amount= in.nextInt();
        int count=0;
        do
        {
            amount=amount/10;
            count=count+1;
        }while (amount>0);
        System.out.println(count+"位数");
    }
}
