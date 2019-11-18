package factory;

import food.Food;
import wrapper.Box;
import wrapper.Cup;
import wrapper.Wrapper;

// 生产包装的工厂
public class WrapperFactory extends AbstractFactory{
    @Override
    public Food getFood(String food) {
        return null;
    }
    @Override
    public Wrapper getWrapper(String wrapperType){
        if(wrapperType.equalsIgnoreCase("杯子")){
            return new Cup();
        } else if(wrapperType.equalsIgnoreCase("餐盒")){
            return new Box();
        }
        // 没有匹配值返回空
        return null;
    }
}
