interface Shape {
    void draw();
}

class Rectangle {
    public void draw(int x1, int y1, int x2, int y2) {
        // Draw a rectangle
        System.out.println("Drawing a rectangle");
    }
}

class RectangleAdapter implements Shape {
    private Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void draw() {
        rectangle.draw(0, 0, 100, 100);
    }
}
