import java.util.ArrayList;
import java.util.Locale;

public class Verein {
    private ArrayList<Person> mitglieder = new ArrayList<Person>();

    public void hizufuegenMitglied(Person p){
        this.mitglieder.add(p);
    }

    public void ausgebenGehaltsliste() {
        System.out.print(Utility.header());
        Utility.printSeparator(Utility.longestString(mitglieder));
        System.out.println("");
        for (Person person : mitglieder) {
            System.out.println(person.erzeugenZeile());
        }
        System.out.println(getTotalGehalt());
    }

    public ArrayList<Person> getPeople() {
        return this.mitglieder;
    }

    public String getTotalGehalt() {
        double totalGehalt = 0;
        for (Person person : mitglieder) {
            totalGehalt += person.ermittelnGehalt();
        }

        String message = String.format(Locale.GERMANY,
            "%s %s %s %,.2f %s\r\n",
            "Summer", "der", "Jahresgehalter:", totalGehalt, "€");
        
        return message;

    }

}
