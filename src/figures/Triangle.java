package figures;

public class Triangle extends Figure {

    @Override
    public void AddPoints(Point x, Point y) {
        points.add(new Point((x.getX() + y.getX()) / 2.0D, x.getY()));
        points.add(new Point(x.getX(), y.getY()));
        points.add(new Point(y.getX(), x.getY()));
    }
}
