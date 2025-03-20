import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("你好");
        Scanner in = new Scanner(System.in);
        int price,amount;
        System.out.print("请输入价格:");
        price=in.nextInt();
        System.out.print("请输入票面：");
        amount=in.nextInt();
//        System.out.println("echo:"+in.nextLine());
//        System.out.println("2+3="+2+3);
//        System.out.println("2+3="+(2+3));
        System.out.println(amount+"-"+price+"="+(amount-price));
    }
}
