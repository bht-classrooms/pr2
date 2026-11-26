package de.bht.pr2.lession04.example07;

/**
 * Collection als Attribut.
 *
 * Neue Konzepte in dieser Klasse:
 * - Die Map steckt im Auto-Objekt. main() greift nie direkt auf sie zu,
 *   sondern aendert sie nur ueber Methoden des Autos (Kapselung).
 * - Jedes Auto-Objekt hat seine eigene Map, weil sie im Konstruktor neu
 *   erzeugt wird. Aenderungen an annasAuto betreffen kein anderes Auto.
 * - Die Ausgaben zeigen, wie sich der Zustand (Inhalt der Map) aendert:
 *   - ausruestungEntfernen("Ersatzrad"): vorhandener Schluessel, Wert wird false
 *   - ausruestungInstallieren("Starthilfeset"): neuer Schluessel wird angelegt
 */
public class MainProgramm7 {

  // Collection als Attribut

  public static void main(String[] args) {
    Auto annasAuto = new Auto("rot", 4, true, AutoMarke.AUDI);

    // Ersatzrad=true, Warndreieck=true, Eiskratzer=false
    System.out.println(annasAuto);

    // Vorhandener Schluessel: Wert true --> false
    annasAuto.ausruestungEntfernen("Ersatzrad");

    System.out.println(annasAuto);

    // Neuer Schluessel: Paar wird hinzugefuegt
    annasAuto.ausruestungInstallieren("Starthilfeset");

    System.out.println(annasAuto);
  }
}
