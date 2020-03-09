package basic;

public class Boss {
    //创建Boss唯一的实例
    private static Boss boss = new Boss();
    //私有化构造方法，防止外部创建行为
    private Boss(){

    }
    //定义唯一获取实例的方法
    public static Boss getInstance(){
        return boss;
    }
    //定义一个测试方法sign老板签字
    public void sign(){
        System.out.println("老板签字！");
    }
}
