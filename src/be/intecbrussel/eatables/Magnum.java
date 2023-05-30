package be.intecbrussel.eatables;

public class Magnum implements Eatable{
    private  MagnumType type;


    //Constructor
    public  Magnum(){
        this.type=MagnumType.BLACKCHOCOLATE;

    }

    public Magnum(MagnumType type) {

        this.type = type;
    }

    //Method
    @Override
    public void eat(){
        System.out.println("we are eating a "+ type + "magnum" );

    }
    public MagnumType getType(){
        return type;
    }



}
