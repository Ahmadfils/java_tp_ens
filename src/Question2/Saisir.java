
package Question2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Saisir {
 
 
 public static String saisirChaine(String message)
 {
     String chaine="";
     BufferedReader rsc = new BufferedReader(new InputStreamReader(System.in));
     
     try {
         System.out.print(message);
         chaine = rsc.readLine();
     } catch (IOException ex) {
         Logger.getLogger(Saisir.class.getName()).log(Level.SEVERE, null, ex);
     }
     return chaine;
 }
 
 public static int saisirEntier(String message)
 {
     int a=0;
     BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
     boolean ok = false;
     
     while(!ok)
     {
        try {
            System.out.print(message);
            a = Integer.parseInt(read.readLine());
            ok=true;
        } catch (Exception ex) {
           // Logger.getLogger(Sasir.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Oops! C'est pas un nombre !!\n");
        }
     }
     return a;
 }
 public static double saisirDouble(String message){
     double a=0;
     BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
     boolean ok=false;
     while(!ok){
         try {
             System.out.print(message);
             a=Double.parseDouble(read.readLine());
             ok=true;
         } catch (Exception e) {
             System.err.println("Oops! C'est pas un decimal !!\n");
         }
     }
     
     return a;
     
 }
}
