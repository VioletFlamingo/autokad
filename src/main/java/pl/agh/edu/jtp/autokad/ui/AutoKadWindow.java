package pl.agh.edu.jtp.autokad.ui;


import pl.agh.edu.jtp.autokad.ui.figure.*;
import pl.agh.edu.jtp.autokad.ui.figure.Rectangle;

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

    private DrawingArea comp;
    private final DefaultDrawingController drawingController;
    private final ErrorLogger errorLogger;
    private final InfoLogger infoLogger;

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

        add(drawingController.getDrawingStateBar(), BorderLayout.SOUTH);
        infoLogger = new InfoLogger();
        errorLogger = new ErrorLogger();
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

        JButton rectangleButton = FigureButton.getRectangleButton(drawingController);
        figureToolBar.add(rectangleButton);

        JButton ovalButton = FigureButton.getOvalButton(drawingController);
        figureToolBar.add(ovalButton);

        JButton lineButton = FigureButton.getLineButton(drawingController);
        figureToolBar.add(lineButton);

        JButton roundedRectangleButton = FigureButton.getRoundedRectangleButton(drawingController);
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
                comp=FileManager.openFile();
                comp.repaint();
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
                FileManager.saveFile(comp);
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
