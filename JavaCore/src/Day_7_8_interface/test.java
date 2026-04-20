package Day_7_8_interface;

public class test {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 3);
        Shape circle = new Circle(2.5);

        System.out.println("Rectangle:");
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());

        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
    }
}
