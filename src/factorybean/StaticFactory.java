package src.factorybean;

import java.util.HashMap;
import java.util.Map;

//通过静态工厂方法返回Car实例，不需要创建StaticFactory实例
public class StaticFactory {

    public static Car getCar(String name) {
        return cars.get(name);
    }

    private static Map<String, Car> cars = new HashMap<>();

    static {
        cars.put("audi", new Car("audi", 300000));
        cars.put("ford", new Car("ford", 500000));
    }
}
