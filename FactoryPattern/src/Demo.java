// 测试类
public class Demo {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory ();
        //调用每个实例的printName方法
        foodFactory.getFood("AmericanBurger").printName();
        foodFactory.getFood("FrenchFries").printName();
        foodFactory.getFood("IndianMiFans").printName();
    }
}
