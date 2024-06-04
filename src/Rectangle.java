public class Rectangle implements Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        double v = 2 * sideA + 2 * sideB;
        return v;
    }

    @Override
    public double getArea() {
        double v = sideA * sideB;
        return v;
    }

    @Override
    public boolean getType() {
        return false;
    }
}
