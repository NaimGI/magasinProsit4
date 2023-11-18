package esprit.tn.GestionEmploye;

public class Responsable extends  Employe {
    private double prime;
    public int nbh;

    public Responsable(int id, String n, double prime,int nbh) {
        super(id,n);
        this.prime = prime;
        this.nbh=nbh;
    }


    @Override
    public double calculerSalaire() {
        double salaire = getNbh() * 10; // Salaire de base
        // Heures supplémentaires
        if (getNbh() > 160) {
            salaire += salaire * 0.2;
        }
        return salaire + prime;
    }

    @Override
    public String toString() {
        return "Responsable{" +
                "id=" + getId() +
                ", nom='" + getNom() + '\'' +
                ", adresse='" + getAdresse() + '\'' +
                ", nbr_heures=" +
                '}';

    }
}
