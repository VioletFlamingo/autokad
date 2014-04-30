package pl.agh.edu.jtp.autokad.ui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by Paulina on 29.04.2014.
 */
public class FigureButton {
    public static JButton getRectangleButton () {
        JButton rectangleButton = new JButton();
        rectangleButton.setSize(new Dimension(30, 30));
        try {
            rectangleButton.setIcon(new ImageIcon(ImageIO.read(ClassLoader.getSystemResource("rect.jpg"))));
        } catch (IOException e) {
            e.printStackTrace();
            rectangleButton.setText("RECTANGLE");
        }
        return rectangleButton;
    }

    public static JButton getOvalButton () {
        JButton ovalButton = new JButton();
        ovalButton.setSize(new Dimension(30, 30));
        try {
            ovalButton.setIcon(new ImageIcon(ImageIO.read(ClassLoader.getSystemResource("oval.jpg"))));
        } catch (IOException e) {
            e.printStackTrace();
            ovalButton.setText("OVAL");
        }
        return ovalButton;
    }

    public static JButton getRoundedRectangleButton () {
        JButton roundedRectangleButton = new JButton();
        roundedRectangleButton.setSize(new Dimension(30, 30));
        try {
            roundedRectangleButton.setIcon(new ImageIcon(ImageIO.read(ClassLoader.getSystemResource("roundrect.jpg"))));
        } catch (IOException e) {
            e.printStackTrace();
            roundedRectangleButton.setText("ROUNDED RECTANGLE");
        }
        return roundedRectangleButton;
    }

    public static JButton getLineButton() {
        JButton lineButton = new JButton();
        lineButton.setSize(new Dimension(30, 30));
        try {
            lineButton.setIcon(new ImageIcon(ImageIO.read(ClassLoader.getSystemResource("Line.jpg"))));
        } catch (IOException e) {
            e.printStackTrace();
            lineButton.setText("LINE");
        }
        return lineButton;
    }
}
