/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author pc
 */
public class main {

    
    public static void main(String[] args) {
        
      Personne[] p=new Personne[8];
        
      p[0]=new Employe("NAHOMVUKIYE", "Gaddy", "2000-04-04",500000);
      p[1]=new Employe("NAHIMANA", "Hugues", "2003-02-02", 4000000);
      p[2]=new Employe("NKURUNZIZA", "Jean", "2004-09-30", 2000000);
      p[3]=new Employe("KAGABO", "Hassan", "1999-10-20", 6000000);
      p[4]=new Employe("SHURWE", "Rachel", "1980-12-14", 1000000);
      p[5]=new Chef("NKURU", "Marie", "1980-12-14", 10000000, "Administrateur");
      p[6]=new Chef("KANYANA", "Aimee", "1980-12-14", 15000000, "Manager");
      p[7]=new Directeur("BUCUMI", "Pascal", "1980-12-14", 10000000, "DG","BRB");
        
        for(int i=0;i<p.length;i++)
        {
            
          if(i==0){
              System.out.println("\n\n-----LISTE DES EMPLOYES-----");
              
          }
          
          if(i==4){
              System.out.println("\n\n-----LISTE DES CHEFS-----");
              
          }
          if(i==7){
              System.out.println("\n\n-----LISTE DES DIRECTEURS-----");
              
          }
            System.out.println(p[i].afficher());  
        }
            
    }
    
}
