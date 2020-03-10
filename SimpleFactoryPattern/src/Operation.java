
public abstract class Operation {

    protected double numberA;
    protected double numberB;

    /**
     * @Description TODO 获取结果
     * @author LaoQin
     * @date 2020/03/10
     * @param
     * @return double
     */
    public abstract double getResult();

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
