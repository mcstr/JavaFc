import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.Locale;


public class Utility {
    
    public static String header() {

        String message = String.format(Locale.GERMANY,
            "%-15s%-15s%-15s%-15s%-15s\r\n",
            "Typ", "Name", "Vorname", "Jahresgehalt", "Sonstiges");
        
        return message;
    }

    public static int longestString(ArrayList<Person> array) {
        int length = 0;

        for (Person person : array) {
            if (person.erzeugenZeile().length() > length)
               length = person.erzeugenZeile().length();
        }
        return length;
    }

    public static void printSeparator(int num) {
        Stream.generate(() -> "-").limit(num).forEach(System.out::print);
    }
}
