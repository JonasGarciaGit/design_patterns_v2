package creationalPatterns.factoryMethod.subclass;

import creationalPatterns.factoryMethod.productInterface.Transport;
import creationalPatterns.factoryMethod.productInterface.impl.Airplane;
import creationalPatterns.factoryMethod.superclass.Logistic;

public class AirLogistics extends Logistic {
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
