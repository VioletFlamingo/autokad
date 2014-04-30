package pl.agh.edu.jtp.autokad.ui;

import pl.agh.edu.jtp.autokad.ui.figure.Figure;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Paulina on 24.04.2014.
 */
public class DrawingArea extends JPanel implements Serializable{

    private Collection<Figure> figures = new ArrayList<Figure>();

    public DrawingArea() {
        super();
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics  g) {
        super.paintComponent(g);
        for (Figure figure : figures) {
            figure.paint(g);
        }
    }

    public void addFigure(Figure figure) {
        figures.add(figure);
        repaint();
    }

    public void removeFigure(Figure figure) {
        figures.remove(figure);
        repaint();
    }
}
