import java.time.LocalDateTime;

public class IslaiduIrasas {
    private float suma;
    private String kategorija;
    private LocalDateTime dataLaikas;
    private String atsiskaitymoBudas;
    private String kortele;
    static int counter;

    public IslaiduIrasas(float suma, String kategorija, LocalDateTime dataLaikas, String atsiskaitymoBudas, String kortele, int counter) {
        this.suma = suma;
        this.kategorija = kategorija;
        this.dataLaikas = dataLaikas;
        this.atsiskaitymoBudas = atsiskaitymoBudas;
        this.kortele = kortele;
        this.counter = counter;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public LocalDateTime getDataLaikas() {
        return dataLaikas;
    }

    public void setDataLaikas(LocalDateTime dataLaikas) {
        this.dataLaikas = dataLaikas;
    }

    public String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    public String getKortele() {
        return kortele;
    }

    public void setKortele(String kortele) {
        this.kortele = kortele;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        IslaiduIrasas.counter = counter;
    }
}




