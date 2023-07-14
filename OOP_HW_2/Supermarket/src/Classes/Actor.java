package Classes;

import Interfaces.iActorBehaviuor;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviuor {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean iReturnOrder;

    public Actor(String name) {
        this.name = name;
    }

    abstract public String getName();

    // public boolean isTakeOrder() {
    //     return isTakeOrder;
    // }

    // public boolean isMakeOrder() {
    //     return isMakeOrder;
    // }

    // public void setTakeOrder(boolean takeOrder) {
    //     isTakeOrder = takeOrder;
    // }

    // public void setMakeOrder(boolean makeOrder) {
    //     isMakeOrder = makeOrder;
    // }
}
