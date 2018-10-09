package by.itacademy.java.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
     /*   Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher("Ab1 Ab1 Ab1");
        StringBuffer stringBuilder = new StringBuffer();
        while (matcher.find()){
            String replacement = matcher.replaceFirst("-");
            matcher.reset(replacement);
           // matcher.appendReplacement(stringBuilder, "-");
            System.out.println(replacement);
        }
        /*matcher.appendTail(stringBuilder);
        System.out.println(stringBuilder);
*/
        Compression compression = new Compression();
        String compressed = compression.forward("heloooooWorld");
    }

}
