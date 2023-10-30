import java.util.Scanner;

public class StringBuilder3 {
    public static void main(String[] args) {
        //练习:拼接字符串

        //1.接收字符串
        int[] arr = {1, 2, 3};

        //调用自定义方法，把{1,2,3}拼接成[1,2,3]
        String result = arrToString(arr);
        System.out.println(result);

    }//主方法

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();

        String str = "[";

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str = str + arr[i];
            } else {
                str = str + arr[i] + ",";
            }
        }
        str = str + "]";
        return str;
    }

    ;

}//类
