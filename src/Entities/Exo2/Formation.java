package Entities.Exo2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Formation
{
    private int idFormation;
    private String nomFormation;
    private int prixFormation;

    private ArrayList<Participant> lesParticipants;

    public Formation(int idFormation, String nomFormation, int prixFormation) {
        this.idFormation = idFormation;
        this.nomFormation = nomFormation;
        this.prixFormation = prixFormation;
        this.lesParticipants = new ArrayList<>();
    }

    public void AjouterParticipant(Participant unParticipant)
    {
        lesParticipants.add(unParticipant);
    }

    // Cette méthode permet de compter le nombre de participants
    // réellement présents à la formation.
    public int GetNombreDePresents()
    {
        // A compléter ici
        int nbPresent = 0;
        for (Participant unParticipant:lesParticipants){
            if (unParticipant.isEstPresent()){
                nbPresent = nbPresent+1;
            }
        }

        return nbPresent;
    }

    // Cette méthode permet de calculer le montant total
    // des frais kilométriques versés pour une formation
    // en ne prenant en compte que les participants présents.
    // On rembourse 1.89 du KM
    public double CalculerFraisRemboursementKilometriques()
    {
        // A compléter ici
        double totalkm = 0;
        for (Participant unParticipant:lesParticipants){
            if (unParticipant.isEstPresent()){
                totalkm = unParticipant.getNbKm() + totalkm;
            }
        }
        double total = totalkm * 1.89;

        return total;
    }

    // Cette méthode permet de calculer le taux de présence
    // par rapport au nombre d'inscrits
    public double TauxDePresence()
    {
        // A compléter ici
        int nbPresent = 0;
        for (Participant unParticipant:lesParticipants){
            if (unParticipant.isEstPresent()){
                nbPresent = nbPresent + 1 ;
            }
        }
        double taux = 100 * nbPresent / lesParticipants.size();
        return taux;
    }

    // Cette méthode permet de calculer le bénéfice de la formation.
    // Ce dernier se détermine en multipliant le nombre de présents par le prix de la formation moins
    // les frais kilométriques versés
    public double BeneficeFormation()
    {
        // A compléter ici
        return  0;
    }
}
