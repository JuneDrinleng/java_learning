import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=in.nextInt();
//        int factor=1,i=1;
//        while(i<=num){
//            factor=factor*i;
//            i++;
//        }
        int factor=1;
        for(int i=1;i<=num;i++){
            factor=factor*i;
        }
        System.out.println("factor is："+factor);
    }
}
