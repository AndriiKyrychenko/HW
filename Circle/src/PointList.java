import java.util.ArrayList;

public class PointList extends ArrayList<Point> {

    public PointList getPointsInCircle(Circle circle) {
        PointList result = new PointList();
        for (Point pointTemp : this) {
            if (circle.pointInCircle(pointTemp)) {
                result.add(pointTemp);
            }
        }
        return result;
    }
}