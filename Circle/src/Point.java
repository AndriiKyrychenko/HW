public class Point {

    private final double pointX;
    private final double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public double getDistance(Point point) {
        return Math.sqrt(Math.pow((this.pointX - point.getPointX()), 2) + Math.pow((this.pointY - point.getPointY()), 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + pointX +
                ", y=" + pointY + "}";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Point point = (Point) object;
        return pointX == point.pointX && pointY == point.pointY;
    }

    @Override
    public int hashCode() {
        int factor = 31;
        int result = 1;
        long temp = Double.doubleToLongBits(pointX);
        result = factor * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(pointY);
        result = factor * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


}