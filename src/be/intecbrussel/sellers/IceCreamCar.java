package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller {
    private PriceList priceList;
    private Stock stock;
    private double profit;

    //Constructor
    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
        profit = 0;
    }

    //Method
    public Cone orderCone(Flavor[] balls){
        Cone cone = prepareCone(balls);
        if(cone == null) return null;
        profit += priceList.getBallPrice()*0.25* balls.length;
        return cone;


    }

    public Cone prepareCone(Flavor[] balls){
        int conesLeft = stock.getCones();
        int ballsLeft = stock.getBalls();
        if(conesLeft < balls.length || ballsLeft < 0){
            System.out.println("no more cone");

        }
        stock.setCones(-balls.length);
        stock.setBalls(0);
        return new Cone();
    }

    public IceRocket orderIceRocket(){
        IceRocket iceRocket = prepareRocket();
        if(iceRocket != null) {

      profit += priceList.getRocketPrice()*0.20;
        };

      return iceRocket;

    }

    public IceRocket prepareRocket(){
        int productLeft = stock.getIceRockets();
        if(productLeft <= 0){
            System.out.println("out of ice cream");
            return null;
        }
        stock.setIceRockets(productLeft-1);
            return new IceRocket();


    }
    @Override
    public Magnum orderMagnum(MagnumType type) {
        Magnum magnum = prepareMagnum(MagnumType.MILKCHOCOLATE);
        if(magnum == null){
            profit += priceList.getMagnumPrice(MagnumType.MILKCHOCOLATE)*0.01;

        }
        return new Magnum();
    }


    public Magnum prepareMagnum(MagnumType type){
        int productleft = stock.getMagni();
        if (productleft == 0){
            System.out.println("out of magnum");
        }
        stock.setMagni(productleft-1);
     return new Magnum();
    }

    @Override
    public double getProfit() {
        return 0;
    }


}
