import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biudzetas biudzetas = new Biudzetas();

        int id = 1;

        Scanner scanner = new Scanner(System.in);
        boolean runProgram = true;
        while (runProgram) {
            showCommands();
            String input = scanner.next();
            switch (input) {
                case "p" -> {
                    float pajamuSuma;
                    System.out.println("Įveskite sumą: ");
                    pajamuSuma = scanner.nextFloat();
                    String kategorija;
                    System.out.println("Įveskite pajamų kategoriją (pvz. atlyginimas, išmoka, dovana): " );
                    kategorija = scanner.next();
                    LocalDate data = LocalDate.now();
                    boolean gauta = true;
                    System.out.println("Įveskite ar gavote pinigus: T = taip, N = ne");
                    char ivedimas = scanner.next().charAt(0);
                    if (ivedimas == 't' | ivedimas == 'T') {
                        gauta = true;
                    } else if (ivedimas == 'n' | ivedimas == 'N') {
                        gauta = false;
                    } else {
                        System.out.println("Klaidingai suvesti duomenys, prašau pakartoti operacija gavote pinigus: Taip/Ne");
                        ivedimas = scanner.next().charAt(0);
                    }
                    biudzetas.pridetiPajamauIrasa(pajamuSuma, kategorija, data, gauta, id);
                }
                
                case "i" -> {
                    float islaiduSuma;
                    System.out.println("Įveskite sumą: ");
                    islaiduSuma = scanner.nextFloat();
                    String kategorija;
                    System.out.println("Įveskite išlaidų kategoriją (pvz. maistas, transportas, sveikata ir pan.): ");
                    kategorija = scanner.next();
                    LocalDateTime dataLaikas = LocalDateTime.now();
                    String atsiskaitymoBudas;
                    System.out.println("Įveskite mokėjote kortele ar grynais:");
                    atsiskaitymoBudas = scanner.next();
                    String mokejimoKortele;
                    System.out.println("Įveskite banko kortelės pavadinimas: ");
                    mokejimoKortele = scanner.next();
                    biudzetas.pridetiIslaiduIrasa(islaiduSuma, kategorija, dataLaikas, atsiskaitymoBudas, mokejimoKortele, id);
                }
                case "b" -> {
                    biudzetas.balansas();
                }
                case "9" -> {
                    biudzetas.spausdintiPajamas();
                }
                case "0" -> {
                    biudzetas.spausdintiIslaidas();
                }
                case "x" -> runProgram = false;
            }

        }
        scanner.close();
    }

    public static void showCommands() {
        System.out.println("************ PASIRINKITE KĄ NORITE ĮVESTI ************");
        System.out.printf("%5s - %-15s", "[p]", "PAJAMOS");
        System.out.printf("\n%5s - %-15s", "[i]", "IŠLAIDOS");
        System.out.printf("\n%5s - %-15s", "[b]", "BALANSAS");
        System.out.printf("\n%5s - %-15s", "[9]", "RODYTI PAJAMAS");
        System.out.printf("\n%5s - %-15s", "[0]", "RODYTI IŠLAIDAS");
        System.out.printf("\n%5s - %-15s", "[x]", "PABAIGA");
        System.out.println("\n*****************************************************");
    }
}