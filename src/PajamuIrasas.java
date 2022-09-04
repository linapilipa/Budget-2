import java.time.LocalDate;

public class PajamuIrasas {
    private float suma;
    private String kategorija;
    private LocalDate data;
    private boolean gauta;
    static int counter;


    public PajamuIrasas(float suma, String kategorija, LocalDate data, boolean gauta, int counter) {
        this.suma = suma;
        this.kategorija = kategorija;
        this.data = data;
        this.gauta = gauta;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isGauta() {
        return gauta;
    }

    public void setGauta(boolean gauta) {
        this.gauta = gauta;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        PajamuIrasas.counter = counter;
    }
}

