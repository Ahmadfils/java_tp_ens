/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;


public class Directeur extends Chef {
    private String societe;

    public Directeur(String Nom, String Prenom, String DatedeNaissance, int salaire, String service,String societe) {
        super(Nom, Prenom, DatedeNaissance, salaire, service);
        this.societe=societe;
    }

    public Directeur(Directeur d)
    {
        super(d);
        this.societe=d.societe;
    }
   
    public String afficher()
    {
        return super.afficher()+"\n"+"Société : "+societe;
    }
}
