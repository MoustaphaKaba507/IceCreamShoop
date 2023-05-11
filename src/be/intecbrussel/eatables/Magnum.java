package be.intecbrussel.eatables;

public class Magnum implements Eatable{
    private  MagnumType type;



    //Constructor
    public  Magnum(){

    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    //Method
    public void eat(){
        System.out.println("eating "+ type );

    }
    public MagnumType getType(){
        return type;
    }



}
