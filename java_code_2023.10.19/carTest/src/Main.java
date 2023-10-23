import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1.创建数组存放三个汽车对象
        Car [] arr = new Car[3];

        //2.遍历数组需要三次循环，每次循环生成一个对象，存放进对组
        for (int i = 0; i < arr.length; i++) {
            //创建接接收对象
            Scanner sc = new Scanner(System.in);

            //3.创建每次生成的汽车对象
            Car c = new Car();

            //4.为每次生成的对象初始化
            System.out.println("请输入汽车的品牌");
            String brand = sc.next();
            c.setBrand(brand);

            System.out.println("请输入一个汽车的价格");
            int price = sc.nextInt();
            c.setPrice(price);

            System.out.println("请输入一个汽车的颜色");
            String color = sc.next();
            c.setColor(color);

            //5.把汽车对象添加到arr数组中
            arr[i] = c;
        }

        //6
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand()+ "," + car.getPrice() + "," + car.getColor());
        }

        //7
        int sun = 0;

        for (int i = 0; i < arr.length; i++) {

            int prince = arr[i].getPrice();
            sun = sun + prince;
            System.out.println(sun);
        }
        int SVGprince = sun/ arr.length;
        System.out.println(SVGprince);
    }

}