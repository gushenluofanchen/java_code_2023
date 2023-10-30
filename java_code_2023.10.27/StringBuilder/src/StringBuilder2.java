import java.util.Scanner;

public class StringBuilder2 {
    public static void main(String[] args) {

        //练习：判断是否为对称字符串

        //1.接收字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //2.判断
        String s = new StringBuilder(str).reverse().toString();
        System.out.println(s);

    }//主方法
}//类
