package basic;

public class SingletonPattern {
    public static void main(String[] args) {
        //获取唯一可用对象
        Boss boss = Boss.getInstance();
        //老板签字
        boss.sign();
    }
}
