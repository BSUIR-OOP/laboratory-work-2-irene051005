package figures;


public class Square extends Figure {

    @Override
    public void AddPoints(Point x, Point y) {
        points.add(new Point(x.getX(), x.getY()));
        points.add(new Point(x.getX(), y.getY()));
        points.add(new Point(y.getX(), y.getY()));
        points.add(new Point(y.getX(), x.getY()));
    }
}
