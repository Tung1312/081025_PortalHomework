public abstract class Shape {
    protected Point centerPoint;
    protected static int count = 0;

    public Shape(Point centerPoint) {
        this.centerPoint = new Point(centerPoint.getX(), centerPoint.getY());
        count++;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public static int getCount() {
        return count;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public abstract String toString();
}
