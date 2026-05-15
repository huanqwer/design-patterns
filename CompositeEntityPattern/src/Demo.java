// 测试类
public class Demo {
    public static void main(String[] args) {
        CompositeEntity compositeEntity = new CompositeEntity();

        compositeEntity.setData("Test", "Data");
        String[] data = compositeEntity.getData();

        for (String datum : data) {
            System.out.println("Data: " + datum);
        }
    }
}
