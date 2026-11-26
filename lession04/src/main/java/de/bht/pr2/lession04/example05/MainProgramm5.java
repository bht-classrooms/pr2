package de.bht.pr2.lession04.example05;

import de.bht.pr2.lession04.common.Person;
import java.util.HashSet;
import java.util.Set;

/**
 * Operationen mit Collection-Objekten -- HashSet.
 *
 * Neue Konzepte in dieser Klasse:
 * - Mengenoperationen mit Methoden aus dem Interface Collection:
 *   - addAll(b)    = Vereinigung  (A oder B):  alle Elemente aus A und aus B
 *   - removeAll(b) = Differenz    (A ohne B):  Elemente aus A, die nicht in B sind
 *   - retainAll(b) = Schnittmenge (A und B):   nur Elemente, die in A und B sind
 * - Alle drei liefern einen boolean: true, wenn sich setA veraendert hat.
 * - Ein Set enthaelt keine Duplikate: Nach addAll() kommen Bob und Carla
 *   nur einmal vor.
 * - Ob zwei Elemente gleich sind, entscheidet ein HashSet ueber hashCode()
 *   und equals() der Elemente (siehe common.Person).
 * - Die Methoden veraendern setA direkt, setB bleibt unveraendert. Deshalb
 *   wird vor jeder Operation listenErzeugen() erneut aufgerufen.
 * - static-Attribute (setA, setB) und eine private static-Hilfsmethode,
 *   die von main() aus aufgerufen wird.
 * - Ein HashSet garantiert keine Reihenfolge der Elemente.
 */
public class MainProgramm5 {

  // Operationen mit Collection-Objekten -- HashSet

  private static Set<Person> setA = null;
  private static Set<Person> setB = null;

  private static void listenErzeugen() {
    Person anna = new Person("Anna Alt");
    Person bob = new Person("Bob Berg");
    Person carla = new Person("Carla Carsten");
    Person daniel = new Person("Daniel Dorf");

    setA = new HashSet<>();
    setA.add(anna);
    setA.add(bob);
    setA.add(carla);

    setB = new HashSet<>();
    setB.add(bob);
    setB.add(carla);
    setB.add(daniel);
  }

  public static void main(String[] args) {
    //----------------------------------
    // addAll() -- Vereinigung: Anna, Bob, Carla, Daniel (keine Duplikate)
    listenErzeugen();
    setA.addAll(setB);
    System.out.println("----- addAll() -----");
    System.out.println(setA);

    //----------------------------------
    // removeAll() -- Differenz: Anna
    listenErzeugen();
    setA.removeAll(setB);
    System.out.println("----- removeAll() -----");
    System.out.println(setA);

    //----------------------------------
    // retainAll() -- Schnittmenge: Bob, Carla
    listenErzeugen();
    setA.retainAll(setB);
    System.out.println("----- retainAll() -----");
    System.out.println(setA);
  }
}
