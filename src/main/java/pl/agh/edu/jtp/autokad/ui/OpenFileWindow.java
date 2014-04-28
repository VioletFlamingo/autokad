package pl.agh.edu.jtp.autokad.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by Paulina on 28.04.2014.
 */
///
public class OpenFileWindow extends JFrame {

    JFileChooser fileChooser;

    public OpenFileWindow (String title) {
        super(title);
        getContentPane().setLayout(new FlowLayout());

        fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose a file");
        fileChooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeWindow();
            }
        });
        Dimension frameDimension = new Dimension(fileChooser.getPreferredSize());
        frameDimension.setSize(frameDimension.getWidth()+50, frameDimension.getHeight()+50);
        setSize(frameDimension);
        this.getContentPane().add(fileChooser);
        fileChooser.setVisible(true);

        setVisible(true);
    }

    public File getFile() {
        return fileChooser.getSelectedFile();
    }

    private void closeWindow() {
        this.dispose();
    }

}
