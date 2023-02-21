public class Circle implements ShapeCalculable {

    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return (Math.PI * r) * (Math.PI * r);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
}
