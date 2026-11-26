package de.bht.pr2.lession04.example04;

import de.bht.pr2.lession04.common.Schiff;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * HashMap - Schluessel-Wert-Paare durchlaufen.
 *
 * Neue Konzepte in dieser Klasse:
 * - Eine Map ist selbst keine Collection und kann nicht direkt mit der
 *   for-each-Schleife durchlaufen werden. Man durchlaeuft stattdessen
 *   keySet(), values() (siehe example03) oder entrySet().
 * - keySet() liefert alle Schluessel als {@code Set<String>}. Es ist ein Set,
 *   weil Schluessel eindeutig sind. Den Wert holt man dann mit get(key).
 * - entrySet() liefert alle Paare als {@code Set<Entry<String, Schiff>>}.
 * - Map.Entry ist ein inneres Interface von Map (Import: java.util.Map.Entry).
 *   Ein Entry-Objekt kennt getKey() und getValue().
 * - Verschachtelte Generics: Der Typ-Parameter des Sets ist selbst ein
 *   generischer Typ ({@code Entry<String, Schiff>}).
 * - entrySet() ist meist die bessere Wahl, wenn man Schluessel UND Wert
 *   braucht: Die zusaetzliche Suche mit get() in jedem Durchlauf entfaellt.
 * - Die Reihenfolge beim Durchlaufen einer HashMap ist nicht festgelegt.
 */
public class MainProgramm4 {

  // HashMap - Schluessel-Wert-Paare durchlaufen

  public static void main(String[] args) {
    Map<String, Schiff> namenZuSchiffen = new HashMap<String, Schiff>();

    Schiff schiff1 = new Schiff("Flotte Quelle", 30, 7);
    Schiff schiff2 = new Schiff("Freier Wind", 6, 2);
    Schiff schiff3 = new Schiff("Blaue Krabben", 42, 9);

    namenZuSchiffen.put(schiff1.getName(), schiff1);
    namenZuSchiffen.put(schiff2.getName(), schiff2);
    namenZuSchiffen.put(schiff3.getName(), schiff3);

    // Mit for-Schleife und keySet()
    System.out.println("----- for-Schleife und keySet() -----");
    Set<String> namen = namenZuSchiffen.keySet();
    for (String name : namen) {
      // Pro Schluessel eine zusaetzliche Suche mit get()
      System.out.println(name + " --> " + namenZuSchiffen.get(name));
    }

    // Mit for-Schleife und entrySet()
    System.out.println("----- for-Schleife und entrySet() -----");
    Set<Entry<String, Schiff>> entries = namenZuSchiffen.entrySet();
    for (Entry<String, Schiff> entry : entries) {
      // Schluessel und Wert direkt aus dem Entry -- kein get() noetig
      System.out.println(entry.getKey() + " --> " + entry.getValue());
    }
  }
}
