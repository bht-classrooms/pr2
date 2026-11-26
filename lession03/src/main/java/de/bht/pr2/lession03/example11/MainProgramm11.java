package de.bht.pr2.lession03.example11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterator.
 *
 * Neue Konzepte in dieser Klasse:
 * - Jede Collection liefert mit iterator() ein Iterator-Objekt, mit dem man
 *   die Elemente nacheinander durchlaeuft.
 * - hasNext() prueft, ob es noch ein weiteres Element gibt.
 * - next() liefert das naechste Element und rueckt weiter.
 * - Ein Iterator laeuft nur einmal durch. Fuer einen neuen Durchlauf holt
 *   man sich mit iterator() einen neuen Iterator.
 * - Vor JEDEM next() muss hasNext() geprueft werden. Bei 5 Elementen holt
 *   der zweite Durchlauf Paare (a,b), (c,d) -- beim dritten Paar gibt es
 *   nach "e" kein Element mehr, und next() wirft eine NoSuchElementException.
 * - Die for-each-Schleife verwendet intern ebenfalls einen Iterator.
 * - Mit it.remove() kann man waehrend des Durchlaufs sicher das zuletzt
 *   gelieferte Element entfernen. liste.remove(...) in einer for-each-Schleife
 *   fuehrt dagegen zu einer ConcurrentModificationException.
 */
public class MainProgramm11 {

  // Iterator

  public static void main(String[] args) {
    List<String> liste = new ArrayList<>();
    liste.add("a");
    liste.add("b");
    liste.add("c");
    liste.add("d");
    liste.add("e");

    Iterator<String> it = liste.iterator();
    while (it.hasNext()) {   // Gibt es noch ein Element?
      String s = it.next();  // Element holen und weiterruecken
      System.out.println(s);
    }

    System.out.println("---------------");

    // IMMER mit hasNext() pruefen bevor Sie mit next() zugreifen
    it = liste.iterator(); // Neuer Iterator fuer einen neuen Durchlauf
    while (it.hasNext()) {
      String s1 = it.next();
      String s2 = it.next(); // Gefaehrlich, Runtime-Error! (NoSuchElementException bei "e")
      System.out.println(s1 + " :: " + s2);
    }
  }
}
