package de.bht.pr2.lession03.example02;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList - Methoden.
 *
 * Neue Konzepte in dieser Klasse:
 * - add(element) haengt ein Element hinten an.
 * - addAll(andereListe) haengt alle Elemente einer anderen Collection an;
 *   die andere Liste (liste2) bleibt unveraendert.
 * - Indizes beginnen bei 0 (wie bei Arrays).
 * - subList(von, bis): Teil-Liste von Index "von" (inklusive) bis "bis"
 *   (exklusive). subList(2, 4) liefert also die Elemente an Index 2 und 3.
 *   Die Teil-Liste ist keine Kopie, sondern eine Sicht auf die Original-Liste.
 * - get(index) liest ein Element, set(index, element) ersetzt ein Element.
 * - remove(index) entfernt das Element an einer Position; die folgenden
 *   Elemente rutschen nach vorne.
 * - size() liefert die Anzahl der Elemente (nicht length wie beim Array).
 * - isEmpty() prueft, ob die Liste leer ist; clear() entfernt alle Elemente.
 * - toString() einer Liste hat die Form [a, b, c].
 * - Ein ungueltiger Index (z.B. get(10) bei 4 Elementen) fuehrt zu einer
 *   IndexOutOfBoundsException.
 */
public class MainProgramm2 {

  // ArrayList - Methoden

  public static void main(String[] args) {
    System.out.println("------ Am Anfang ------");
    List<String> liste = new ArrayList<String>();
    System.out.println(liste);

    System.out.println("------ add(\"a\") ------");
    liste.add("a");
    System.out.println(liste);

    System.out.println("------ addAll(liste2) ------");
    List<String> liste2 = new ArrayList<String>();
    liste2.add("b");
    liste2.add("c");
    liste2.add("d");
    liste2.add("e");
    liste.addAll(liste2);

    System.out.println("liste2: " + liste2);
    System.out.println("liste:  " + liste);

    System.out.println("------ subList() ------");
    // Index 2 (inklusive) bis 4 (exklusive) --> [c, d]
    List<String> subListe = liste.subList(2, 4);
    System.out.println("Sub-Liste: " + subListe);
    System.out.println("Originelle Liste: " + liste);

    System.out.println("------ get(2) ------");
    String s2 = liste.get(2); // Index beginnt bei 0 --> drittes Element
    System.out.println("s2: " + s2);

    System.out.println("------ set(2, \"x\") ------");
    liste.set(2, "x");
    System.out.println(liste);

    System.out.println("------ remove(3) ------");
    liste.remove(3); // Entfernt das Element an Index 3 (hier "d")
    System.out.println(liste);

    System.out.println("------ size() ------");
    int groesse = liste.size();
    System.out.println(groesse + " :: " + liste);

    System.out.println("------ isEmpty() ------");
    boolean leer = liste.isEmpty();
    System.out.println(leer + " :: " + liste);

    System.out.println("------ clear() ------");
    liste.clear();
    System.out.println(liste);

    System.out.println("------ isEmpty() ------");
    leer = liste.isEmpty();
    System.out.println(leer + " :: " + liste);
  }
}
