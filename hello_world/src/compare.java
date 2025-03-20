import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int balance=0;
        while (true) {
            System.out.print("请投入一定金额的货币:");
            int amount = in.nextInt();
            balance=balance+amount;
            if (balance >= 10) {
                System.out.println("找零：" + (balance - 10));
                System.out.println("************************");
                System.out.println("java 城际铁路车票");
                System.out.println("票价：10元");
                System.out.println("************************");
                balance=0;
            } else {
                System.out.println("您投入的金额不足");
            }
        }
    }
}
