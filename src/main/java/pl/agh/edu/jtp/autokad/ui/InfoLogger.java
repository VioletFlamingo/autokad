package pl.agh.edu.jtp.autokad.ui;

import java.io.*;

/**
 * Created by Paulina on 01.05.2014.
 */
public class InfoLogger {
    private File info;
    public void log (String message) {
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(info, true)))) {
            out.println(message);
        } catch (IOException e) {
            //okienko dialogowe
        }
    }

    InfoLogger () {
        info = new File("logs/application.log");
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(info, false)));
        } catch (IOException e) {
            //okieno dialogowe
        }
    }
}
