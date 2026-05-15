// 抽象建造者接口
public interface Builder {
    void buildCpu();
    void buildRam();
    void buildStorage();
    void buildGpu();
    Computer getResult();
}
