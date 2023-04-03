package Entities.Exo1;

public class Captage implements Comparable
{
    private int idCategorie;
    private String nom;
    private int hauteur;
    private int debit;

    public Captage(int idCategorie, String nom, int hauteur, int debit) {
        this.idCategorie = idCategorie;
        this.nom = nom;
        this.hauteur = hauteur;
        this.debit = debit;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public String GetDescription(){
        String description = this.nom+" - "+this.hauteur+" mètres - "+this.debit+" litres";
        return description;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getDebit() {
        return debit;
    }
}
