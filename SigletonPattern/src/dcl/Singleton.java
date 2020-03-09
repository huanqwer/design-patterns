package dcl;

//双重检验锁,兼具性能和安全,需要jdk1.5以上支持
public class Singleton {
    //私有化引用,同时使用volatile来防止编译器优化,保证每次更新后所有线程都读取到最新值
    private  volatile static Singleton singleton;
    //私有化构造方法,防止被外部创建
    private Singleton(){

    }
    //获取实例的唯一方法,同时在创建的时候加一个对象锁
    public static Singleton getInstance(){
        /*说明下为什么有双重if
        * 第一重if判断没有对象先锁住整个对象,防止其他线程读取
        * 第二重if再次确认中间没有别的线程创建了对象
        * 然后创建对象并返回
        * */
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
