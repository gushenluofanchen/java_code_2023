package test3;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //1.创建数组存放三个汽车对象
        Car arr[] = new Car[3];

        //2.创建汽车对象，数据来源于键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象
            Car c = new Car();
            //录入品牌
            System.out.println("请输入品牌：");
            String brand = sc.next();
            c.setBrand(brand);


        }
    }
}
