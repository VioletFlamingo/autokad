package pl.agh.edu.jtp.autokad.ui.figure;

import pl.agh.edu.jtp.autokad.ui.DrawingArea;
import pl.agh.edu.jtp.autokad.ui.DrawingController;
import pl.agh.edu.jtp.autokad.ui.FigureFactory;
import pl.agh.edu.jtp.autokad.ui.UserAwareFigureFactory;
import pl.agh.edu.jtp.autokad.ui.command.Command;
import pl.agh.edu.jtp.autokad.ui.command.PaintCommand;

import java.awt.*;
import java.util.*;

/**
 * Created by Paulina on 24.04.2014.
 */
public class DefaultDrawingController implements DrawingController {

    private FigureFactory figureFactory;

    private final DrawingArea drawingArea;
    private final Deque<Command> commands = new LinkedList<Command>();

    public DefaultDrawingController(DrawingArea drawingArea) {
        this.drawingArea= drawingArea;
        figureFactory = new UserAwareFigureFactory();
    }

    @Override
    public void draw (Point start, Point end) {
        final Figure figure = figureFactory.createFigure(start, end);
        final PaintCommand paintCommand = new PaintCommand(figure);
        paintCommand.execute(drawingArea);
        commands.addLast(paintCommand);
    }

    @Override
    public void undoLastCommand() {
        if (!commands.isEmpty()) {
            final Command command = commands.removeLast();
            command.undo(drawingArea);
        }

    }
}