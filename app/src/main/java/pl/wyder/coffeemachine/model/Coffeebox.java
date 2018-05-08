package pl.wyder.coffeemachine.model;

public class Coffeebox extends Box{
    private static int MAX_NUMBER_OF_COFFEE =20;

    Coffeebox(){
        fillBox();
    }

    void fillBox(){
        numberOfProduct = MAX_NUMBER_OF_COFFEE;
    }
}
