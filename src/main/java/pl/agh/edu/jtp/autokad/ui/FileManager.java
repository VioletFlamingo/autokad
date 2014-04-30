package pl.agh.edu.jtp.autokad.ui;

import javax.swing.*;
import java.io.*;

/**
 * Created by Paulina on 28.04.2014.
 */
public class FileManager {
    public static DrawingArea openFile() {
        JFileChooser openFile = new JFileChooser();
        openFile.showOpenDialog(null);
        File file = openFile.getSelectedFile();
        DrawingArea drawingArea=new DrawingArea();
        try {
            drawingArea.readExternal(new ObjectInputStream(new FileInputStream(file)));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return drawingArea;
    }

    public static void saveFile(DrawingArea drawingArea) {
        JFileChooser saveFile = new JFileChooser();
        saveFile.showSaveDialog(null);
        try(ObjectOutputStream objectOutput = new ObjectOutputStream(
                new FileOutputStream(saveFile.getSelectedFile()))){
            drawingArea.writeExternal(objectOutput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
