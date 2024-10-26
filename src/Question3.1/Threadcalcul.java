/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;


public class Threadcalcul extends Thread{
    int nombre;
    long factoriel;
    int delai;

    public Threadcalcul(int nombre, int delai) {
        this.nombre=nombre;
        this.delai = delai;
    }

    
    public void run()
    {
        while(!interrupted()){
          
          try {
                factoriel=1;
                for(int i=1;i<=nombre;i++)
                {
                    factoriel*=i;
                }
                 sleep(delai);
                 nombre++;
            
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
