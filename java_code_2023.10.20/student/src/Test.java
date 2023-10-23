
import javax.swing.plaf.BorderUIResource;

public class Test {
    public static void main(String[] args) {
        //定义一个长度为3的数组，数组存储1-3名学生对象作为初始数据，学生对象的学号姓名各不相同
        //学生的属性：学号，姓名，年龄

        //创建数组存放三个学生对象
        Student[] arr = new Student[3];

        //创建三个学生对象
        Student stu1 = new Student(3, 23, "张三");
        Student stu2 = new Student(4, 24, "李四");
        Student stu3 = new Student(5, 25, "王五");

        //把创建的学生对象放进Student arr[]数组
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        //创建新的学生对象
        Student stu4 = new Student(6, 26, "赵六");
        //进行学号的唯一性判断
        boolean flag = contains(arr, stu4.getId());
        //判断是否需要进行添加
        if (flag) {
            System.out.println("学生对象已经存在，不必添加");
        } else {
            //进行添加学生对象
            //如果数组已经存满，创建一个新的数组，数组长度为老数组+1，如果数组没有存满，直接添加到数组中
            int count = getCount(arr);
            if (count == arr.length) {
                //数组已经存满，需要创建新数组
                //创建一个新的数组，长度=老数组长度+1，拷贝老数组的所有数据
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                //要求2：遍历学生信息
                printArr(newArr);
            } else {
                //数组没有存满，直接放进去
                arr[count] = stu4;
                //要求2：遍历学生信息
                printArr(arr);
            }

        }

    }//主方法的括号


    //进行学号的唯一性判断
    //方法干嘛
    //需要什么
    //方法调用完是否需要返回结果
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //获取数组中每个元素的id
            Student stu = arr[i];

            if(stu != null){
                int sid = stu.getId();

                //比较需要输入的id和数组中元素的id是否相同
                if (sid == id) {
                    return true;
                }
            }

        }

        //循环结束，id不重复
        return false;
    }


    //判断数组中存了几个元素
    public static int getCount(Student[] arr) {
        //定义一个计数器来统计数组中有多少元素
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        //循环结束后，count就是数组中元素的个数
        return count;
    }


    //创建一个新的数组，长度=老数组长度+1，拷贝老数组的所有数据
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //遍历学生信息的方法
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                System.out.println(stu.getName() + ", " + stu.getId() + ", " + stu.getAge());
            }
        }
    }

}//类的括号