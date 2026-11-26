package de.bht.pr2.lession04.example06;

import de.bht.pr2.lession04.common.Person;
import java.util.ArrayList;
import java.util.List;

/**
 * Operationen mit Collection-Objekten -- ArrayList.
 *
 * Neue Konzepte in dieser Klasse (Vergleich mit example05 / HashSet):
 * - Dieselben Methoden addAll(), removeAll() und retainAll() gibt es fuer
 *   jede Collection, weil sie im Interface Collection definiert sind.
 * - Unterschied List und Set:
 *   - addAll() haengt alle Elemente hinten an. Duplikate bleiben erhalten:
 *     Bob und Carla stehen danach zweimal in der Liste.
 *   - Die Reihenfolge der Elemente bleibt erhalten.
 * - removeAll() entfernt JEDES Vorkommen eines Elements, das in listB steht.
 * - retainAll() behaelt nur Elemente, die auch in listB vorkommen.
 * - Verglichen wird ueber equals() der Elemente. hashCode() spielt bei einer
 *   ArrayList keine Rolle (anders als beim HashSet).
 */
public class MainProgramm6 {

  // Operationen mit Collection-Objekten -- ArrayList

  private static List<Person> listA = null;
  private static List<Person> listB = null;

  private static void listenErzeugen() {
    Person anna = new Person("Anna Alt");
    Person bob = new Person("Bob Berg");
    Person carla = new Person("Carla Carsten");
    Person daniel = new Person("Daniel Dorf");

    listA = new ArrayList<Person>();
    listA.add(anna);
    listA.add(bob);
    listA.add(carla);

    listB = new ArrayList<Person>();
    listB.add(bob);
    listB.add(carla);
    listB.add(daniel);
  }

  public static void main(String[] args) {
    //----------------------------------
    // addAll() -- Anna, Bob, Carla, Bob, Carla, Daniel (mit Duplikaten!)
    listenErzeugen();
    listA.addAll(listB);
    System.out.println("----- addAll() -----");
    System.out.println(listA);

    //----------------------------------
    // removeAll() -- Anna
    listenErzeugen();
    listA.removeAll(listB);
    System.out.println("----- removeAll() -----");
    System.out.println(listA);

    //----------------------------------
    // retainAll() -- Bob, Carla
    listenErzeugen();
    listA.retainAll(listB);
    System.out.println("----- retainAll() -----");
    System.out.println(listA);
  }
}
