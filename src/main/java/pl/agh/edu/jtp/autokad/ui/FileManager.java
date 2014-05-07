package pl.agh.edu.jtp.autokad.ui;

import pl.agh.edu.jtp.autokad.ui.info.ErrorLogger;

import javax.swing.*;
import java.io.*;
import java.util.ResourceBundle;

/**
 * Created by Paulina on 28.04.2014.
 */
public class FileManager {
    public static DrawingArea openFile(ResourceBundle messages) {
        JFileChooser openFile = new JFileChooser();
        openFile.updateUI();
        openFile.showOpenDialog(null);
        File file = openFile.getSelectedFile();
        DrawingArea drawingArea=new DrawingArea();
        try {
            drawingArea.readExternal(new ObjectInputStream(new FileInputStream(file)));
        } catch (ClassNotFoundException e) {
            ErrorLogger.getInstance().log(e.getMessage());
            //e.printStackTrace();
        } catch (FileNotFoundException e) {
            ErrorLogger.getInstance().log(e.getMessage());
            //e.printStackTrace();
        } catch (IOException e) {
            ErrorLogger.getInstance().log(e.getMessage());
            //e.printStackTrace();
        }
        return drawingArea;
    }

    public static void saveFile(DrawingArea drawingArea, ResourceBundle messages) {
        JFileChooser saveFile = new JFileChooser();
        saveFile.updateUI();
        saveFile.showSaveDialog(null);
        try(ObjectOutputStream objectOutput = new ObjectOutputStream(
                new FileOutputStream(saveFile.getSelectedFile()))){
            drawingArea.writeExternal(objectOutput);
        } catch (IOException e) {
            ErrorLogger.getInstance().log(e.getMessage());
            //e.printStackTrace();
        }
    }
}
