package pl.wyder.coffeemachine.model;

public class MilkBox extends Box {
    private int MAX_MILK = 10;
    @Override
    void fillBox(){
        numberOfProduct = MAX_MILK;
    }
}
