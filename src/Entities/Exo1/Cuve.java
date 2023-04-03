package Entities.Exo1;

public class Cuve extends Captage implements IVolume
{
    private int largeur;
    private int longueur;

    public Cuve(int idCategorie, String nom, int hauteur, int debit, int largeur, int longueur) {
        super(idCategorie, nom, hauteur, debit);
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public double GetVolume() {
        double volume = longueur * largeur;
        return volume;
    }
    public String GetDescription(){
        String description = super.GetDescription()+" - largeur "+this.largeur+" - longueur "+this.longueur;
        return description;
    }
}
