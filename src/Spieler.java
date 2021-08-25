public class Spieler extends Person {
    private String position;
    private double monatsgehalt = 180000;
    private double spielpraemie = 5000;
    private double spieleinzaetze;
    

    public Spieler(String name, String vorname, String position, double spieleinzaetze)
    {
        super(name, vorname);
        this. position = position;
        this. spieleinzaetze = spieleinzaetze;
    }

    public double ermittelnGehalt () {
        double monat = this.monatsgehalt * 12;
        double praemie = this.spieleinzaetze * spielpraemie;
        return monat + praemie;
    }

    public String getTyp() {
        return "S";
    }

    
    public String erzeugenDetail() {
        return "Position: " + this.position + "/ " + "Spieleinsätze: " + this.spieleinzaetze ;
    }

}
