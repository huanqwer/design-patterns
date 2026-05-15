// 初始上下文
import java.util.HashMap;
import java.util.Map;

public class InitialContext {
    private Map<String, Service> services = new HashMap<String, Service>();

    public InitialContext() {
        services.put("Service1", new Service1());
        services.put("Service2", new Service2());
    }

    public Service lookup(String serviceName) {
        return services.get(serviceName);
    }
}
