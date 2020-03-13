public class CashRebate extends CashSuper{

    private  double rebate = 1.0;

    public CashRebate(double rebate){
        this.rebate  = rebate;
    }

    /**
     * @Description TODO 打折后返回打折金额
     * @author LaoQin
     * @date 2020/03/13
     * @param money
     * @return double
     */
    @Override
    public double acceptCash(double money) {
        return money*rebate;
    }
}
