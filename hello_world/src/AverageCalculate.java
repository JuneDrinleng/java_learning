import java.util.Scanner;

public class AverageCalculate {
    public static void main(String[] args) {
        int count=0,sum=0,number;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("请输入数字：");
            number=in.nextInt();
            count=count+1;
            sum=sum+number;
        } while (number!=-1);
        if (count-1>0) {
            double average=(sum+1)*1.0/(count-1);
            System.out.println("平均值是："+average);
        }

    }
}
