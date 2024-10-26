/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

public class Chef extends Employe{
 private String service;

    public Chef(String Nom, String Prenom, String DatedeNaissance, int salaire,String service) {
        super(Nom, Prenom, DatedeNaissance, salaire);
        this.service=service;
    }
public Chef(Chef c)
{
    super(c);
    this.service=c.service;
}
   
  public String afficher()
  {
      return super.afficher()+"\n"+"Service : "+service;
  }
}
