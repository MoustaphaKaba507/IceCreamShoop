package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable{

    private Flavor[] balls;

   //Constructor
    public Cone() {
        this.balls=new Flavor[]{Flavor.BANANA};
    }

    public Cone(Flavor[] balls) {

        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.println("We are eating  "+ Arrays.toString(balls) + " cone");

    }
}
