import java.util.Scanner;

public class FactoryTestApplication {
    /**
     * @Description TODO 测试简单工厂实现
     * @author LaoQin
     * @date 2020/03/15
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入金额");
        double money = Double.valueOf(scanner.nextLine());
        System.out.println("请选择折扣类型：");
        System.out.println("正常收费");
        System.out.println("满300减100：");
        System.out.println("8折");
        String type = scanner.nextLine();
        //创建对应收费子类
        CashSuper cashAccept = CashFactory.createCashAccept(type);


        double result = cashAccept.acceptCash(money);
        System.out.println("优惠后金额为:"+result);
    }
}
