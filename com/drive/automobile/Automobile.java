package com.drive.automobile;

public class Automobile {

  int velocita;
  
  public Automobile(int velocita) {

    System.out.println("L'automobile è pronta per essere accesa!");        
    this.velocita = velocita;

  }
  
  public int getVelocita() {

    return this.velocita;

  }
// Funzione che dice se l'automobile è accesa
  public void accendi() {           
  System.out.println("Accensione");
  if(this.velocita == -1) {
    this.velocita = 50;
    } else {
        System.out.println("L'automobile è già accesa!");
    }
   
   System.out.println("La velocità dell'automobile è: " + this.velocita + " Km/h");
  }
// Funzione che incrementa la velocità
  public void accellera() {     
    if(this.velocita > -1) {
      this.velocita = this.velocita + 5;
      System.out.println("La velocità dell'automobile è: " + this.velocita+ " Km/h");
      if(this.velocita > 90){
        System.out.println("Vai troppo forte, rallenta!");
      }
      } else {
          System.out.println("L'automobile è spenta!");
      }
  }
// Funzione che decrementa la velocità
  public void frena() {
     if(this.velocita > -1) {
      this.velocita = this.velocita - 10;
      if(this.velocita <= 0){
        System.out.println("L'automobile è ferma!");
        this.velocita = 0;
        }else{
          System.out.println("La velocità dell'automobile è: " + this.velocita+ " Km/h");
        }
      } else {
          System.out.println("L'automobile è spenta!");
      }

  }
//Funzione dice se l'automobile è spenta 
  public void spegni() {
  if(this.velocita > -1) {
    this.velocita = -1 ;
    System.out.println("L'automobile è spenta!");
    } else {
        System.out.println("L'automobile è già spenta!");
    }
  }

  // Funzione che stampa che l'automobile è parcheggiata
  public void parcheggia(){
    
   System.out.println("L'automobile è parcheggiata!");

  }

}