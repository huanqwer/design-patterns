// 具体建造者 - 游戏电脑建造者
public class GamingComputerBuilder implements Builder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Intel i9-13900K");
    }

    @Override
    public void buildRam() {
        computer.setRam("32GB DDR5");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("2TB NVMe SSD");
    }

    @Override
    public void buildGpu() {
        computer.setGpu("NVIDIA RTX 4090");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
