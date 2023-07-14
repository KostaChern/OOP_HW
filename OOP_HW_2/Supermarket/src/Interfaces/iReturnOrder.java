// 2) Добавить интерфейс iReturnOrder возврата товара. Продумать какие методы могут понадобиться и 
// подключить интерфейс к классам клиентов.
// 3) Добавить комментарии(javadoc) ко всем методам и интерфейсам.

package Interfaces;

public interface iReturnOrder {
                void acceptToMarket(iActorBehaviuor actor);
                public void setTakeOrder(boolean takeOrder) ;
                public void setMakeOrder(boolean makeOrder) ;


                
}
