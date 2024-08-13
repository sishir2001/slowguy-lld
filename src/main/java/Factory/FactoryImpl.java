package Factory;

public class FactoryImpl {
    public static void main(String[] args) {
        ButtonFactory button1 = new LinuxButtonFactory();
        button1.addButton();
        ButtonFactory button2 = new WindowsButtonFactory();
        button2.addButton();
    }

}
