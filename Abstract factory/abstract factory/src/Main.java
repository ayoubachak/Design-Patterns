public class Main {
    public static void main(String[] args) {
        GUIFactory factory;
        if (System.getProperty("os.name").equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }
        Button button = factory.createButton();
        Label label = factory.createLabel();
        button.paint();
        label.paint();
    }
}
