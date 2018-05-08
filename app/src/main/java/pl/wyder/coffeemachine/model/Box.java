package pl.wyder.coffeemachine.model;

public abstract class Box {
    protected int numberOfProduct;

    boolean getProduct(){
        if (numberOfProduct>0){
            numberOfProduct--;
            return true;
        }
        return false;
    }

    abstract void fillBox();
}
