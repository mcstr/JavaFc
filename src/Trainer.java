public class Trainer extends Person {
    double monatsgehalt = 165000;
    Spieler liebster;
    String name;
    String vorname;


    public Trainer(String vorname, String name, Spieler liebster) {
        this.liebster = liebster;
        this.name = name;
        this.vorname = vorname;
    }

    public double ermittelnGehalt (double monatsgehalt) {
        return monatsgehalt * 12;
    }

    public String getTyp() {
        return "T";
    }

    public String erzeugenDetail() {
        return "Lieblingspieler: " + this.liebster.name ;
    }
}
