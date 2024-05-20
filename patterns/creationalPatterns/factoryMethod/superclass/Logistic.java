package creationalPatterns.factoryMethod.superclass;

import creationalPatterns.factoryMethod.productInterface.Transport;

public abstract class Logistic {

    public void planDelivery(){
        Transport transport = createTransport();
        transport.deliver();
    };

    public abstract Transport createTransport();
}
