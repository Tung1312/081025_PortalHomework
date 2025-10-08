public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point centerPoint, double width, double height) {
        super(centerPoint);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;

    }

    @Override
    public double getPerimeter() {
        return 2 * ( height + width );
    }

    @Override
    public String toString() {
        return "Rectangle[center=" + centerPoint
                + ", width=" + width
                + ", height=" + height
                + ", area=" + getArea()
                + ", perimeter=" + getPerimeter()
                + "]";
    }
}
