import com.drive.automobile.*;
import java.util.Scanner;
import java.io.Console;


public class Main {

  public static void main(String[] args) {

    System.out.println();
    System.out.println("**********************************");
    System.out.println("**      COMANDI AUTOMOBILE      **");
    System.out.println("**********************************");
    System.out.println();
    System.out.println("Utizza i seguenti comandi:");
    System.out.println();
    System.out.println("'i'  per accendere l'automobile");
    System.out.println("'a' per accellerare");
    System.out.println("'f' per frenare");
    System.out.println("'s' per spegnere l'automobile");
    System.out.println("'p' per parcheggiare l'automobile");
    System.out.println();

    Automobile auto = new Automobile(-1); // L'automobile è pronta per essere accesa

    char tasto_premuto = ' ';
    Scanner input = new Scanner(System.in);
    while (tasto_premuto != 'p') {
      // Il while cicla fino a che l'automobile non è parcheggiata,
      // cioè digidando il comando 'P' oppure 'p'
      System.out.println();
      System.out.println("Digita un comando: ");
      String tasto = input.nextLine();
      tasto_premuto = tasto.charAt(0);
      System.out.println();
      switch (tasto_premuto) {
      // Comando di accensione
      case 'i':
        auto.accendi();
        break;
      case 'a': // Comando per accellerare

        auto.accellera();
        break;
      case 'f': // Comando per frenare

        auto.frena();
        break;
      case 's': // Comando di spegnimento

        auto.spegni();
        break;
      // Comando per parcheggiare
      case 'p':
        auto.parcheggia();
        break;
      default:
        System.out.println("Comando non conosciuto: " + tasto_premuto);
      }
    }
  }
}