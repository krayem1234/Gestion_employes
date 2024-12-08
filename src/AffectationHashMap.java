import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Employe {
    private int id;
    private String nom;

    public Employe(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employe{id=" + id + ", nom='" + nom + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employe employe = (Employe) obj;
        return id == employe.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

class Departement {
    private int id;
    private String nom;

    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Departement{id=" + id + ", nom='" + nom + "'}";
    }
}

class AffectationHashMap {
    private Map<Employe, Departement> affectations = new HashMap<>();

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        affectations.forEach((employe, departement) ->
                System.out.println(employe + " -> " + departement)
        );
    }

    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        affectations.remove(e, d);
    }

    public void afficherEmployes() {
        affectations.keySet().forEach(System.out::println);
    }

    public void afficherDepartements() {
        affectations.values().stream().distinct().forEach(System.out::println);
    }

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> treeMap = new TreeMap<>((e1, e2) -> Integer.compare(e1.getId(), e2.getId()));
        treeMap.putAll(affectations);
        return treeMap;

    }
}
