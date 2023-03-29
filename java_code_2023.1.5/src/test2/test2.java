package test2;

public class test2 {
    public static void main(String[] args) {
        //1.创建一个Goods类型数组存放商品对象
        Goods arr[] = new Goods[3];

        //2.创建三个商品对象
        Goods g1 = new Goods("001","华为p40",5999.0,100);
        Goods g2 = new Goods("002","保温杯",299.0,50);
        Goods g3 = new Goods("003","枸杞",12.7,70);

        //3.把商品对象存放到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //4.遍历
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + ", " + goods.getName() + ", " + goods.getPrice() + ", " + goods.getCount());
        }
    }
}
