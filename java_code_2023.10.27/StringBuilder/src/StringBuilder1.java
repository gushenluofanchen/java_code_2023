public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aaa");

        sb.append("bbb").append("ccc").append("ddd");

        String str1 = sb.toString();
        System.out.println(str1);
        System.out.println(sb.toString());

        StringBuilder str2 = sb.reverse();
        System.out.println(str2);

        int length = sb.length();
        System.out.println(length);

    }//主方法
}//类
