import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<Etudiant> students = new ArrayList<>();
        students.add(new Etudiant(3, "Alice", 22));
        students.add(new Etudiant(1, "Bob", 20));
        students.add(new Etudiant(2, "Charlie", 23));

        StudentManagement management = new StudentManagement();

        // Afficher tous les étudiants
        management.displayStudents(students, System.out::println);

        // Afficher les étudiants âgés de plus de 21 ans
        System.out.println("Etudiants âgés de plus de 21 ans :");
        management.displayStudentsByFilter(students, student -> student.getAge() > 21, System.out::println);

        // Retourner les noms des étudiants
        String names = management.returnStudentsNames(students, Etudiant::getNom);
        System.out.println("Noms des étudiants : " + names);

        // Créer un nouvel étudiant
        Etudiant newStudent = management.createStudent(() -> new Etudiant(4, "Diana", 21));
        students.add(newStudent);

        // Trier les étudiants par ID
        management.sortStudentsById(students, Comparator.comparingInt(Etudiant::getId));

        // Afficher les étudiants après tri
        System.out.println("Après tri par ID :");
        students.forEach(System.out::println);
    }
}
