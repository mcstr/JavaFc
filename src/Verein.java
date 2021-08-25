import java.util.ArrayList;

public class Verein {
    private ArrayList<Person> mitglieder;

    public void hizufuegenMitglied(Person p){
        this.mitglieder.push(p);
    }
}
