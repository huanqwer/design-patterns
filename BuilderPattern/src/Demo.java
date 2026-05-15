// 测试类
public class Demo {
    public static void main(String[] args) {
        // 构建游戏电脑
        System.out.println("=== 构建游戏电脑 ===");
        Builder gamingBuilder = new GamingComputerBuilder();
        Director gamingDirector = new Director(gamingBuilder);
        gamingDirector.construct();
        Computer gamingComputer = gamingDirector.getComputer();
        System.out.println(gamingComputer);

        // 构建办公电脑
        System.out.println("\n=== 构建办公电脑 ===");
        Builder officeBuilder = new OfficeComputerBuilder();
        Director officeDirector = new Director(officeBuilder);
        officeDirector.construct();
        Computer officeComputer = officeDirector.getComputer();
        System.out.println(officeComputer);
    }
}
