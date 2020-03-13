public class CashReturn extends CashSuper{
    private double moneyCondition = 0.0;//满
    private double moneyReturn = 0.0;//减

    public CashReturn(double moneyCondition, double returnCondition) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = returnCondition;
    }
    /**
     * @Description TODO 满减
     * @author LaoQin
     * @date 2020/03/13
     * @param money
     * @return double
     */
    @Override
    public double acceptCash(double money) {
        if(money>moneyCondition){//满足条件才能满减
            return money-moneyReturn;
        }
        return money;
    }
}
