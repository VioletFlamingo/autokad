package pl.agh.edu.jtp.autokad.ui;

import pl.agh.edu.jtp.autokad.ui.figure.Figure;
import pl.agh.edu.jtp.autokad.ui.figure.Rectangle;

import java.awt.*;

/**
 * Created by Paulina on 24.04.2014.
 */
public class UserAwareFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure(Point start, Point end) {
        return new Rectangle(Color.CYAN, start, end);
    }
}
