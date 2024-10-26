/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;


public class Employe extends Personne {
    private int salaire;
    
    public Employe(String Nom, String Prenom, String DatedeNaissance,int salaire) {
        super(Nom, Prenom, DatedeNaissance);
        this.salaire=salaire;
    }
 public Employe(Employe e)
 {
     super(e);
     this.salaire=e.salaire;
 }
  
 
    public String afficher()
    {
        return super.afficher()+"\n"+"Salaire : "+salaire;
    }
}
