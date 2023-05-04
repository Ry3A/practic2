package lab6;

import lab6.abstrac.Client;
import lab6.abstrac.IceCreamFactory;
import lab6.abstrac.IceCreamFactoryA;
import lab6.abstrac.IceCreamFactoryB;
import lab6.factory.CircleWaffleMaker;
import lab6.factory.RectangularWaffleMaker;
import lab6.factory.Waffle;
import lab6.factory.WaffleMaker;

public class App {
    public static void main(String[] args) {
        System.out.println("Factory method example: ");
        WaffleMaker[] waffleMakers = { new CircleWaffleMaker(), new RectangularWaffleMaker() };
        for (WaffleMaker waffleMaker : waffleMakers) {
            Waffle waffle = waffleMaker.factoryMethod();
            waffle.print();
        }
        System.out.println();

        System.out.println("Abstract factory example: ");
        IceCreamFactory[] iceCreamFactories = { new IceCreamFactoryA(), new IceCreamFactoryB() };
        for (IceCreamFactory iceCreamFactory : iceCreamFactories) {
            Client client = new Client(iceCreamFactory);
            client.execute();
        }
        System.out.println();
    }
}


