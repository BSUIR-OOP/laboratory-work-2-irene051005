package figures;

public class Line extends Figure {
    @Override
    public void AddPoints(Point x, Point y) {
        points.add(x);
        points.add(y);
    }
}
