import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("请输入当前的状态码：");
        int type=in.nextInt();
        switch (type)
        {
            case 1:
                System.out.println("早上好");
//                break;
            case 2:
                System.out.println("中午好");
//                break;
            default:
                System.out.println("你好");
                break;
        }
    }
}
