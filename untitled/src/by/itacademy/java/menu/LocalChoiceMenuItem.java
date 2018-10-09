package by.itacademy.java.menu;

import by.itacademy.java.locales.Locales;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocalChoiceMenuItem implements MenuItem, RootMenuItem {
    private Locales locales = new Locales();
    private Scanner scanner = new Scanner(System.in);
    private MenuItem next = new DateFormatMenuItem(this);
    private Locale localeChoice;

    @Override
    public void execute() {
        StringBuilder show = new StringBuilder("Выберите нужную локаль:\n");
        List<Locale> locales = this.locales.get();
        for (int i = 1; i <= locales.size(); i++) {
            show.append(i).append(". ").append(locales.get(i - 1)).append('\n');
        }
        System.out.println(show.toString());

        int choice = scanner.nextInt();
        localeChoice = locales.get(choice - 1);
        ResourceBundle bundle = ResourceBundle.getBundle("resource", localeChoice);
        System.out.println(bundle.getString("hello"));

        next.execute();
    }

    @Override
    public Locale getLocale() {
        return localeChoice;
    }
}
