import java.util.Scanner;

public class GuestingNumber {
    public static void main(String[] args) {
        int number=(int)(Math.random()*100+1);
        Scanner in= new Scanner(System.in);
        int input_num,count=0;
        do {
            System.out.print("请输入一个1-100之间的数：");
            input_num=in.nextInt();
            count=count+1;
            if (input_num>number){
                System.out.println("太大了");
            }
            else if (input_num<number){
                System.out.println("太小了");
            }
        }while(input_num != number);
        System.out.println("猜对了,共猜了"+count+"次");
    }
}
