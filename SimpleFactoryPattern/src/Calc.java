import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入数字A");
            String numA = scanner.nextLine();
            System.out.println("请选择运算符号");
            String operate = scanner.nextLine();
            System.out.println("请输入数字B");
            String numB = scanner.nextLine();
            String result = null;
            switch (operate){
                case "+":
                    result = (Double.valueOf(numA) + Double.valueOf(numB)) + "";
                    break;
                case "-":
                    result = (Double.valueOf(numA) - Double.valueOf(numB)) + "";
                    break;
                case "*":
                    result = (Double.valueOf(numA) * Double.valueOf(numB)) + "";
                    break;
                case "/":
                    if(numB.equals("0")){
                        System.out.println("除数不能为0！");
                        return;
                    }
                    result = (Double.valueOf(numA) / Double.valueOf(numB)) + "";
            }
            System.out.println("计算结果为：" + result);
        }catch (Exception e){
            System.out.println("输入有误，请检查");
        }
    }
}
