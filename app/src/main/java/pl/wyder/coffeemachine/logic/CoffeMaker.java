package pl.wyder.coffeemachine.logic;

import pl.wyder.coffeemachine.model.Storage;

public abstract class CoffeMaker {
    Storage storage;
    UserInterface userInterface;

    CoffeMaker (UserInterface ui){

    }

    abstract public boolean MakeCoffe();

}
