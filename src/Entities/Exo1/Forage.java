package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    private int diametre;


    public Forage(int idCategorie, String nom, int hauteur, int debit, int diametre) {
        super(idCategorie, nom, hauteur, debit);
        this.diametre = diametre;
    }

    @Override
    public double GetVolume() {
        double volume = Math.PI * this.diametre + super.getHauteur();
        return volume;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    public String GetDescription(){
        String description = super.GetDescription()+" - diamètre "+this.diametre;
        return description;
    }
}
