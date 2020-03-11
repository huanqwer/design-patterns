import java.util.Scanner;

/**
 * @Description 张三第一版
 * @Author LaoQin
 * @Date 2020/03/11 20:42
 **/
public class Market01 {
    private static double totalPrice = 0.0;
    private static double discount = 1.0;//默认不打折

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择折扣");
        System.out.println("0.不打折");
        System.out.println("1.八折");
        System.out.println("2.七折");
        System.out.println("3.六折");
        System.out.println("4.五折");
        String choice = scanner.nextLine();
        switch (choice){
            case "0":
                 // do nothing
                break;
            case "1":
                discount = 0.8;
                break;
            case "2":
                discount = 0.7;
                break;
            case "3":
                discount = 0.6;
                break;
            case "4":
                discount = 0.5;
                break;
            default:
                System.out.println("输入错误！");
                System.exit(-1);
        }
        while (true){
            System.out.println("请输入单价(元)");
            String singlePrice = scanner.nextLine();
            System.out.println("请输入数量");
            String count = scanner.nextLine();
            /*累加之前乘以打折系数*/
            totalPrice += (Double.valueOf(singlePrice)*Double.valueOf(count))*discount;
            System.out.println("总价为："+String.format("%.2f",totalPrice)+"元");
        }
    }
}
