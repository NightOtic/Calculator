public class MainPX {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(3, 5);
        Triangle triangle = new Triangle(5.0,3.0,4.0);

        calculateAreaAndShow(circle);
        calculateAreaAndShow(rectangle);
        calculateAreaAndShow(triangle);
    }

    private static void calculateAreaAndShow(ShapeCalculable figure) {
        System.out.println(figure.calculateArea());
        System.out.println(figure);
    }
}
