/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;


public class Threadalgebrique extends Thread{
    
    Thredcalcul2 calculer;
    int delai;

    public Threadalgebrique(Thredcalcul2 calculer, int delai) {
        this.calculer = calculer;
        this.delai = delai;
    }
    public void run(){
      while(!interrupted()){
            
        try {
             System.out.println("\nLe nombre est "+calculer.nombre);
             System.out.println("Sa somme algébrique est "+calculer.somme);
             sleep(delai);                            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      }
    }
 
}
