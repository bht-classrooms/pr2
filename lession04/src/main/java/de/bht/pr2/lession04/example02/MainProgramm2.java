package de.bht.pr2.lession04.example02;


import de.bht.pr2.lession04.common.Schiff;
import java.util.HashMap;
import java.util.Map;

/**
 * HashMap - grundlegende Methoden.
 *
 * Neue Konzepte in dieser Klasse:
 * - put(key, value) mit NEUEM Schluessel: Ein neues Paar wird eingefuegt.
 * - put(key, value) mit VORHANDENEM Schluessel: Der alte Wert wird ersetzt.
 *   Schluessel sind in einer Map eindeutig, es gibt keine doppelten Schluessel.
 *   (put() liefert den ersetzten alten Wert zurueck, bei neuem Schluessel null.)
 * - Werte duerfen dagegen mehrfach vorkommen: Nach dem Ersetzen steht schiff2
 *   unter "Freier Wind" UND unter "Blaue Krabben".
 * - get(key) liefert den Wert zum Schluessel. Gibt es den Schluessel nicht,
 *   liefert get() null -- es gibt keine Exception.
 * - remove(key) entfernt das ganze Schluessel-Wert-Paar.
 * - Gesucht wird ueber equals()/hashCode() des Schluessels: Das
 *   String-Literal "Blaue Krabben" findet den Eintrag, auch wenn es nicht
 *   dasselbe String-Objekt wie beim Einfuegen ist.
 */
public class MainProgramm2 {

  // HashMap - Methoden

  public static void main(String[] args) {
    System.out.println("----- Am Anfang -----");
    Map<String, Schiff> nameToShip = new HashMap<>();
    System.out.println(nameToShip);

    System.out.println("----- put() -----");
    Schiff schiff1 = new Schiff("Flotte Quelle", 30, 7);
    Schiff schiff2 = new Schiff("Freier Wind", 6, 2);
    Schiff schiff3 = new Schiff("Blaue Krabben", 42, 9);

    nameToShip.put(schiff1.getName(), schiff1);
    nameToShip.put(schiff2.getName(), schiff2);
    nameToShip.put(schiff3.getName(), schiff3);

    System.out.println(nameToShip);

    System.out.println("----- get(\"Blaue Krabben\") -----");
    Schiff schiffB = nameToShip.get("Blaue Krabben");
    System.out.println(schiffB);
    // Hinweis: nameToShip.get("Titanic") wuerde null liefern

    System.out.println("----- put(\"Blaue Krabben\", schiff2) d.h. Wert ersetzen -----");
    // Schluessel existiert schon --> alter Wert (schiff3) wird ueberschrieben
    nameToShip.put("Blaue Krabben", schiff2);
    System.out.println(nameToShip);

    System.out.println("----- remove(\"Blaue Krabben\") -----");
    // Entfernt Schluessel UND Wert
    nameToShip.remove("Blaue Krabben");
    System.out.println(nameToShip);
  }
}
