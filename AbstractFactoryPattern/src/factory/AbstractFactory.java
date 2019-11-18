package factory;

import food.Food;
import wrapper.Wrapper;

// 抽象工厂,包含了工厂里的两个类的方法
public abstract class AbstractFactory {
    public abstract Food getFood(String food);
    public abstract Wrapper getWrapper(String wrapper) ;
}
