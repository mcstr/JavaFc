// import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Verein v = new Verein();
        Spieler s1 = new Spieler("Mats", "Hummels", "Abwehr", 25);
        Spieler s2 = new Spieler("Mario", "Götze", "Mittelfeld", 14);
        Trainer t = new Trainer("Jürgen", "Klopp", s2);
        Arzt a = new Arzt("Markus", "Braun", "Orthopädie");
        
        v.hizufuegenMitglied(s1);
        v.hizufuegenMitglied(s2);
        v.hizufuegenMitglied(t);
        v.hizufuegenMitglied(a);

        v.ausgebenGehaltsliste();
    }
    // https://stackoverflow.com/questions/18672643/how-to-print-a-table-of-information-in-java
}
