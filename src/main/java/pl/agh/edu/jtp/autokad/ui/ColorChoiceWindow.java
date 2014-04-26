package pl.agh.edu.jtp.autokad.ui;

import pl.agh.edu.jtp.autokad.ui.figure.DefaultDrawingController;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Created by Paulina on 26.04.2014.
 */
public class ColorChoiceWindow extends JDialog {

    private JColorChooser colorChooser;

    public ColorChoiceWindow(final UserAwareFigureFactory figureFactory) {
        super();
        setSize(700, 350);
        getContentPane().setLayout(new FlowLayout());

        colorChooser= new JColorChooser();
        colorChooser.setPreviewPanel(new JPanel());
        colorChooser.getSelectionModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                setColor(figureFactory);
            }
        });
        add(colorChooser, BorderLayout.CENTER);
    }

    public void setColor (UserAwareFigureFactory figureFactory) {
        figureFactory.setColor(colorChooser.getColor());
    }
}
