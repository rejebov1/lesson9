package by.itacademy.java.menu;


import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateFormatMenuItem implements MenuItem {
    Scanner scanner = new Scanner(System.in);
    private RootMenuItem rootMenuItem;
    public ArrayList<String> typeDateFormat = new ArrayList<>();

    {
        typeDateFormat.add("FULL");
        typeDateFormat.add("LONG");
        typeDateFormat.add("MEDIUM");
        typeDateFormat.add("SHORT");
    }

    public DateFormatMenuItem(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public void execute() {
        Locale locale = rootMenuItem.getLocale();
        rootMenuItem.getLocale();
        StringBuilder show = new StringBuilder("Выберите тип даты: \n");
        for (int i = 0; i < typeDateFormat.size(); i++) {
            show.append(i + 1).append(". ").append(typeDateFormat.get(i)).append("\n");
        }
        System.out.println(show);
        int choice = scanner.nextInt()-1;
        DateFormat fmt = DateFormat.getDateInstance(choice, locale);
        Date currentdate = new Date();
        String s = fmt.format(currentdate);
        System.out.println(s);
    }


}



