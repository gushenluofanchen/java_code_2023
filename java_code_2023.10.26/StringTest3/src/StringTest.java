import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        //金额转换

        //1.接收一个金额
        Scanner sc = new Scanner(System.in);
        int money;

        while (true) {
            System.out.println("请输入一个金额");
            money = sc.nextInt();

            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额无效");
            }
        }


        String moneyStr="";

        //2.得到每一位数字
        while (true) {
            //从右往左获取数字
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr=capitalNumber+moneyStr;

            //去掉已经获取的最后一个数字
            money = money / 10;

            if(money==0){
                break;
            }
        }
        System.out.println(moneyStr);


        //3.前面补零，补充到七位
        int count=7-moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr="零"+moneyStr;
        }


        //4.插入单位
        String[] arr={"佰","拾","万","仟","佰","拾","元"};
        String result="";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c=moneyStr.charAt(i) ;
            result = result + c + arr[i];
        }
        System.out.println(result);

    }//主方法

    //定义一个方法。把金额变成大写的中文
    public static String getCapitalNumber(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }





}//类
