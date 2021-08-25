import java.util.Locale;

public abstract class Person {
    private String vorname;
    private String name;
    private double gehalt;

    public Person (String vorname, String name) {
        this.name = name;
        this.vorname = vorname;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public String erzeugenZeile() {

        String message = String.format(Locale.GERMANY,
            "%S \r\n    %s \r\n    %s \r\n    %,9.2f \r\n    %s\r\n",
            this.getTyp(), this.vorname, this.name, this.gehalt, this.erzeugenDtail() 
        );
        
        return message;
    }

    public String getName() {
        return this.vorname + " " + this.name;
    }
    
    public abstract String getTyp();
    public abstract double ermittelnGehalt();
    public abstract String erzeugenDetail();
}
