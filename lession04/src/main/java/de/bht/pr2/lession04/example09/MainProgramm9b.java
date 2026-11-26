package de.bht.pr2.lession04.example09;

import de.bht.pr2.lession04.common.Person;
import de.bht.pr2.lession04.common.Schiff;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Objekt als Map-Schluessel, Collection als Map-Wert.
 *
 * Neue Konzepte in dieser Klasse (Vergleich mit MainProgramm9a):
 * - Statt eines Strings dient ein eigenes Objekt (Person) als Schluessel:
 *   {@code Map<Person, List<Schiff>>}.
 * - Voraussetzung: Die Schluessel-Klasse ueberschreibt equals() und
 *   hashCode() (siehe common.Person). Nur dann findet
 *   besitzerZuSchiffen.get(new Person("Anna Alt")) Annas Schiffe, obwohl
 *   es ein anderes Person-Objekt ist als beim put().
 * - Ohne eigenes equals()/hashCode() wuerden die Methoden aus Object
 *   verwendet. Dann zaehlt nur die Objekt-Identitaet (dieselbe Referenz).
 * - Schluessel-Objekte sollte man nach dem Einfuegen nicht mehr veraendern
 *   (z.B. anna.setName(...)): Sonst aendert sich ihr hashCode(), und der
 *   Eintrag wird nicht mehr gefunden.
 */
public class MainProgramm9b {

  // Objekt als Map-Schluessel
  // Collection als Map-Wert

  public static void main(String[] args) {
    //----------------------------------
    // Listen von Schiffen erzeugen
    Schiff schiffAnna1 = new Schiff("Anna 1", 10, 20);
    Schiff schiffAnna2 = new Schiff("Anna 2", 10, 30);
    List<Schiff> annasSchiffe = new ArrayList<Schiff>();
    annasSchiffe.add(schiffAnna1);
    annasSchiffe.add(schiffAnna2);

    Schiff schiffBob1 = new Schiff("Bob 1", 10, 20);
    Schiff schiffBob2 = new Schiff("Bob 2", 10, 30);
    List<Schiff> bobsSchiffe = new ArrayList<Schiff>();
    bobsSchiffe.add(schiffBob1);
    bobsSchiffe.add(schiffBob2);

    //----------------------------------
    // Besitzer erzeugen
    Person anna = new Person("Anna Alt");
    Person bob = new Person("Bob Berg");

    //----------------------------------
    // Besitzer --> Sammlung von Schiffen
    Map<Person, List<Schiff>> besitzerZuSchiffen =
        new HashMap<>();
    besitzerZuSchiffen.put(anna, annasSchiffe);
    besitzerZuSchiffen.put(bob, bobsSchiffe);

    // Funktioniert dank equals()/hashCode() in Person auch mit neuem Objekt:
    // besitzerZuSchiffen.get(new Person("Anna Alt")) --> annasSchiffe

    System.out.println(); // Fuer Breakpoint und Debugger gedacht
  }
}
