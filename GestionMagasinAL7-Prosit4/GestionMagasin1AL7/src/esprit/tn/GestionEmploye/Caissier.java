package esprit.tn.GestionEmploye;

public class Caissier extends Employe{
    private int numCaiss;
    public int nbh;
    public Caissier()
    {

    }
    @Override
    public double calculerSalaire() {
        double salaire = getNbh() * 5; // Salaire de base

        // Heures supplémentaires
        if (getNbh() > 180) {
            salaire += salaire * 0.15;
        }

        return salaire ;
    }
   public Caissier(int num,int id,String n,int nbh)
   {//super();
       super(id,n);
       numCaiss=num;
       this.nbh=nbh;
   }

    public int getNumCaiss() {
        return numCaiss;
    }

    public void setNumCaiss(int numCaiss) {
        this.numCaiss = numCaiss;
    }

    public String toString()
    {
        return "Caissier "+super.toString()
                +"num Caisse :"+numCaiss;
    }

    public void testtoStrin()
    {

        System.out.println("super :"+super.toString());
        System.out.println("this :"+this.toString());
    }
}
