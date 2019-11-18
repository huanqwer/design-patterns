package factory;

import food.BlackChicken;
import food.WhiteChicken;
import food.YellowChicken;
import food.Food;
import wrapper.Wrapper;

// 生产各种鸡的工厂
public class FoodFactory extends AbstractFactory{
    @Override
    public Food getFood(String foodType){
        if(foodType.equalsIgnoreCase("白羽鸡")){
            return new WhiteChicken();
        } else if(foodType.equalsIgnoreCase("黑羽鸡")){
            return new BlackChicken();
        } else if(foodType.equalsIgnoreCase("黄羽鸡")){
            return new YellowChicken();
        }
        // 没有匹配值返回空
        return null;
    }

    @Override
    public Wrapper getWrapper(String wrapper) {
        return null;
    }
}
