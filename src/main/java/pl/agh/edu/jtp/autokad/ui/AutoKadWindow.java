package pl.agh.edu.jtp.autokad.ui;


import pl.agh.edu.jtp.autokad.ui.figure.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * Created by Paulina on 24.04.2014.
 */
public class AutoKadWindow extends JFrame{

    final DrawingArea comp;
    final DefaultDrawingController drawingController;

    public AutoKadWindow(String title) {
        super(title);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());


        comp = new DrawingArea();
        drawingController = new DefaultDrawingController(comp);
        comp.addMouseListener(new DrawingAreaMouseListener(drawingController));
        add(comp, BorderLayout.CENTER);

        JMenuBar menuBar = createMenuBar();
        add(menuBar, BorderLayout.PAGE_START);

        JToolBar figureToolBar = createFigureToolbar();
        add(figureToolBar, BorderLayout.WEST);
    }


    private JMenuBar createMenuBar() {
        final JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        menuBar.add(createEditMenu());
        return menuBar;
    }

    private Component createEditMenu() {
        final JMenu edit = new JMenu("Edit");
        edit.add(createColorMenuItem());
        edit.add(createUndoMenuItem());
        return edit;
    }

    private Component createFileMenu() {
        final JMenu file = new JMenu("File");
        file.add(createOpenMenuItem());
        file.add(createSaveMenuItem());
        return file;
    }

    private JToolBar createFigureToolbar () {
        final JToolBar toolBar = new JToolBar();
        addFigureToolBarButtons(toolBar);
        return toolBar;
    }

    private void addFigureToolBarButtons(JToolBar figureToolBar) {
        figureToolBar.setLayout(new BoxLayout(figureToolBar, BoxLayout.PAGE_AXIS));


        JButton rectangleButton = FigureButton.getRectangleButton();
        rectangleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingController.setFigure(pl.agh.edu.jtp.autokad.ui.figure.Rectangle.class);
            }
        });
        figureToolBar.add(rectangleButton);


        JButton ovalButton = FigureButton.getOvalButton();
        ovalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingController.setFigure(Oval.class);
            }
        });
        figureToolBar.add(ovalButton);

        JButton lineButton = FigureButton.getLineButton();
        lineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingController.setFigure(Line.class);
            }
        });
        figureToolBar.add(lineButton);


        JButton roundedRectangleButton = FigureButton.getRoundedRectangleButton();
        roundedRectangleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingController.setFigure(RoundedRectangle.class);
            }
        });
        figureToolBar.add(roundedRectangleButton);

    }

    private JMenuItem createColorMenuItem() {
        final JMenuItem setColor = new JMenuItem("Set color");
        setColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeColor();
            }
        });

        //ctrl+c changes color
        final KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK);

        setColor.setAccelerator(keyStroke);

        return setColor;
    }

    private void changeColor() {
        ColorChoiceWindow colorChoiceWindow = new ColorChoiceWindow();
        colorChoiceWindow.setVisible(true);
    }


    private JMenuItem createOpenMenuItem() {
        final JMenuItem open = new JMenuItem("Open");
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileManager.openFile();
            }
        });

        //ctrl+o opens picture
        final KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK);

        open.setAccelerator(keyStroke);

        return open;

    }

    private JMenuItem createSaveMenuItem() {
        final JMenuItem save = new JMenuItem("Save");
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileManager.saveFile();
            }
        });

        //ctrl+s saves picture
        final KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK);

        save.setAccelerator(keyStroke);

        return save;
    }

    private JMenuItem createUndoMenuItem() {
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
