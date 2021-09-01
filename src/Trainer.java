public class Trainer extends Person {
    double monatsgehalt = 165000;
    Spieler liebster;
    String name;
    String vorname;


    public Trainer(String vorname, String name, Spieler liebster) {
        super(name, vorname);
        this.liebster = liebster;
        this.name = name;
        this.vorname = vorname;
    }

    public double ermittelnGehalt () {
        return monatsgehalt * 12;
    }

    public String getTyp() {
        return "T";
    }

    public String erzeugenDetail() {
        return "Lieblingspieler: " + this.liebster.getName() ;
    }
}
