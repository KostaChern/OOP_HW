import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PensionerClient;
import Classes.PromoClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviuor;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Market magnit = new Market();
        iActorBehaviuor client1 = new OrdinaryClient("Boris");
        iActorBehaviuor client2 = new SpecialClient("prezident",1001);
        iActorBehaviuor p = new PensionerClient("Sergey Nikolay",1111);
        iActorBehaviuor tax = new TaxService();
        iActorBehaviuor promoClient1 = new PromoClient("Вася Петров", 11, 55);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(tax);

        magnit.update();
    }
}
