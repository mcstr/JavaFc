public class Arzt extends Person {
    String fach;
    double monatsgehalt = 10000;
    String name;
    String vorname;


    public Arzt(String vorname, String name, String fach) {
        super(name, vorname);
        this.fach = fach;
    }

    public double ermittelnGehalt() {
        return this.monatsgehalt * 12;
    }

    public String getTyp() {
        return "A";
    }

    public String erzeugenDetail() {
        return "Fachrichtung: " + this.fach;
    }

}
