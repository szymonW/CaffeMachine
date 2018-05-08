package pl.wyder.coffeemachine.model;

//Storage jest singletonem - ukrywamy
public class Storage {
    private static Storage storage;
    private Box coffee = new Coffeebox();
    private Box milk = new MilkBox();

    private Storage(){
        public static Storage getInstance(){
            if(storage == null){
                storage = new Storage();
            }
            return storage;
        }
    }

    public void getCoffee() throws EmptyProductBox{
        if (!coffee.getProduct()){
            throw new EmptyProductBox();
        }
    }

    public void getMilk() throws EmptyProductBox {
        if (!milk.getProduct()) {
            throw new EmptyProductBox();
        }
    }
}
