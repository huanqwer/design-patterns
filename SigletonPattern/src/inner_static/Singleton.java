package inner_static;

//登记式/静态内部类
public class Singleton {
    //创建静态内部类,在类里面创建实例
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    //私有化构造方法,防止外部创建
    private Singleton (){}
    //直接返回内部类中的实例,这样不用加锁,并且静态区访问也快
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
