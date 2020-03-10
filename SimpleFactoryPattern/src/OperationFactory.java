public class OperationFactory {
    public static Operation createOperate(String operate){
        //根据不同的运算符生成不同的对象
        switch (operate){
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationSub();
            case "*":
                return new OperationMul();
            case "/":
                return new OperationDiv();
        }
        return null;
    }
}
