package figures;

public class Romb extends Figure {

    @Override
    public void AddPoints(Point x, Point y) {
        points.add(new Point((x.getX() + y.getX()) / 2.0D, x.getY()));
        points.add(new Point(x.getX(),(x.getY() + y.getY()) / 2.0D));
        points.add(new Point((x.getX() + y.getX()) / 2.0D, y.getY()));
        points.add(new Point(y.getX(), (x.getY() + y.getY()) / 2.0D));
    }
}