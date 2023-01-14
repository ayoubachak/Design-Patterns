public class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
    public Label createLabel() {
        return new WindowsLabel();
    }
}