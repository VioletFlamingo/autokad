package pl.agh.edu.jtp.autokad.ui;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Paulina on 28.04.2014.
 */
public class FileManager {
    public static DrawingArea openFile() {
        JFileChooser openFile = new JFileChooser();
        openFile.showOpenDialog(null);
        File file = openFile.getSelectedFile();
        DrawingArea drawingArea=null;
        try {
            drawingArea=(DrawingArea) new ObjectInputStream(new FileInputStream(file)).readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return drawingArea;
    }

    public static void saveFile() {
        JFileChooser saveFile = new JFileChooser();
        saveFile.showSaveDialog(null);
        //saveFile.
    }
}
