public class Context {
    private CashSuper cashSuper;

    public Context(String type) {//这里特别注意：传入的不再是一个对象，而是收费类型字符串
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300减100":
                cashSuper = new CashReturn(300, 100);
                break;
            case "8折":
                cashSuper = new CashRebate(0.8);
                break;
            default:
                throw new RuntimeException("输入错误");
        }
    }

    public double getResult(double money){//根据不同收费策略返回不同计算结果
        return cashSuper.acceptCash(money);
    }

    /**
     * @Description TODO 简单工厂+策略模式测试方法
     * @author LaoQin
     * @date 2020/03/15
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        Context context = new Context("8折");
        double result = context.getResult(100);
        System.out.println("打折后的金额为:"+result);

    }
}
