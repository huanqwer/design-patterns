// 测试类
public class Demo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new FilterChain());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Target target = new Target();
        filterManager.setTarget(target);

        filterManager.filterRequest("HOME");
    }
}
