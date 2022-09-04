import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Biudzetas {
    private ArrayList<PajamuIrasas> pajamos = new ArrayList<>();
    private ArrayList<IslaiduIrasas> islaidos = new ArrayList<>();

    private int pajamuIrasuKiekis = 1;
    private int islaiduIrasuKiekis = 1;

    float pajamuSuma = 0;
    float islaiduSuma = 0;
    float balansas;


    public void pridetiPajamauIrasa (float suma, String kategorija, LocalDate data, boolean gauta, int counter) {
        PajamuIrasas irasas = new PajamuIrasas(suma, kategorija, data, gauta, counter);
        pajamos.add(irasas);
        for (int i = 0; i < pajamos.size(); i++) {
            irasas = pajamos.get(i);
            if (irasas != null) {
                System.out.print("\n ------------ PAJAMOS ------------\n");
                System.out.println("ID: #" + counter++);
                System.out.println("Įrašas išsaugotas");
                System.out.println("------------------------------------");
            }
        }
    }

    public void pridetiIslaiduIrasa (float suma, String kategorija, LocalDateTime dataLaikas, String atsiskaitymoBudas, String mokejimoKortele, int id){
        IslaiduIrasas islaiduIrasas = new IslaiduIrasas(suma, kategorija, dataLaikas, atsiskaitymoBudas, mokejimoKortele, id);
        islaidos.add(islaiduIrasas);
        for (int i = 0; i < islaidos.size(); i++) {
            islaiduIrasas = islaidos.get(i);
            if (islaiduIrasas != null) {
                System.out.print("\n ------------ IŠLAIDOS ------------\n");
                System.out.println("ID: #" + id++);
                System.out.println("Įrašas išsaugotas");
                System.out.println("------------------------------------");
            }
        }
    }

    public void balansas (){
        for (int i = 0; i < pajamos.size(); i++){
            pajamuSuma = pajamuSuma + pajamos.get(i).getSuma();
        }
        for (int i = 0; i< islaidos.size(); i++){
            islaiduSuma = islaiduSuma + islaidos.get(i).getSuma();
        }
        balansas = pajamuSuma - islaiduSuma;
        System.out.print("\n ------------ BALANSAS ------------\n");
        System.out.printf("Balansas: %.2f EUR \n", balansas);
        System.out.println("------------------------------------");
    }

    public void spausdintiPajamas(){
        for (int i = 0; i < pajamos.size(); i++){
            System.out.print("\n ----- PAJAMŲ INFO ------\n");
            System.out.printf("[%d-%s-%d]\n", LocalDate.now().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth());
            System.out.printf("ID: # %d\n", pajamuIrasuKiekis++);
            System.out.printf("   Suma: %-10.2f EUR\n ", pajamos.get(i).getSuma());
            System.out.printf("   Kategorija: %-10s\n", pajamos.get(i).getKategorija());
            System.out.printf("   Ar gautos pajamos: %-10b\n", pajamos.get(i).isGauta());
            System.out.print("\n --------------------------\n");
        }
    }


    public void spausdintiIslaidas(){
        for (int i = 0; i < islaidos.size(); i++){
            System.out.print("\n ----- IŠLAIDŲ INFO ------\n");
            System.out.printf("[%d-%s-%d  %d:%d:%d]\n", LocalDate.now().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth(), LocalTime.now().getHour(), LocalTime.now().getMinute(), LocalTime.now().getSecond());
            System.out.printf("ID: # %d\n", islaiduIrasuKiekis++);
            System.out.printf("   Suma: %-10.2f EUR\n", islaidos.get(i).getSuma());
            System.out.printf("   Kategorija: %-10s\n", islaidos.get(i).getKategorija());
            System.out.printf("   Atsiskaitymo būdas: %-10s\n", islaidos.get(i).getAtsiskaitymoBudas());
            System.out.printf("   Kortelės pavadinimas: %-10s\n", islaidos.get(i).getKortele());
            System.out.print("\n --------------------------\n");

        }

    }

}
