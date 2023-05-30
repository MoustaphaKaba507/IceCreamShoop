package be.intecbrussel.sellers;

import be.intecbrussel.eatables.MagnumType;

public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    //Constructor
    public PriceList() {
        //Default pricelist
        this.ballPrice=1;
        this.rocketPrice=2;
        this.magnumStandardPrice=4;

    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    //getters and setters
    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    //Method
    public double getMagnumPrice(MagnumType type){
        switch (type){
            case ALPINENUTS:
                return magnumStandardPrice * 1.5;
            case MILKCHOCOLATE:
                return magnumStandardPrice * 1.1;
            case WHITECHOCOLATE:
                return magnumStandardPrice * 1.4;
            default:
                return magnumStandardPrice * 2;
        }

    }
}
