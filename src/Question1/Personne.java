/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;


public class Personne {
    private String Nom;
     private String Prenom;
     private String DatedeNaissance;

    public Personne(String Nom, String Prenom, String DatedeNaissance) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.DatedeNaissance = DatedeNaissance;
    }
    public Personne(Personne P)
    {
        this.Nom=P.Nom;
        this.Prenom=P.Prenom;
        this.DatedeNaissance=P.DatedeNaissance;
    }

     
    public String afficher()
    {
        return "\n\nNom & Prenom : "+Nom+" "+Prenom+"\n"+"Date de naissance : "+DatedeNaissance;
    }
}
