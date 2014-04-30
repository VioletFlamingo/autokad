package pl.agh.edu.jtp.autokad.ui;

import pl.agh.edu.jtp.autokad.ui.figure.Line;
import pl.agh.edu.jtp.autokad.ui.figure.Oval;
import pl.agh.edu.jtp.autokad.ui.figure.RoundedRectangle;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by Paulina on 29.04.2014.
 */
public class FigureButton {
    public static JButton getRectangleButton (final DrawingController drawingController) {
        JButton rectangleButton = new JButton();
        rectangleButton.setSize(new Dimension(30, 30));
        try {
            rectangleButton.setIcon(new ImageIcon(ImageIO.read(ClassLoader.getSystemResource("rect.jpg"))));
        } catch (IOException e) {
            e.printStackTrace();
            rectangleButton.setText("RECTANGLE");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            rectangleButton.setText("RECTANGLE");
        }
        rectangleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingController.setFigure(pl.agh.edu.jtp.autokad.ui.figure.Rectangle.class);
            }
        });
        return rectangleButton;
    }

    public static JButton getOvalButton (final DrawingController drawingController) {
        JButton ovalButton = new JButton();
        ovalButton.setSize(new Dimension(30, 30));
        try {
            ovalButton.setIcon(new ImageIcon(ImageIO.read(ClassLoader.getSystemResource("oval.jpg"))));
        } catch (IOException e) {
            e.printStackTrace();
            ovalButton.setText("OVAL");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            ovalButton.setText("OVAL");
        }
        ovalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingController.setFigure(Oval.class);
            }
        });
        return ovalButton;
    }

    public static JButton getRoundedRectangleButton (final DrawingController drawingController) {
        JButton roundedRectangleButton = new JButton();
        roundedRectangleButton.setSize(new Dimension(30, 30));
        try {
            roundedRectangleButton.setIcon(new ImageIcon(ImageIO.read(ClassLoader.getSystemResource("roundrect.jpg"))));
        } catch (IOException e) {
            e.printStackTrace();
            roundedRectangleButton.setText("ROUNDED RECTANGLE");
        }  catch (IllegalArgumentException e) {
            e.printStackTrace();
            roundedRectangleButton.setText("ROUNDED RECTANGLE");
        }
        roundedRectangleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingController.setFigure(RoundedRectangle.class);
            }
        });
        return roundedRectangleButton;
    }

    public static JButton getLineButton(final DrawingController drawingController) {
        JButton lineButton = new JButton();
        lineButton.setSize(new Dimension(30, 30));
        try {
            lineButton.setIcon(new ImageIcon(ImageIO.read(ClassLoader.getSystemResource("Line.jpg"))));
        } catch (IOException e) {
            e.printStackTrace();
            lineButton.setText("LINE");
        }  catch (IllegalArgumentException e) {
            e.printStackTrace();
            lineButton.setText("LINE");
        }
        lineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingController.setFigure(Line.class);
            }
        });
        return lineButton;
    }
}
