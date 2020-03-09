package hunger;

public class Singleton {
    //直接创建唯一实例,赋值给引用
    private static Singleton instance = new Singleton();
    //私有化构造方法,防止外部创建实例
    private Singleton(){

    }
    //创建获取实例方法的时候记住一定要public(不然你给谁用)
    public static Singleton getInstance(){
        return instance;
    }
}
