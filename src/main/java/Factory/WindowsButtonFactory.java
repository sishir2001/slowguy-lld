package Factory;

public class WindowsButtonFactory extends ButtonFactory {

    @Override
    BreezeButton createButton() {
        return new WindowsButton();
    }
}
