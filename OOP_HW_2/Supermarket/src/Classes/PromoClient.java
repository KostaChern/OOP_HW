// 1) Добавить класс, описывающий акционного клиента. Включить поле название акции, id клиента и 
// количество участников в акции(поле статическое)
// 2) Добавить интерфейс iReturnOrder возврата товара. Продумать какие методы могут понадобиться и 
// подключить интерфейс к классам клиентов.
// 3) Добавить комментарии(javadoc) ко всем методам и интерфейсам.



package Classes;

public class PromoClient extends Actor {
    private String promoCode; //Название акции
    private int idClient; //id клиента акции
    private static int clientNumber; // Номер клиента
    public PromoClient(String name, Integer id, Integer clientNumber) {
        super(name);
        idClient = id;
        this.promoCode = promoCode;
        clientNumber ++; // увеличиваем номер клиента при создании нового объекта класса
    }
            
    @Override
        public String getName() {
        return super.name;
    }
         public String getPromoCode() {
        return promoCode;
    }    
         public static int getClientNumber() {
         return clientNumber;       
         }

     public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
            
     public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
            
     public void setTakeOrder(boolean makeOder) {
       super.isMakeOrder = makeOder;
    }
                
     public void setMakeOrder(boolean pikUpOrder) {
       super.isTakeOrder = pikUpOrder;
    }
            
     public Actor getActor() {
        return this;              
    }
}
