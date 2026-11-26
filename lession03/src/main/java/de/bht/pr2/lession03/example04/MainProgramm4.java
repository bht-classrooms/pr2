package de.bht.pr2.lession03.example04;

import de.bht.pr2.lession03.example04.auto.Auto;
import de.bht.pr2.lession03.example04.auto.AutoMarke;
import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList durchlaufen.
 *
 * Neue Konzepte in dieser Klasse:
 * - Liste von eigenen Objekten: {@code List<Auto>}.
 * - Zwei Arten, eine Liste zu durchlaufen:
 *   1. Klassische for-Schleife mit Index: i von 0 bis size() - 1, Zugriff
 *      mit get(i). Nuetzlich, wenn man den Index braucht.
 *   2. for-each-Schleife: for (Auto auto : listeVonAutos). Kuerzer und
 *      ohne Index-Fehler, aber ohne Zugriff auf den Index.
 * - Auf jedem Element kann man Methoden aufrufen (auto.bremsen()).
 * - Die Liste speichert Referenzen: Aenderungen an einem Element (z.B. durch
 *   bremsen()) betreffen dasselbe Objekt, auf das auch annasAuto zeigt.
 * - Enum-Werte als Konstruktor-Argumente (AutoMarke.AUDI, ...).
 */
public class MainProgramm4 {

  // ArrayList durchlaufen

  public static void main(String[] args) {
    // ArrayList erzeugen
    List<Auto> listeVonAutos = new ArrayList<Auto>();

    // Objekte einfuegen
    Auto annasAuto = new Auto("rot", 4, true, AutoMarke.AUDI);
    Auto bobsAuto = new Auto("blau", 2, true, AutoMarke.BMW);
    Auto cassiesAuto = new Auto("gelb", 4, false, AutoMarke.VOLKSWAGEN);

    listeVonAutos.add(annasAuto);
    listeVonAutos.add(bobsAuto);
    listeVonAutos.add(cassiesAuto);

    // Groesse der ArrayList nachfragen
    int groesse = listeVonAutos.size(); // 3
    System.out.println("Liste hat " + groesse + " Autos");

    // Objekte zugreifen
    // (1) Klassische for-Schleife: Zugriff ueber den Index
    for (int i = 0; i < groesse; i++) {
      System.out.println("klassische for-Schleife, i = "
          + i + ": " + listeVonAutos.get(i));
    }

    // (2) for-each-Schleife: "fuer jedes Auto in listeVonAutos"
    for (Auto auto : listeVonAutos) {
      System.out.println("for-each for-Schleife: " + auto);
      auto.bremsen();
    }
  }
}
