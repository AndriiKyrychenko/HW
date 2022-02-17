import java.util.Objects;

public class Circle {

    private final Point circleCenter;
    private final double radius;

    public Circle(Point circleCenter, double radius) {
        this.circleCenter = circleCenter;
        this.radius = radius;
    }

    public boolean pointInCircle(Point point) {
        return point.getDistance(circleCenter) <= radius;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Circle circle = (Circle) object;
        return Objects.equals(circleCenter, circle.circleCenter) && Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle { "
                + "circleCenter: " + circleCenter
                + ", radius: " + radius + "}";
    }

    @Override
    public int hashCode() {
        int factor = 31;
        int result = 1;
        result = factor * result + circleCenter.hashCode();
        long temp = Double.doubleToLongBits(radius);
        result = factor * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}