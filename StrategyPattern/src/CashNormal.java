public class CashNormal extends CashSuper {
    /**
     * @Description TODO 原价收费
     * @author LaoQin
     * @date 2020/03/13
     * @param money
     * @return double
     */
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
