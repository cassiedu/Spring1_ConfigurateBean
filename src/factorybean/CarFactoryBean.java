package src.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean {
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public Object getObject() throws Exception {
        return new Car(brand, 6000000);
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
