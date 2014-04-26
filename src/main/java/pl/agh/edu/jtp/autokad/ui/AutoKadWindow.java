package pl.agh.edu.jtp.autokad.ui;

import pl.agh.edu.jtp.autokad.ui.figure.DefaultDrawingController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * Created by Paulina on 24.04.2014.
 */
public class AutoKadWindow extends JFrame{

    private UserAwareFigureFactory figureFactory = new UserAwareFigureFactory();
    final DrawingArea comp;
    final DefaultDrawingController drawingController;

    public AutoKadWindow(String title) {
        super(title);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());


        comp = new DrawingArea();
        drawingController = new DefaultDrawingController(comp);
        add(comp, BorderLayout.CENTER);
        addMouseListener(new DrawingAreaMouseListener(drawingController));

        JMenuBar menuBar = createManuBar();
        add(menuBar, BorderLayout.PAGE_START);
    }

    private JMenuBar createManuBar() {
        final JMenuBar menuBar = new JMenuBar();
        menuBar.add(createEditMenu());
        return menuBar;
    }

    private Component createEditMenu() {
        final JMenu edit = new JMenu("Edit");
        edit.add(createUndoMenoItem());
        return edit;

    }

    private JMenuItem createUndoMenoItem() {
        final JMenuItem undo = new JMenuItem("Undo");
        undo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingController.undoLastCommand();
            }
        });

        //ctrl+Z removes last figure
        final KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK);

        undo.setAccelerator(keyStroke);

        return undo;
    }

}
