import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ChoiceBox;
import javafx.scene.paint.Color;
import figures.Paint;
import figures.Figure;
import figures.FigureDictionary;

import javafx.scene.input.MouseEvent;
import figures.Point;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    private ChoiceBox<String> figureBox;

    @FXML
    private Canvas windowCanvas;
    private FigureDictionary figureDictionary;
    private GraphicsContext graphicsContext;
    private Point initPoint;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        graphicsContext = this.windowCanvas.getGraphicsContext2D();
        figureDictionary = new FigureDictionary();
        for (String tempFigure : figureDictionary.dictionary.keySet()) {
            figureBox.getItems().add(tempFigure);
        }
    }

    public void onMousePressed(MouseEvent mouseEvent) {
        initPoint = new Point(mouseEvent.getX(), mouseEvent.getY());
    }

    public void onMouseReleased(MouseEvent mouseEvent) throws CloneNotSupportedException {
        Point endPoint = new Point(mouseEvent.getX(), mouseEvent.getY());
        Figure figure = figureDictionary.dictionary.get((String) this.figureBox.getValue());
        Figure mdFigure = figure.clone();
        mdFigure.AddPoints(initPoint, endPoint);
        graphicsContext.setStroke(Color.BLUE);
        Paint paint = new Paint(mdFigure, graphicsContext);
        paint.drawFigure();
    }
}

