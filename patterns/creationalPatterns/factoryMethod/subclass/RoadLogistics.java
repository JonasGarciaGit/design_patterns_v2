package creationalPatterns.factoryMethod.subclass;

import creationalPatterns.factoryMethod.productInterface.Transport;
import creationalPatterns.factoryMethod.productInterface.impl.Truck;
import creationalPatterns.factoryMethod.superclass.Logistic;

public class RoadLogistics extends Logistic {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
