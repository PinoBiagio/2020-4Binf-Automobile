import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;


import com.drive.automobile.*;
import java.util.Scanner;
import java.io.Console;

public class Main {

  @Test
  public void testAccendi() {
     Automobile auto = new Automobile(-1);
     auto.accendi();
     assertEquals(50,auto.getVelocita());
  }

  @Test
  public void testAccelera() {
     Automobile auto = new Automobile(-1);
     auto.accendi();
     auto.accellera();
     assertEquals(55,auto.getVelocita());
  }

  @Test
  public void testFuoristradaAccelera() {
     Automobile auto = new Fuoristrada(-1);
     auto.accendi();
     auto.accellera();
     assertEquals(53,auto.getVelocita());
  }

  @Test
  public void testFuoristradaAziona4x4() {
     Fuoristrada auto = new Fuoristrada(-1);
     auto.accendi();
     auto.aziona4x4();
     assertEquals(true,auto.is4x4Active());
  }

  public static void main(String[] args) {
    JUnitCore.main("Main");


    // System.out.println();
    // System.out.println("**********************************");
    // System.out.println("**      COMANDI AUTOMOBILE      **");
    // System.out.println("**********************************");
    // System.out.println();
    // System.out.println("Utizza i seguenti comandi:");
    // System.out.println();
    // System.out.println("'i'  per accendere l'automobile");
    // System.out.println("'a' per accellerare");
    // System.out.println("'f' per frenare");
    // System.out.println("'s' per spegnere l'automobile");
    // System.out.println("'p' per parcheggiare l'automobile");
    // System.out.println();

    // Automobile auto = new Automobile(-1); // L'automobile è pronta per essere accesa

    // char tasto_premuto = ' ';
    // Scanner input = new Scanner(System.in);
    // while (tasto_premuto != 'p') {
    //   // Il while cicla fino a che l'automobile non è parcheggiata,
    //   // cioè digidando il comando 'P' oppure 'p'
    //   System.out.println();
    //   System.out.println("Digita un comando: ");
    //   String tasto = input.nextLine();
    //   tasto_premuto = tasto.charAt(0);
    //   System.out.println();
    //   switch (tasto_premuto) {
    //   // Comando di accensione
    //   case 'i':
    //     auto.accendi();
    //     break;
    //   case 'a': // Comando per accellerare

    //     auto.accellera();
    //     break;
    //   case 'f': // Comando per frenare

    //     auto.frena();
    //     break;
    //   case 's': // Comando di spegnimento

    //     auto.spegni();
    //     break;
    //   // Comando per parcheggiare
    //   case 'p':
    //     auto.parcheggia();
    //     break;
    //   default:
    //     System.out.println("Comando non conosciuto: " + tasto_premuto);
    //   }
    // }
  }
}