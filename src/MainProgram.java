import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    private static final List<Shape> shapes = new ArrayList<>();

    public static void main(String[] args) {
        shapes.add(new Rectangle(new Point(5, 3), 10, 6));
        shapes.add(new Square(new Point(0, 0), 4));
        shapes.add(new Circle(new Point(2, 7), 5));
        shapes.add(new Rectangle(new Point(8, 4), 12, 8));
        shapes.add(new Square(new Point(-3, 2), 6));
        shapes.add(new Circle(new Point(1, -2), 3));

        printCount();
        printDetails();
        printCenters();
    }

    private static void printCount() {
        System.out.println("Số lượng hình đã khởi tạo: " + Shape.getCount());
        System.out.println();
    }

    private static void printDetails() {
        System.out.println("Danh sách chi tiết các hình đã khởi tạo:");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println((i + 1) + ", " + shapes.get(i));
        }
        System.out.println();
    }

    private static void printCenters() {
        System.out.println("Danh sách tâm điểm: ");
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            System.out.println((i + 1) + ", " + shape.getCenterPoint());
        }
    }
}
