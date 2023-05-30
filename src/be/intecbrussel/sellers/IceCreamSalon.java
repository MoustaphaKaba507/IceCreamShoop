package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller{

    private PriceList priceList;
    private double totalProfit;

    //Constructor

    public IceCreamSalon(PriceList priceList){
        this.priceList=priceList;
    }


    //Method
    @Override
    public Cone orderCone(Flavor[] balls) {
        Cone cone = new Cone(balls);

        totalProfit += priceList.getBallPrice()*0.25* balls.length;
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        totalProfit += priceList.getRocketPrice()*0.20;
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType type) {
        Magnum magnum = new Magnum(type);
        totalProfit += priceList.getMagnumPrice(type) * 0.01;
        return magnum;
    }

    @Override
    public double getProfit() {

        return totalProfit;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}











