package pl.wyder.coffeemachine.logic;

import pl.wyder.coffeemachine.model.EmptyProductBox;

public class EsspressoMaker extends CoffeMaker {
    EsspressoMaker(UserInterface ui){
        super(ui);
    }

    @Override
    public boolean MakeCoffe() {
        try {
            storage.getCoffee();
            userInterface.showThatCoffeeIsReady("Ready");
            return true;
        } catch (EmptyProductBox emptyProductBox) {
            userInterface.showError("Brak kawy");
        }
        return false;
    }

}
