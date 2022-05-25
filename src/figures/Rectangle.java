package figures;

public class Rectangle extends Figure {

    @Override
    public void AddPoints(Point x, Point y) {
        points.add(x);
        points.add(new Point(y.getX(), x.getY()));
        points.add(y);
        points.add(new Point(x.getX(), y.getY()));
    }
}