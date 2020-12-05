package com.drive.automobile;
import com.phone.Telefono;
import com.phone.TelefonoMobile;

public class Fuoristrada extends Automobile implements Telefono {

  private Telefono telefono = new TelefonoMobile();
  
  private boolean is4x4Active = false;

  @Override
  public double getCostoChiamata() {
    this.telefono.getCostoChiamata();
  }
  
  public Fuoristrada(int velocita) {
    super(velocita);
  }

  public void aziona4x4() {
    this.is4x4Active = true;
  }

  public void spegni4x4() {
    this.is4x4Active = false;
  }

   public boolean is4x4Active() {
     return this.is4x4Active;
   }




  @Override
  public void accellera() {     
    if(this.velocita > -1) {
      this.velocita = this.velocita + 3;
      System.out.println("La velocità dell'automobile è: " + this.velocita+ " Km/h");
      if(this.velocita > 80){
        System.out.println("Vai troppo forte, rallenta!");
      }
      } else {
          System.out.println("L'automobile è spenta!");
      }
  }


}