public class Parallelogram implements Figure {
    private double baseSide;
    private double side;
    private double height;

    public Parallelogram(double baseSide, double side, double height) {
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        double v = 2 * baseSide + 2 * side;
        return v;
    }

    @Override
    public double getArea() {
        double v = baseSide * height;
        return v;
    }

    @Override
    public boolean getType() {
        return false;
    }
}
