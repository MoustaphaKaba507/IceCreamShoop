package be.intecbrussel.application;

import be.intecbrussel.eatables.PriceList;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {
    public static void main(String[] args) {

        PriceList priceList = new PriceList(0.65,0.23,0.04);
        Stock stock = new Stock(4,8,9,10);


        IceCreamCar iceCreamCar = new IceCreamCar(priceList,stock);
        IceCreamSeller iceCreamCar1 = iceCreamCar;

        int stockRest = stock.getIceRockets();
        for(int i = 0; i < stock.getIceRockets(); i++ ){

            if(stockRest > 0){
                stockRest--;
                System.out.println(stockRest);
            }
            System.out.println("Out of stock ");
        }



    }
}
