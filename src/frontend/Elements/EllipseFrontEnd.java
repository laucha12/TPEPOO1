package frontend.Elements;

import backend.model.Ellipse;
import backend.model.Point;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class EllipseFrontEnd extends Ellipse implements PrintOvals {

    private final GraphicsContext graphicsContext;

    public EllipseFrontEnd(Point middlePoint, double minAxis, double maxAxis, GraphicsContext graphicsContext) {
        super(middlePoint, minAxis, maxAxis);
        this.graphicsContext = graphicsContext;
    }

    @Override
    public void display() {
        print(graphicsContext, getCenterPoint(), getWidth(), getHeight(), Color.web(getColor()), Color.web(getStrokeColor()), getStrokeWidth());

    }


}
