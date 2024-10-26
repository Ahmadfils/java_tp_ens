/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

public class Article{
  int numeroRef;
  String nomArt;
  double prixVente;
  int quantite;

    public Article(int numeroRef, String nomArt, double prixVente, int quantite) {
        this.numeroRef = numeroRef;
        this.nomArt = nomArt;
        this.prixVente = prixVente;
        this.quantite = quantite;
    }
  
    public Article()
    {
        this.nomArt="Energy";
        this.numeroRef=0;
        this.prixVente=1000;
        this.quantite=30;
    }
  public String toString()
  {
      return "\n"+"  "+numeroRef+"        "+nomArt+"          "+prixVente+"           "+quantite;
  }
  
  
}
