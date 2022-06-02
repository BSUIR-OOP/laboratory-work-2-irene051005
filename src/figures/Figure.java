package figures;

import java.util.ArrayList;

public abstract class Figure implements Cloneable {
    public String FigureName;
    public ArrayList<Point> points;

    public Figure() {
        points = new ArrayList<>();
        this.FigureName = getClass().getSimpleName();
    }

    @Override
    public Figure clone() throws CloneNotSupportedException {
        Figure newFigure = (Figure) super.clone();
        newFigure.points = (ArrayList<Point>) this.points.clone();
        return newFigure;
    }

    public abstract void AddPoints(Point a, Point b);
}
