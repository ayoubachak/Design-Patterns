public class MacOSFactory implements GUIFactory {
    public Button createButton() {
        return new MacOSButton();
    }
    public Label createLabel() {
        return new MacOSLabel();
    }
}