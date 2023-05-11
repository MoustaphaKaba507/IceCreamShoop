package be.intecbrussel.eatables;

public class Cone implements Eatable{

    private Flavor[] balls;

   //Constructor
    public Cone() {

    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.println("eating Chocolate "+ balls);

    }
}
