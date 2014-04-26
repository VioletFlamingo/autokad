package pl.agh.edu.jtp.autokad.ui;

import pl.agh.edu.jtp.autokad.ui.figure.Figure;

import java.awt.*;

/**
 * Created by Paulina on 24.04.2014.
 */
public interface FigureFactory {
    Figure createFigure(Point start, Point end);
}
