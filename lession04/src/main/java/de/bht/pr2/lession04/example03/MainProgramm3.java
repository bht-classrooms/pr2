package de.bht.pr2.lession04.example03;

import de.bht.pr2.lession04.common.Schiff;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * HashMap - weitere Methoden.
 *
 * Neue Konzepte in dieser Klasse:
 * - containsKey(key) prueft, ob ein Schluessel vorhanden ist
 *   (analog prueft containsValue(value), ob ein Wert vorhanden ist).
 * - size() liefert die Anzahl der Schluessel-Wert-Paare.
 * - values() liefert alle Werte als {@code Collection<Schiff>}. Das ist weder
 *   eine List noch ein Set: Werte koennen doppelt vorkommen, und eine
 *   Reihenfolge ist nicht garantiert. Durchlaufen geht mit der for-each-Schleife.
 * - isEmpty() prueft, ob die Map leer ist; clear() entfernt alle Paare.
 * - putAll(andereMap) uebernimmt alle Paare einer anderen Map. Vorhandene
 *   Schluessel wuerden dabei ueberschrieben (wie bei put()).
 * - Explizite Typ-Parameter wie {@code new HashMap<String, Schiff>()} sind
 *   gleichwertig zum Diamond-Operator {@code new HashMap<>()}.
 */
public class MainProgramm3 {

  // HashMap - Methoden

  public static void main(String[] args) {
    System.out.println("----- Am Anfang -----");
    Map<String, Schiff> nameToShip = new HashMap<String, Schiff>();

    Schiff schiff1 = new Schiff("Flotte Quelle", 30, 7);
    Schiff schiff2 = new Schiff("Freier Wind", 6, 2);
    Schiff schiff3 = new Schiff("Blaue Krabben", 42, 9);

    nameToShip.put(schiff1.getName(), schiff1);
    nameToShip.put(schiff2.getName(), schiff2);
    nameToShip.put(schiff3.getName(), schiff3);

    System.out.println(nameToShip);

    System.out.println("----- containsKey(\"Blaue Krabben\") -----");
    boolean containsBlaueKrabben = nameToShip.containsKey("Blaue Krabben");
    System.out.println(containsBlaueKrabben);

    System.out.println("----- size() -----");
    int groesse = nameToShip.size();
    System.out.println("Groesse: " + groesse);

    System.out.println("----- values() -----");
    // Nur die Werte, ohne Schluessel
    Collection<Schiff> schiffe = nameToShip.values();
    for (Schiff s : schiffe) {
      System.out.println(s);
    }

    System.out.println("----- isEmpty() -----");
    boolean leer = nameToShip.isEmpty();
    System.out.println(leer + " :: " + nameToShip);

    System.out.println("----- clear() -----");
    nameToShip.clear();
    System.out.println(nameToShip);

    System.out.println("----- isEmpty() -----");
    leer = nameToShip.isEmpty();
    System.out.println(leer + " :: " + nameToShip);

    System.out.println("----- putAll() -----");
    Schiff schiff4 = new Schiff("Blah 4", 30, 10);
    Schiff schiff5 = new Schiff("Blah 5", 30, 10);
    Schiff schiff6 = new Schiff("Blah 6", 30, 10);

    Map<String, Schiff> blah = new HashMap<String, Schiff>();

    blah.put(schiff4.getName(), schiff4);
    blah.put(schiff5.getName(), schiff5);
    blah.put(schiff6.getName(), schiff6);

    // Alle Paare aus blah in nameToShip uebernehmen
    nameToShip.putAll(blah);

    System.out.println(nameToShip);
  }
}
