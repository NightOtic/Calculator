public class Triangle implements ShapeCalculable {
    private final Double a;
    private final Double h;
    private final Double b;
    private final Double c;


    public Triangle(Double a, Double b, Double c) {
        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new IllegalArgumentException("Trojkat jest nieprawidlowy");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = 0.5 * a * Math.sqrt(2);
    }

    @Override
    public double calculateArea() {
        return a / 2 * h;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trójkat, ");
        sb.append(" A: ").append(a).append(", ");
        sb.append(" B: ").append(b).append(", ");
        sb.append(" C: ").append(c).append(", ");
        sb.append(" H: ").append(h).append(", ");
        sb.append("pole: ").append(calculateArea()).append(", ");
        sb.append("obwód: ").append(calculatePerimeter());
        return sb.toString();
    }
}
