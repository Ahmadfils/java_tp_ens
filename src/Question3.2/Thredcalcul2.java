/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;


public class Thredcalcul2 extends Thread{
       int nombre;
       double somme;
      int delai;

    public Thredcalcul2(int nombre, int delai) {
        this.nombre = nombre;
        this.delai = delai;
    }

   
  public void run()
  {
      while(!interrupted()){
      
      somme=0;
      
      for(int i=1;i<=nombre;i++)
          somme+=i;
      
          try {
                
                sleep(delai);
                nombre++;
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
  
   }
           

