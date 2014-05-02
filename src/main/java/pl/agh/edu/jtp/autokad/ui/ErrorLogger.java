package pl.agh.edu.jtp.autokad.ui;

import java.io.*;
import java.util.logging.Logger;

/**
 * Created by Paulina on 30.04.2014.
 */
public class ErrorLogger {
    private File error;
    private boolean loggingToFile =true;

    public void log (String message) {
        if (loggingToFile) {
            logToFile(message);
        } else {
            logToLogger(message);
        }
    }

    private void logToFile (String message) {
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(error, true)))) {
            out.println(message);
        } catch (IOException e) {
            LoggerProblemReporter loggerProblem = new LoggerProblemReporter("Problem with error logger occurred");
            loggingToFile =false;
        }
    }

    private void logToLogger (String message) {
        //Logger.log(message);
    }

    ErrorLogger () {
        error = new File("logs/error.log");
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(error, false)));
        } catch (IOException e) {
            LoggerProblemReporter loggerProblem = new LoggerProblemReporter("Problem with error logger occurred");
            loggingToFile =false;
        }
    }
}
