package pl.wyder.coffeemachine.logic;

public interface UserInterface {
    void showThatCoffeeIsReady(String msg);
    void showStep(String msg, int step);
    void showError(String msg);
}
