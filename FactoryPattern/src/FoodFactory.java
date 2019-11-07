// 食物工厂类
public class FoodFactory {
    // 根据传入的参数来创建对应的实体类
    public Food getFood(String foodType){
        if(foodType.equalsIgnoreCase("AmericanBurger")){
            return new AmericanBurger();
        } else if(foodType.equalsIgnoreCase("FrenchFries")){
            return new FrenchFries();
        } else if(foodType.equalsIgnoreCase("IndianMiFans")){
            return new IndianMiFans();
        }
        // 没有匹配值返回空
        return null;
    }
}
