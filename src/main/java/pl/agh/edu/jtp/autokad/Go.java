package pl.agh.edu.jtp.autokad;

import pl.agh.edu.jtp.autokad.ui.AutoKadWindow;

import javax.swing.*;

/**
 * Created by Paulina on 24.04.2014.
 */
public class Go {
    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowUI();
            }
        });
    }

    private static void createAndShowUI() {
        final AutoKadWindow window = new AutoKadWindow("AutoKad Ultimate Professional 3000");
        window.setVisible(true);
    }
}
