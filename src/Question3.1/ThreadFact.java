/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;


public class ThreadFact extends Thread{
    Threadcalcul fact;
    int delai;

    public ThreadFact(Threadcalcul fact, int delai) {
        this.fact=fact;
        this.delai = delai;
        
    }
    
    public void run()
    {
        while(!interrupted())
        {
            try {
                 System.out.println("Le nombre "+fact.nombre+" a pour factoriel "+fact.factoriel);
                 sleep(delai);
                  
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    
}
