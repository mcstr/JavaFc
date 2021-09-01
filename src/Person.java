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
        String message = String.format(Locale.US,
            "%-15s%-15s%-15s%-15.1f%-15s\r\n",
            this.getTyp(), this.vorname, this.name, this.ermittelnGehalt(), this.erzeugenDetail() 
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
