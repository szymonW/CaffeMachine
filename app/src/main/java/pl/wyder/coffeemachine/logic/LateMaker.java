package pl.wyder.coffeemachine.logic;

import pl.wyder.coffeemachine.model.EmptyProductBox;

public class LateMaker extends CoffeMaker{
    LateMaker(UserInterface ui){
        super(ui);
    }

    @Override
    public boolean MakeCoffe() {
        boolean status = false;
        try {
            storage.getCoffee();
            userInterface.showStep("Kawa", 50);
            storage.getMilk();
            userInterface.showStep("Mleko", 100);
            status = true;
        } catch (EmptyProductBox emptyProductBox) {
            userInterface.showError("Brak produktu");
        }
        return status;
    }
}
