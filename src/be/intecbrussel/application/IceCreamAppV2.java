package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {

        PriceList priceList = new PriceList(0.65,0.23,0.04);
        Stock stock = new Stock(2,2,2,2);


        IceCreamCar iceCreamCar = new IceCreamCar(priceList,stock);

        Cone cone = iceCreamCar.orderCone(new Flavor[] {Flavor.LEMON,Flavor.BANANA});
        IceRocket iceRocket = iceCreamCar.orderIceRocket();
        IceRocket iceRocket1 = iceCreamCar.orderIceRocket();
        IceRocket iceRocket2 = iceCreamCar.orderIceRocket();
        IceRocket iceRocket3 = iceCreamCar.orderIceRocket();
        IceRocket iceRocket4= iceCreamCar.orderIceRocket();
        IceRocket iceRocket5 = iceCreamCar.orderIceRocket();
        Magnum magnum =iceCreamCar.orderMagnum(MagnumType.BLACKCHOCOLATE);

        Eatable[] eatables = new Eatable[]{cone, iceRocket, iceRocket1, iceRocket2, iceRocket3, iceRocket4, iceRocket5};

        for(Eatable eatable : eatables){
            if(eatable != null){
                eatable.eat();
            }
        }

        System.out.println("Profit: "+iceCreamCar.getProfit());


    }
}
