package pl.agh.edu.jtp.autokad.ui;

import javax.swing.*;

/**
 * Created by Paulina on 28.04.2014.
 */
public class FileManager {
    public static void openFile() {
        JFileChooser openFile = new JFileChooser();
        openFile.showOpenDialog(null);
    }

    public static void saveFile() {
        JFileChooser saveFile = new JFileChooser();
        saveFile.showSaveDialog(null);
    }
}
