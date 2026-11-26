package de.bht.pr2.lession03.example12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * HashSet erzeugen.
 *
 * Neue Konzepte in dieser Klasse:
 * - Ein Set ist eine Menge: Jedes Element kommt hoechstens einmal vor.
 * - Set ist ein Interface, HashSet eine Implementierung (wie List/ArrayList).
 * - Ein HashSet garantiert keine Reihenfolge der Elemente. Dass "a" bis "f"
 *   hier sortiert erscheinen, liegt nur an den Hashwerten dieser kurzen
 *   Strings und darf nicht vorausgesetzt werden.
 * - Kopier-Konstruktor: {@code new HashSet<>(collection)} akzeptiert jede
 *   Collection -- ein anderes Set oder auch eine List.
 * - Umwandeln zwischen List und Set:
 *   - {@code new ArrayList<>(set)}: Set zu List (dann mit Index-Zugriff)
 *   - {@code new HashSet<>(liste)}: List zu Set (Duplikate fallen dabei weg)
 * - Gemeinsames Ober-Interface von List und Set ist Collection.
 */
public class MainProgramm12 {

  // HashSet erzeugen

  public static void main(String[] args) {
    //----------------------------
    // Eingabe: nichts
    Set<String> set1 = new HashSet<>();
    set1.add("a");
    set1.add("b");
    set1.add("c");
    set1.add("d");
    set1.add("e");
    set1.add("f");
    System.out.println(set1);

    //----------------------------
    // Eingabe: eine Collection
    Set<String> set2 = new HashSet<>(set1); // Set ist eine Collection
    System.out.println(set2);

    List<String> liste = new ArrayList<>(set1);
    Set<String> set3 = new HashSet<>(liste); // List ist eine Collection
    System.out.println(set3);
  }
}
