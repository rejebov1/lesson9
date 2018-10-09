package by.itacademy.java.menu;

public class Menu {
    private MenuItem root = new LocalChoiceMenuItem();

    public void start() {
        root.execute();
    }
}

