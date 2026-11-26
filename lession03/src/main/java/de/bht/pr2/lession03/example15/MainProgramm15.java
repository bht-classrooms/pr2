package de.bht.pr2.lession03.example15;

import de.bht.pr2.lession03.example03.schiff.Schiff;
import java.util.HashSet;
import java.util.Set;

/**
 * HashSet mit eigenen Objekten -- OHNE equals() und hashCode().
 *
 * Neue Konzepte in dieser Klasse:
 * - Ein HashSet entscheidet mit hashCode() und equals(), ob zwei Elemente
 *   gleich sind (also ob ein Element schon vorhanden ist).
 * - Schiff ueberschreibt diese Methoden nicht. Dann gelten die Versionen
 *   aus Object: Gleich ist nur, was dasselbe Objekt ist (Objekt-Identitaet,
 *   wie bei ==).
 * - Folge: Das Set enthaelt 4 Schiffe, obwohl schiffA1 und schiffA2 (bzw.
 *   schiffB1 und schiffB2) dieselben Werte haben.
 * - Unterschied: == vergleicht Referenzen, equals() soll Inhalte vergleichen
 *   -- tut das aber erst, wenn eine Klasse es ueberschreibt (example16).
 */
public class MainProgramm15 {

  /* Ohne equals()- und hashCode()-Methode sind zwei Schiffe nur gleich,
  wenn ihre Referenz-Variablen auf das selbe Objekt zeigen. */

  public static void main(String[] args) {
    //-----------------------------
    // Schiffe erzeugen
    Schiff schiffA1 = new Schiff("A", 40, 20);
    Schiff schiffA2 = new Schiff("A", 40, 20);

    Schiff schiffB1 = new Schiff("B", 40, 20);
    Schiff schiffB2 = new Schiff("B", 40, 20);

    //-----------------------------
    // Set erzeugen
    Set<Schiff> setVonSchiffen = new HashSet<>();
    setVonSchiffen.add(schiffA1);
    setVonSchiffen.add(schiffA2);
    setVonSchiffen.add(schiffB1);
    setVonSchiffen.add(schiffB2);

    // Ausgabe: 4 Schiffe -- jedes Objekt gilt als verschieden
    for (Schiff s : setVonSchiffen) {
      System.out.println(s);
    }
  }
}
