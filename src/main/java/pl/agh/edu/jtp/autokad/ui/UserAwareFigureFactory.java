package pl.agh.edu.jtp.autokad.ui;

import pl.agh.edu.jtp.autokad.ui.figure.Figure;
import pl.agh.edu.jtp.autokad.ui.figure.Line;
import pl.agh.edu.jtp.autokad.ui.figure.Oval;
import pl.agh.edu.jtp.autokad.ui.figure.Rectangle;

import java.awt.*;

/**
 * Created by Paulina on 24.04.2014.
 */
public class UserAwareFigureFactory implements FigureFactory {

    private Color color=Color.MAGENTA;

    private static FigureFactory singleton;

    private UserAwareFigureFactory(){

    }

    public static FigureFactory getInstance(){
        if(singleton == null) {
            singleton = new UserAwareFigureFactory();
        }
        return singleton;
    }

    @Override
    public Figure createFigure(Point start, Point end) {
        //Rectangle rectangle = new Rectangle(color, start, end);
        //return rectangle;
        //Oval oval = new Oval(color, start, end);
        //return oval;
        Line line = new Line(color, start, end);
        return line;
    }

    public void setColor(Color color) {
        this.color=color;
    }
}
