package esprit.tn.Test;

import esprit.tn.Entite.Produit;
import esprit.tn.Gestion.Magasin;
import esprit.tn.GestionEmploye.Caissier;
import esprit.tn.GestionEmploye.Employe;
import esprit.tn.GestionEmploye.Responsable;
import esprit.tn.GestionEmploye.Vendeur;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        Produit p1=new Produit();


        System.out.println("id :"+p1.getIdentifiant());
        System.out.println("marque :"+p1.getMarque());

        System.out.println("libelle :"+p1.getLibelle());
        System.out.println("prix :"+p1.getPrix());

        Produit p2=new Produit(1021,"Delice","Lait");
        System.out.println("id :"+p2.getIdentifiant());
        System.out.println("marque :"+p2.getMarque());

        System.out.println("libelle :"+p2.getLibelle());
        System.out.println("prix :"+p2.getPrix());

        Produit p3=new Produit(2510,"Vitalait","Yaourt");
        Produit p4=new Produit(3250,"Sicam","Tomate",1.2f);

        p3.setPrix(-500);
        System.out.println("test de la méthode affiche");
    p2.afficher();
    p4.afficher();
        System.out.println("to String p2");
        System.out.println(p2.toString());
        System.out.println(p2);
        System.out.println("to String p3");
        System.out.println(p3.toString());
        System.out.println(p3);

        Date d1=new Date();

        p3.setDate_exp(d1);

        Produit p5=new Produit(1,"Delice","YAourt",d1);
        System.out.println("Après modification de date");
        p5.afficher();
        System.out.println(p5);
        System.out.println(p5.getDate_exp());


        System.out.println(p3);

        Magasin m1=new Magasin();

        Magasin m2=new Magasin(1,"ariana");

        m2.ajouter(p1);
        m2.ajouter(p2);

        m1.ajouter(p2);

        System.out.println("Total des produits"+Magasin.getTotalProduit());

        m2.ajouter(p3);
        System.out.println("Total des produits"+Magasin.getTotalProduit());


        m2.afficherLibellePr();

        m1.afficherLibellePr();


        System.out.println(p5.comparer(p2));


        System.out.println(Produit.comparer(p3,p5));


        m2.ajouter(p1);

        System.out.println(m1.plusProduit(m2));

        System.out.println(Magasin.plusProduit(m1,m2));

        Employe responsable=new Responsable(2,"naim",20.2,2);
        Employe caissier = new Caissier(12,3,"Test",3);
        Employe vendeur = new Vendeur(12,"Test",12.2,100);
        System.out.println(responsable.calculerSalaire());
        System.out.println(caissier.calculerSalaire());
    }
}
