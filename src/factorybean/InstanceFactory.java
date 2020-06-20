package src.factorybean;

import java.util.HashMap;
import java.util.Map;

//实例工厂方法，需要创建InstanceFactory工厂本身，再调用工厂的实例方法来返回bean的实例
public class InstanceFactory {
    private Map<String, Car> cars = null;

    public InstanceFactory() {
        cars = new HashMap<>();
        cars.put("audi", new Car("audi", 300000));
        cars.put("ford", new Car("ford", 500000));
    }

    public Car getCar(String brand) {
        return cars.get(brand);
    }

}
