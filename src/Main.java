public class Main {
    public static void main(String[] args) {
        AffectationHashMap gestion = new AffectationHashMap();

        Employe emp1 = new Employe(1, "Alice");
        Employe emp2 = new Employe(2, "Bob");
        Departement dep1 = new Departement(101, "RH");
        Departement dep2 = new Departement(102, "IT");

        // Ajout d'employés et de départements
        gestion.ajouterEmployeDepartement(emp1, dep1);
        gestion.ajouterEmployeDepartement(emp2, dep2);

        System.out.println("Affichage des employés et départements :");
        gestion.afficherEmployesEtDepartements();

        // Tentative d'ajout du même employé dans deux départements
        gestion.ajouterEmployeDepartement(emp1, dep2);
        System.out.println("\nAprès modification :");
        gestion.afficherEmployesEtDepartements();

        // Suppression d'un employé
        gestion.supprimerEmploye(emp1);
        System.out.println("\nAprès suppression de Alice :");
        gestion.afficherEmployesEtDepartements();

        // Recherche d'employés et départements
        System.out.println("\nRecherche de Bob : " + gestion.rechercherEmploye(emp2));
        System.out.println("Recherche du département IT : " + gestion.rechercherDepartement(dep2));

        // Affichage trié
        System.out.println("\nAffichage trié :");
        gestion.trierMap().forEach((employe, departement) ->
                System.out.println(employe + " -> " + departement)
        );
    }
}
