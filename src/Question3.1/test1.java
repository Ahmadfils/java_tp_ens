/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;


public class test1 {
    public static void main(String[] args) {
        
               
        Threadcalcul c=new  Threadcalcul(2,1000);        
        ThreadFact f=new ThreadFact(c,1000);
        c.start();        
        f.start();
        
    }
    
}

