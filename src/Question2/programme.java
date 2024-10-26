/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;


import java.util.ArrayList;
import java.util.Scanner;


public class programme {
    
    public static void main(String[] args) {
        
      
        ArrayList<Article> art=new ArrayList<>();
        art.add(new Article());
        art.add(new Article(1,"Orange",1000,20));
        art.add(new Article(2, "Viva",1200,30));
        art.add(new Article(3, "Apple",1000,10));
        art.add(new Article(4, "Coca-cola",1500,60));
        art.add(new Article(5, "Royal",3000,30));
        art.add(new Article(6, "Fanta",1000,5));
        
        Scanner ecrire=new Scanner(System.in);
        
        int choix=0;
        
        while(choix!=11){
        
         System.out.println("\n\n\n------------------MENU-------------------\n");
         System.out.println("  Choisir une option à exécuter : \n");
         System.out.println("1-Rechercher un Article par son numéro ");
         System.out.println("2-Ajouter un Article");
         System.out.println("3-Supprimer un Article");
         System.out.println("4-Modifier un Article");
         System.out.println("5-Rechercher un Article par son nom");
         System.out.println("6-Rechercher un Article par intervalle de prix de vente");
         System.out.println("7-Afficher tous les Articles");
         System.out.println("8-Alimenter la quantité en stock d'un Article");
         System.out.println("9-Calculer le prix total vente d'un Article");
         System.out.println("10-Calculer le prix total vente de tout le stock");
         System.out.println("11-Quitter");
         
           
         choix=Saisir.saisirEntier("\nVotre choix :");
           
            
            switch(choix)
            {
                case 1:
                    
                    int chercheNum=Saisir.saisirEntier("\nEntrer le numéro de l'Article à rechercher : ");
                    
                    boolean trouve=false;
                    
                    for(Article a:art){
                      if(a.numeroRef==chercheNum){
                          System.out.println("\n Numéro  | Nom        | Prix de vente   | Quantité\n***************************************************");
                          System.out.println(a);                          
                          trouve=true;
                          
                      } 
                    }
                    if(!trouve)
                        System.out.println("\nArticle non trouvé !");
                        break;
                    
                
                case 2:
                   
                    int num=Saisir.saisirEntier("\nSaisir le Numéro de l'Article: ");
                 
                        for(Article w:art){
                         while(num==w.numeroRef){
                                             
                          System.out.println("\nLe numéro existe déjà,Utiliser une autre !");
                          num=Saisir.saisirEntier("\nSaisir  encore le Numéro de l'Article: ");
                       
                          }
                        }
                          
                           
                           String nom=Saisir.saisirChaine("Saisir le Nom de l'Article: ");
                    
                           double prix=Saisir.saisirDouble("Saisir le Prix de vente de l'Article: ");               
                           int qt=Saisir.saisirEntier("Saisir la Quantité de l'Article: ");
                           
                        
                           art.add(new Article(num, nom, prix, qt));
                           System.out.println("\nArticle ajouté avec succès !"); 
                           break;
                case 3:
                   
                    int sup=Saisir.saisirEntier("\nEntrer le numéro de l'Article à supprimer : ");
                    ecrire.nextLine();
                    
                    if(sup>=0 && sup<art.size())
                    {
                      art.remove(sup);
                      System.out.println("\nArticle supprimé avec succès !");
                    }else{
                        System.out.println("\nNuméro de l'Article invalide ");
                    }
                      break;
                case 4:
                   
                    int mod=Saisir.saisirEntier("\nEntrer le numéro de l'Article à modifier : ");                
                    if(mod>=0 && mod<art.size()){
                        Article p=art.get(mod);           
                         int numModif=Saisir.saisirEntier("Nouveau numéro(Actuel:"+p.numeroRef+") : ");

                         if(numModif>0){
                             p.numeroRef=numModif;
                         }
                        
                        
                         String nomModif=Saisir.saisirChaine("Nouveau nom(Actuel:"+p.nomArt+") : ");
                         if(!nomModif.isEmpty()){
                             p.nomArt=nomModif;
                         }
                        
                         
                         double prixModif=Saisir.saisirDouble("Nouveau prix(Actuel:"+p.prixVente+") : ");
                         if(prixModif>0){
                             p.prixVente=prixModif;
                         }
                        
                        
                         int  qtModif=Saisir.saisirEntier("Nouveau quantite(Actuel:"+p.quantite+") : ");
                         
                         if(qtModif>=0){
                             p.quantite=qtModif;
                         }
                         
                         System.out.println("\nArticle modifié avec succès!");
                    }else{
                        
                        System.out.println("Numéro de l'Article invalide ");
                    }
                    break;
                
                case 5:
           
                    String cherchenom=Saisir.saisirChaine("\nEntrer le nom de l'Article à rechercher : ");
                    boolean nomtrouve=false;
                    
                    for(Article ab:art){
                      
                        if(ab.nomArt.equals(cherchenom)){
                          
                          System.out.println("\n Numéro  | Nom        | Prix de vente   | Quantité\n***************************************************");
                          System.out.println(ab);
                          nomtrouve=true;
                          break;
                      } 
                    }
                    if(!nomtrouve){
                        System.out.println("\nArticle non-trouvé !");
                    }
                    break;
                
                case 6:
                    
                    double prix1=Saisir.saisirDouble("\nEntrer le premier prix de vente: ");
                  
                    double prix2=Saisir.saisirDouble("Entrer le deuxieme prix vente: ");
                    boolean ok=false;
                   
                    
                    for(Article abc:art){
                        if(abc.prixVente>prix1 && abc.prixVente<prix2){
                            
                            System.out.println("\n Numéro  | Nom        | Prix de vente   | Quantité\n***************************************************");                           
                            System.out.println(abc);
                            ok=true;
                            break;
                        }
                         
                    } 
                    
                        if(!ok)
                        {
                            System.out.println("\nIntrouvable !");
                        }
                    break;
                
                case 7: 
                    System.out.println("\nLISTE D'ARTICLE EN STOCK\n*************************");
                    System.out.println("\n Numéro  | Nom        | Prix de vente   | Quantité\n***************************************************");
                    
                    for(int i=0;i<art.size();i++)
                    {
                        Article arti=art.get(i);
                        System.out.println(arti);
                    }
                    break;
                    
                case 8:
                    
                    int ali=Saisir.saisirEntier("\nEntrer le numéro de l'Article pour alimenter/retirer sa quantité:");
                    if(ali>=0 && ali<art.size()){                        
                    
                        Article numAl=art.get(ali);
                   
                        int ajouterqt=Saisir.saisirEntier("Quantité à alimener ou retirer(Actuel:"+numAl.quantite+"): ");
                        ecrire.nextLine();
                        
                        if(ajouterqt!=0){
                            numAl.quantite+=ajouterqt;
                        }
                        System.out.println("\nLa modification réussi avec succès !");
                    }else
                        System.out.println("\nNuméro de l'Article invalide ");
                   break;
                      
                case 9:
                    int pr=Saisir.saisirEntier("\nEntrer le Numéro de l'Article:");
                    boolean tro=false;
                    
                    for(Article abcd:art){
                      if(abcd.numeroRef==pr){
                          double t=abcd.prixVente*abcd.quantite;
                          System.out.println("\n=>Son prix total est : "+t);
                          tro=true;
                          break;
                      }
                    }
                    if(!tro){
                        System.out.println("\nArticle non-trouvé !");
                    }
                    break;
                
                case 10:
                    
                    double s=0;
                    for(int i=0;i<art.size();i++){
                        Article sum=art.get(i);
                        s+=sum.prixVente*sum.quantite;
                        
                    }
                     System.out.println("\n=>Le Prix total vente de tout le stock est : "+s);   
                    break;
                
                case 11:
                     System.out.println("\nAu revoir...!");
                     break;
                default :
                    System.out.println("\nChoix invalide ");
                    
            }
            
        }
    }
    
}
