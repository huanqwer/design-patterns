// 测试类
public class Demo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");
        ConcreteObserver observer3 = new ConcreteObserver("Observer 3");

        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        System.out.println("First message change:");
        subject.setMessage("Hello World!");

        subject.detach(observer2);

        System.out.println("\nSecond message change:");
        subject.setMessage("Hello Design Patterns!");
    }
}
