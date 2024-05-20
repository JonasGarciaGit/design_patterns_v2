package creationalPatterns.factoryMethod.subclass;

import creationalPatterns.factoryMethod.productInterface.impl.Ship;
import creationalPatterns.factoryMethod.productInterface.Transport;
import creationalPatterns.factoryMethod.superclass.Logistic;

public class SeaLogistics extends Logistic {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
