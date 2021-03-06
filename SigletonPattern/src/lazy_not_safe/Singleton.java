package lazy_not_safe;

public class Singleton {
    //定义唯一实例的引用
    private static Singleton instance;
    //私有化构造方法,防止外部创建实例
    private Singleton(){

    }
    //判断引用是否指向实例,如果为空创建实例,如果存在则返回实例
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
