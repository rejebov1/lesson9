package by.itacademy.java.locales;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Locales {
    private List<Locale> locales = new ArrayList<>();
    {
        locales.add(new Locale("es"));
        locales.add(new Locale("en"));
        locales.add(new Locale("ru"));
    }
    public List<Locale> get(){
        return locales;
        }


}

