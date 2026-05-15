// 具体建造者 - 办公电脑建造者
public class OfficeComputerBuilder implements Builder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Intel i5-13400");
    }

    @Override
    public void buildRam() {
        computer.setRam("16GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("512GB SSD");
    }

    @Override
    public void buildGpu() {
        computer.setGpu("Integrated Graphics");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
