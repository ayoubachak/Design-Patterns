public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        System.out.println("Decorated with red border:");
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();
    }
}
