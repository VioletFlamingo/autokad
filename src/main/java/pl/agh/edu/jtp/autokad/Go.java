package pl.agh.edu.jtp.autokad;

import pl.agh.edu.jtp.autokad.ui.AutoKadWindow;
import pl.agh.edu.jtp.autokad.ui.ComponentsText;
import pl.agh.edu.jtp.autokad.ui.LanguageChooser;

import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Paulina on 24.04.2014.
 */
public class Go {

    private static Locale language = new Locale("en", "US");
    public static ResourceBundle messages;

    public static void main (String[] args) {
//        String language="pl";
//        String country="PL";
//
//        Locale currentLocale;
//        ResourceBundle messages;
//
//        currentLocale = new Locale(language, country);
//
//        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                LanguageChooser languageChooser = new LanguageChooser("Choose Language");
            }
        });
    }

    private static void createAndShowUI() {
        final AutoKadWindow window = new AutoKadWindow("AutoKad Ultimate Professional 3000", messages);
        window.setVisible(true);
    }

    public static void setLocale(Locale locale) {
        language = locale;
        messages = ResourceBundle.getBundle("MessagesBundle", locale);
        ComponentsText.setText(messages);
        createAndShowUI();
    }
}
