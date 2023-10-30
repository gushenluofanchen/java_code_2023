import java.util.Scanner;

public class Main {
    //用户登录:已知正确的用户名和密码，用程序模拟登录，三次机会，登陆后，相应提示

    public static void main(String[] args) {
        //1.定义正确的用户名和密码
        String righeUsername = "王瑞";
        String righePassword = "LiuRui20010303";
        //2.输入用户名和密码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入一个用户名：");
            String username = sc.next();
            System.out.println("请输入一个密码：");
            String password = sc.next();

            if (username.equals(righeUsername) && password.equals(righePassword)) {
                System.out.println("用户登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("您的账号已锁定，请联系**********");
                } else {
                    System.out.println("用户名和密码错误，请重新输入，您还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }//主方法名
}//类名