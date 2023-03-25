import java.util.HashMap;
import java.util.Map;

public class CarFactorySingleton {
    private static Map<String, CarFactory> instances = new HashMap<>();

    public static CarFactory getInstance(String factoryType) {
        CarFactory instance = instances.get(factoryType);

        if (instance == null) {
            // Only create a new instance if one doesn't exist yet
            switch(factoryType) {
                case "Honda":
                    instance = new HondaFactory();
                    break;
                case "Porsche":
                    instance = new PorscheFactory();
                    break;
                case "Tesla":
                    instance = new TeslaFactory();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid factory type");
            }
            instances.put(factoryType, instance);
        }
        return instance;
    }
}