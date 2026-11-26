package de.bht.pr2.lession04.example08;

import de.bht.pr2.lession04.common.Person;
import java.util.ArrayList;
import java.util.List;

/**
 * Verschachtelte List: List als List-Element.
 *
 * Neue Konzepte in dieser Klasse:
 * - Verschachtelte Generics: {@code List<List<Person>>} ist eine Liste, deren
 *   Elemente selbst Listen von Personen sind (aehnlich einem 2D-Array).
 * - Die inneren Listen duerfen unterschiedlich lang sein (1, 3 und 2 Personen).
 * - Zugriff in zwei Schritten: gruppen.get(1) liefert gruppeB,
 *   gruppen.get(1).get(0) liefert Bob.
 * - Die aeussere Liste speichert nur Referenzen auf die inneren Listen:
 *   Wird gruppeB spaeter veraendert, sieht man die Aenderung auch in gruppen.
 * - toString() arbeitet verschachtelt: [[...], [..., ..., ...], [..., ...]].
 */
public class MainProgramm8 {

  // Verschachtelte List:
  // List als List-Element

  public static void main(String[] args) {
    Person anna = new Person("Anna Alt");
    Person bob = new Person("Bob Berg");
    Person carla = new Person("Carla Carsten");
    Person daniel = new Person("Daniel Dorf");
    Person eli = new Person("Eli Eiche");
    Person florian = new Person("Florian Fein");

    List<Person> gruppeA = new ArrayList<>();
    gruppeA.add(anna);

    List<Person> gruppeB = new ArrayList<>();
    gruppeB.add(bob);
    gruppeB.add(carla);
    gruppeB.add(daniel);

    List<Person> gruppeC = new ArrayList<>();
    gruppeC.add(eli);
    gruppeC.add(florian);

    // Liste, deren Elemente Listen sind
    List<List<Person>> gruppen = new ArrayList<>();
    gruppen.add(gruppeA);
    gruppen.add(gruppeB);
    gruppen.add(gruppeC);

    System.out.println(gruppen);
    // Zugriff auf ein inneres Element: gruppen.get(1).get(0) --> Bob
  }
}
