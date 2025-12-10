public class Rectangle {
    private double x;
    private double y;

    public Rectangle(double x, double y) {
        if (x <= 0 || y <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getArea() {
        return x * y;
    }

    public double perimeter() {
        return 2 * (x + y);  // Исправлено: * вместо ×
    }
}