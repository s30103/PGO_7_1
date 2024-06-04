public class Circle implements Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double v = 2 * 3.14 * radius;
        return v;
    }

    @Override
    public double getArea() {
        double v = 3.14 * radius * radius;
        return v;
    }

    @Override
    public boolean getType() {
        return false;
    }
}
