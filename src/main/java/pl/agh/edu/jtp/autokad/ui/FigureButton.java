package pl.agh.edu.jtp.autokad.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Paulina on 29.04.2014.
 */
public class FigureButton {
    public static JButton getRectangleButton () {
        JButton rectangleButton = new JButton();
        rectangleButton.setSize(new Dimension(30, 30));
        rectangleButton.setIcon(new ImageIcon("rect.jpg"));
        return rectangleButton;
    }

    public static JButton getOvalButton () {
        JButton ovalButton = new JButton();
        ovalButton.setSize(new Dimension(30, 30));
        ovalButton.setIcon(new ImageIcon("oval.jpg"));
        return ovalButton;
    }

    public static JButton getRoundedRectangleButton () {
        JButton roundedRectangleButton = new JButton();
        roundedRectangleButton.setSize(new Dimension(30, 30));
        roundedRectangleButton.setIcon(new ImageIcon("roundrect.jpg"));
        return roundedRectangleButton;
    }

    public static JButton getLineButton() {
        JButton lineButton = new JButton();
        lineButton.setSize(new Dimension(30, 30));
        lineButton.setIcon(new ImageIcon("Line.jpg"));
        return lineButton;
    }
}
