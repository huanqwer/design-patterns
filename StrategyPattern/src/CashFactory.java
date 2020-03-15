public class CashFactory {
    /**
     * @param type 优惠分类
     * @return CashSuper
     * @Description TODO 现金收取工厂
     * @author LaoQin
     * @date 2020/03/15
     */
    public static CashSuper createCashAccept(String type) {
        CashSuper cashSuper = null;
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
        return cashSuper;
    }
}
