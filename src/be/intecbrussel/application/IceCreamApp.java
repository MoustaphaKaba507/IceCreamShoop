package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList priceList=new PriceList(10,20,100);
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);

        Cone cone =iceCreamSalon.orderCone(new Flavor[]{Flavor.BANANA,Flavor.LEMON});
        IceRocket iceRocket = iceCreamSalon.orderIceRocket();
        Magnum magnum =iceCreamSalon.orderMagnum(MagnumType.BLACKCHOCOLATE);

        Eatable[] icecreams = new Eatable[]{cone,iceRocket,magnum};

        for(Eatable icecream : icecreams){
            icecream.eat();
        }

        System.out.println("PROFIT: "+ iceCreamSalon.getProfit());



    }
}
