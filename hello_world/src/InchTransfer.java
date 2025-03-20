import java.util.Scanner;

public class InchTransfer{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double inch,foot;
        System.out.print("请输入英尺");
        foot=in.nextDouble();
        System.out.print("请输入英寸");
        inch=in.nextDouble();
        System.out.println((int)(100*0.3046*(foot+inch/12))+"cm");
    }
}
