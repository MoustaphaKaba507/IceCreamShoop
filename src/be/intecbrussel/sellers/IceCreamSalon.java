package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller{

    private PriceList priceList;
    private double totalProfit;

    //Constructor
    public IceCreamSalon(PriceList priceList, double totalProfit) {
        this.priceList = priceList;
        totalProfit = 0;
    }

    @Override
    public Cone orderCone(Flavor[] balls) {
        totalProfit += priceList.getBallPrice()*0.25* balls.length;
        return new Cone(balls);
    }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit += priceList.getRocketPrice()*0.02;
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(MagnumType type) {
        totalProfit += priceList.getMagnumPrice(type) * 0.01;
        return new Magnum();
    }

    @Override
    public double getProfit() {
        return 0;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}











