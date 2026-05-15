// 服务定位器
import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {
    private static Map<String, Service> cache = new HashMap<String, Service>();

    public static Service getService(String serviceName) {
        Service service = cache.get(serviceName);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        Service newService = context.lookup(serviceName);
        cache.put(serviceName, newService);
        return newService;
    }
}
