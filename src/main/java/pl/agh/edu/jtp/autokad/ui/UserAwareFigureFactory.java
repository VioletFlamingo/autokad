package pl.agh.edu.jtp.autokad.ui;

import pl.agh.edu.jtp.autokad.ui.figure.*;
import pl.agh.edu.jtp.autokad.ui.figure.Rectangle;

import java.awt.*;

/**
 * Created by Paulina on 24.04.2014.
 */
public class UserAwareFigureFactory implements FigureFactory {

    private Color color=Color.MAGENTA;
    private Class figureType=Line.class;
    private StateBar stateBar = new StateBar(Line.class, color);

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
        if (figureType==Rectangle.class) {
            Rectangle rectangle = new Rectangle(color, start, end);
            return rectangle;
        } else if (figureType==Oval.class) {
            Oval oval = new Oval(color, start, end);
            return oval;
        } else if (figureType==Line.class) {
            Line line = new Line(color, start, end);
            return line;
        } else {
            RoundedRectangle roundedRectangle  = new RoundedRectangle(color, start, end);
            return  roundedRectangle;
        }
    }

    public void setColor(Color color) {
        setStateBarColor(color);
        this.color=color;
    }

    private void setStateBarColor (Color color) {
        stateBar.changeColor(color);
    }

    private void setStateBarFigure (Class figure) {
        stateBar.changeFigure(figure);
    }

    @Override
    public void setFigure(Class figureClass) {
        setStateBarFigure(figureClass);
        figureType=figureClass;
    }

    public StateBar getStateBar () {
        return stateBar;
    }
}
