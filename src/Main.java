import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Ajout de quelques employés
        Employe employe1 = new Employe(1, "Dupont", "Jean", "Informatique", 3);
        Employe employe2 = new Employe(2, "Martin", "Lucie", "Comptabilité", 2);
        Employe employe3 = new Employe(3, "Durand", "Pierre", "Ressources Humaines", 4);
        Employe employe4 = new Employe(4, "Leclerc", "Marie", "Marketing", 1);

        societe.ajouterEmploye(employe1);
        societe.ajouterEmploye(employe2);
        societe.ajouterEmploye(employe3);
        societe.ajouterEmploye(employe4);

        // Affichage des employés
        System.out.println("\nListe des employés après l'ajout :");
        societe.displayEmploye();

        // Recherche d'un employé par nom
        System.out.println("\nRecherche de l'employé avec le nom 'Martin' :");
        societe.rechercherEmploye("Martin");

        // Recherche d'un employé par instance
        System.out.println("\nRecherche de l'employé employe3 :");
        societe.rechercherEmploye(employe3);

        // Suppression d'un employé
        System.out.println("\nSuppression de l'employé employe2 :");
        societe.supprimerEmploye(employe2);

        // Affichage des employés après suppression
        System.out.println("\nListe des employés après suppression :");
        societe.displayEmploye();

        // Tri des employés par identifiant
        System.out.println("\nTri des employés par identifiant :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Tri des employés par nom, département et grade
        System.out.println("\nTri des employés par nom, département et grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
    }
}
