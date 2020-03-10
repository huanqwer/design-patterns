import java.util.Scanner;

public class Calc {
    /**
     * @Description TODO 视图层
     * @author LaoQin
     * @date 2020/03/10
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入数字A");
            double numberA = Double.valueOf(scanner.nextLine());
            System.out.println("请选择运算符号");
            String operate = scanner.nextLine();
            System.out.println("请输入数字B");
            double numberB = Double.valueOf(scanner.nextLine());
            System.out.println("计算结果为：" + getResult(numberA,numberB,operate));

            Operation op = OperationFactory.createOperate("+");
            op.setNumberA(1);
            op.setNumberB(2);
            double result = op.getResult();

        }catch (Exception e){
            System.out.println("输入有误，请检查");
        }
    }
    /**
     * @Description TODO 逻辑层
     * @author LaoQin
     * @date 2020/03/10
     * @param numberA
     * @param numberB
     * @param operate
     * @return double
     */
    public static double getResult(double numberA,double numberB,String operate){
        double result = 0;
        switch (operate){
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA-numberB;
                break;
            case "*":
                result = numberA*numberB;
                break;
            case "/":
                if(numberB == 0){
                    System.out.println("除数不能为0！");
                    throw new RuntimeException();
                }
                result = numberA/numberB;
        }
        return result;
    }
}
