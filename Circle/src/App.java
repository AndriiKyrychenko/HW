import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PointList pointList = new PointList();

        while (true) {
            System.out.println("| введите координаты точки");
            System.out.print("| x: ");
            double pointX = scanner.nextDouble();
            System.out.print("| y: ");
            double pointY = scanner.nextDouble();
            Point point = new Point(pointX, pointY);
            pointList.add(point);
            int userChoice;
            while (true) {
                System.out.println("| добавить ещё точку? (1-да, 2-нет)");
                userChoice = scanner.nextInt();
                if (userChoice == 1 || userChoice == 2) {
                    break;
                } else {
                    System.out.println("| доступны к вводу 1 и 2");
                    System.out.println("| повторите выбор");
                }
            }
            if (userChoice == 2) {
                break;
            }
        }

        System.out.println("| введите координаты центра окружности:");
        System.out.print("| x: ");
        double pointX = scanner.nextInt();
        System.out.print("| y: ");
        double pointy = scanner.nextInt();
        System.out.print("| введите радиус окружности: ");
        double radius = scanner.nextDouble();
        Point circleCenter = new Point(pointX, pointy);
        Circle circle = new Circle(circleCenter, radius);

        List<Point> pointsInCircle = pointList.getPointsInCircle(circle);

        System.out.println("| результаты расчета ");
        if (pointsInCircle.size() == 0) {
            System.out.println("| в пределах окружности нет точек");
        } else {
            System.out.println("| в окружности находи(я)тся " + pointsInCircle.size() + " точка/точки/точек");
            System.out.println("| " + pointsInCircle);
        }
    }
}