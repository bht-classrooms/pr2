package de.bht.pr2.lession03.example04.auto;

/**
 * Navigationsgeraet -- Hilfsklasse fuer Auto.
 *
 * Konzepte in dieser Datei:
 * - Einfache Klasse mit Attributen, Konstruktor und einer Methode.
 * - Wird in Auto.naviBenutzen() als lokales Objekt erzeugt und benutzt:
 *   Ein Objekt kann die Dienste eines anderen Objekts nutzen, ohne es als
 *   Attribut zu speichern.
 * - Zum Thema Collections ist in dieser Klasse nichts neu.
 */
public class Navi {

  // Attribute
  private String marke = "unbekannt";
  private String stimme = "weiblich"; // maennlich oder weiblich

  // Konstruktor
  public Navi(String marke, String stimme) {
    this.marke = marke;
    this.stimme = stimme;
  }

  // Methode
  public void leiten(String adresse) {
    System.out.println("Die Route nach " + adresse + " wird gesucht...");
    System.out.println("Die Route ist gefunden.");
    System.out.println("Bitte in 300 Metern links abbiegen.");
  }
}
