// 测试类
public class Demo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        CommandInvoker invoker = new CommandInvoker();
        invoker.takeOrder(buyStockOrder);
        invoker.takeOrder(sellStockOrder);

        invoker.placeOrders();
    }
}
