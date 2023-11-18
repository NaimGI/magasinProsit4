package esprit.tn.GestionEmploye;

public class Vendeur extends Employe {
    private double tauxDeVente;
    public  int nbh;

    public Vendeur(int id, String n, double tauxDeVente,int nbh) {
        super(id,n);
        this.tauxDeVente = tauxDeVente;
        this.nbh=nbh;
    }

    @Override
    public double calculerSalaire() {
        return 450 * (tauxDeVente / 100);
    }

    @Override
    public String toString() {
        return "Vendeur{" +
                "id=" + getId() +
                ", nom='" + getNom() + '\'' +
                ", adresse='" + getAdresse() + '\'' +
                ", nbr_heures=" +
                '}';
    }
}