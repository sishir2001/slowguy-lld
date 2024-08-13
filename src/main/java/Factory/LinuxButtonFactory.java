package Factory;

public class LinuxButtonFactory extends ButtonFactory {
    @Override
    BreezeButton createButton() {
        return new LinuxButton();
    }
}
