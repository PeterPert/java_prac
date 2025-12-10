import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Для круга
            System.out.print("Enter radius: ");
            double radius = input.nextDouble();
            Circle circle = new Circle(radius);
            System.out.println("Circle area: " + circle.getArea());
            System.out.println("Circumference (perimeter): " + circle.perimeter());

            // Для прямоугольника
            System.out.print("Enter width: ");
            double width = input.nextDouble();
            System.out.print("Enter height: ");
            double height = input.nextDouble();
            Rectangle rectangle = new Rectangle(width, height);
            System.out.println("Perimeter of rectangle: " + rectangle.perimeter());
            System.out.println("Rectangle area: " + rectangle.getArea());

            // Для треугольника
            System.out.print("Enter triangle sides a, b, c: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            Triangle triangle = new Triangle(a, b, c);
            System.out.println("Perimeter: " + triangle.perimeter());
            System.out.println("Area: " + triangle.getArea());

        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}