public class Student {
    private int id;
    private int age;
    private String name;

    public Student() {
    }

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //进行学号的唯一性判断
    //方法干嘛
    //需要什么
    //方法调用完是否需要返回结果
    public static boolean contains(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            //获取数组中每个元素的id
            Student stu = arr[i];
            int sid = stu.getId();

            //比较需要输入的id和数组中元素的id是否相同
            if(sid == id){
                return true;
            }
        }

        //循环结束，id不重复
        return false;
    }








}
