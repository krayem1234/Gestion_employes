import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    private List<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe t) {
        employes.add(t);
        System.out.println("Employé ajouté : " + t);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (employe.getNom().equals(nom)) {
                System.out.println("Employé trouvé : " + employe);
                return true;
            }
        }
        System.out.println("Aucun employé trouvé avec le nom : " + nom);
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe t) {
        if (employes.contains(t)) {
            System.out.println("Employé trouvé : " + t);
            return true;
        }
        System.out.println("Employé non trouvé : " + t);
        return false;
    }

    @Override
    public void supprimerEmploye(Employe t) {
        if (employes.remove(t)) {
            System.out.println("Employé supprimé : " + t);
        } else {
            System.out.println("Employé non trouvé pour suppression : " + t);
        }
    }

    @Override
    public void displayEmploye() {
        System.out.println("Liste des employés :");
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, Comparator.comparingInt(Employe::getId));
        System.out.println("Employés triés par identifiant.");
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employes.sort(Comparator.comparing(Employe::getNom)
                .thenComparing(Employe::getDepartement)
                .thenComparingInt(Employe::getGrade));
        System.out.println("Employés triés par nom, département et grade.");
    }
}
