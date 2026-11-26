package de.bht.pr2.lession04.example10;

import de.bht.pr2.lession04.common.Person;
import de.bht.pr2.lession04.common.Schiff;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Objekt als Map-Schluessel, Collection als Map-Wert:
 * Vorhandenes vs. neues Schluessel-Wert-Paar.
 *
 * Neue Konzepte in dieser Klasse:
 * - Typisches Muster "Gruppieren": Aus einer flachen Liste (alleSchiffe)
 *   wird eine Map aufgebaut, die jedem Besitzer die Liste seiner Schiffe
 *   zuordnet.
 * - Ablauf pro Element:
 *   1. Schluessel aus dem Element ableiten (besitzerName ergibt Person).
 *   2. containsKey(): Gibt es den Schluessel schon?
 *      - ja:   vorhandene Liste mit get() holen
 *      - nein: neue Liste erzeugen und mit put() in die Map eintragen
 *   3. Element in die (jetzt sicher vorhandene) Liste einfuegen.
 * - Referenz-Semantik: zielListe verweist auf dasselbe Listen-Objekt wie die
 *   Map. Ein add() auf zielListe veraendert daher den Map-Inhalt, ein
 *   erneutes put() ist nicht noetig.
 * - Pro Schiff wird ein NEUES Person-Objekt erzeugt. containsKey() erkennt
 *   es trotzdem als vorhanden, weil Person equals()/hashCode() ueberschreibt.
 * - Die Variable zielListe wird vor dem if deklariert, damit sie nach dem
 *   if-else in beiden Faellen verwendet werden kann.
 * - Ausblick (Lambdas kommen spaeter): Das gleiche Muster geht kuerzer mit
 *   {@code besitzerZuSchiffen.computeIfAbsent(besitzer, k -> new ArrayList<>()).add(schiff);}
 */
public class MainProgramm10 {

  // Objekt als Map-Schluessel
  // Collection als Map-Wert
  // Vorhandenes vs. neues Schluessel-Wert-Paar

  public static void main(String[] args) {
    //----------------------------------
    // Liste von Schiffen erzeugen
    Schiff schiffAnna1 = new Schiff("Anna 1", 10, 20, "Anna Alt");
    Schiff schiffAnna2 = new Schiff("Anna 2", 10, 30, "Anna Alt");
    Schiff schiffBob1 = new Schiff("Bob 1", 10, 20, "Bob Berg");
    Schiff schiffBob2 = new Schiff("Bob 2", 10, 30, "Bob Berg");

    List<Schiff> alleSchiffe = new ArrayList<Schiff>();
    alleSchiffe.add(schiffAnna1);
    alleSchiffe.add(schiffAnna2);
    alleSchiffe.add(schiffBob1);
    alleSchiffe.add(schiffBob2);

    //----------------------------------
    // Map erzeugen
    Map<Person, List<Schiff>> besitzerZuSchiffen =
        new HashMap<Person, List<Schiff>>();

    //----------------------------------
    // Inhalt einfuegen
    for (Schiff schiff : alleSchiffe) {
      String besitzerName = schiff.getBesitzerName();
      // Jedes Mal ein neues Objekt -- dank equals()/hashCode() trotzdem
      // als derselbe Schluessel erkannt
      Person besitzer = new Person(besitzerName);
      System.out.print("Besitzer: " + besitzer);

      List<Schiff> zielListe = null; // Platz reservieren

      if (besitzerZuSchiffen.containsKey(besitzer)) {
        zielListe = besitzerZuSchiffen.get(besitzer);
        // Vorhandenen Wert zugreifen
        System.out.println(" -- Name schon da");
      } else {
        zielListe = new ArrayList<Schiff>();
        // Neuen Wert erzeugen
        besitzerZuSchiffen.put(besitzer, zielListe);
        // Neues Schluessel-Wert-Paar
        // in der Map speichern
        System.out.println(" -- neuer Namen");
      }

      // Egal ob der Besitzer-Name neu oder vorhanden ist,
      // ist zielListe jetzt initialisiert.
      // zielListe ist dasselbe Objekt wie in der Map --> kein erneutes put() noetig
      zielListe.add(schiff);
    }

    System.out.println(); // Fuer Breakpoint und Debugger gedacht
  }
}
