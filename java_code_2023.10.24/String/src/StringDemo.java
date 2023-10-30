public class StringDemo {
    public static void main(String[] args) {
        //1.使用直接赋值的方法创建字符串
        String s1 = "abc";
        System.out.println("s1");

        //2.使用new的方式创建字符串
        String s2 = new String();
        System.out.println("@" + s2 + "!");

        //传递一个字符串，根据传递的字符串再创建一个新的字符串对象
        String s3 = new String("abc");
        System.out.println(s3);

        //传递一个字符数组，根据字符数组的内容再创建一个新的字符串
        char[] chs = {'a','b','c'};
        String s4 = new String(chs);
        System.out.println(s4);

        //传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        //应用场景：以后在网络中传输的都是字节信息，我们一般需要把字节信息转换成字符串，这时候就需要用到这个构造方法了
        byte[] bytes = {97,98,99,100};
        String s5 = new String(bytes);
        System.out.println(s5);

        //需求：需要修改字符串的内容
        //1.abc -> {'a','b','c'}
        //2.{'a','b','c'} -> {' Q','b','c'}
        //3.{' Q','b','c'} -> Qbc


    }//主方法括号
}//类括号
