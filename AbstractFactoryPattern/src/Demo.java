import factory.AbstractFactory;
import factory.FactoryProducer;
import food.Food;
import wrapper.Wrapper;

// 测试抽象工厂模式
public class Demo {
    public static void main(String[] args) {
        // 获取食物工厂
        AbstractFactory foodFactory = FactoryProducer.getFactory("food");
        // 获取包装工厂
        AbstractFactory wrapperFactory = FactoryProducer.getFactory("wrapper");

        //用工厂生产餐盒+白羽鸡
        Wrapper box = wrapperFactory.getWrapper("餐盒");
        Food whiteChicken = foodFactory.getFood("白羽鸡");

        //打印测试
        System.out.println("生产了一个包装:");
        box.printName();
        System.out.println("生产了一个食物:");
        whiteChicken.printName();
    }
}
