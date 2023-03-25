import java.util.HashMap;
import java.util.Map;

public class AirplaneFactorySingleton {
    private static Map<String, AirplaneFactory> instances = new HashMap<>();

    public static AirplaneFactory getInstance(String factoryType) {
        AirplaneFactory instance = instance.get(factoryType);

        if (instance == null) {
            // Only create a new instance if one doesn't exist yet
            switch(factoryType) {
                case "Airbus":
                    instance = new AirbusFactory();
                    break;
                case "Boeing":
                    instance = new BoeingFactory();
                    break;
                case "Embraer":
                    instance = new EmbraerFactory();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid factory type");
            }
            instances.put(factoryType, instance);
        }
        return instance;
    }
}