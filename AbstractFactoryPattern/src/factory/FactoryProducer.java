package factory;

// 生产工厂类,根据参数创建工厂,即创建工厂的工厂
public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("Food")){
            return new FoodFactory();
        } else if(factoryType.equalsIgnoreCase("Wrapper")){
            return new WrapperFactory();
        }
        return null;
    }
}
