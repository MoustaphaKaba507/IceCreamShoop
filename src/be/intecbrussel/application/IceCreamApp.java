package be.intecbrussel.application;

import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.eatables.PriceList;
import be.intecbrussel.sellers.IceCreamSalon;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList priceList=new PriceList(0.25,0.20,0.01);

        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList,0.46);
        iceCreamSalon.orderIceRocket();
        iceCreamSalon.orderCone(new Flavor[]{Flavor.BANANA,Flavor.LEMON});
        iceCreamSalon.orderMagnum(MagnumType.MILKCHOCOLATE);

        System.out.println(iceCreamSalon.getProfit());



    }
}
