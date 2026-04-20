package Day_7_8_interface;

class Circle implements Shape {
    private double r;

    public Circle(double radius) {
        this.r = radius;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}