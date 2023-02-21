class Rectangle implements ShapeCalculable {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {

        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {

        return b;
    }

    public void setB(double b) {

        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prostokąt, ");
        sb.append("bok A: ").append(a).append(", ");
        sb.append("bok B: ").append(b).append(", ");
        sb.append("pole: ").append(calculateArea()).append(", ");
        sb.append("obwód: ").append(calculatePerimeter());
        return sb.toString();
    }
}