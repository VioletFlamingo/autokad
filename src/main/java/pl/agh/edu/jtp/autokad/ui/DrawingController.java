package pl.agh.edu.jtp.autokad.ui;

import java.awt.*;

/**
 * Created by Paulina on 24.04.2014.
 */
public interface DrawingController {

    void draw (Point start, Point end);

    void undoLastCommand();

}
