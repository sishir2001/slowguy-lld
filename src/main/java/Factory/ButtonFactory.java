package Factory;



public abstract class ButtonFactory {

    public void addButton() {
        BreezeButton button = createButton();
        button.showButton();
        System.out.println("Breeze Button is rendered");
    }
    abstract BreezeButton createButton();
}
