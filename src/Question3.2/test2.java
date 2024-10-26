/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;


public class test2 {
    
    public static void main(String[] args) {
        
       
        //SommeAlg s=new SommeAlg(2);
        Thredcalcul2 sum=new Thredcalcul2(2,1000);      
        Threadalgebrique aff=new Threadalgebrique(sum, 1000);        
        sum.start();
        aff.start();
    }
}
