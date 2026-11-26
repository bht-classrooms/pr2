package de.bht.pr2.lession03.example16;

import java.util.Objects;

/**
 * Schiff mit ueberschriebenem equals() und hashCode().
 *
 * Neue Konzepte in dieser Klasse:
 * - equals(Object o) ueberschreiben -- typischer Aufbau:
 *   1. Gleiche Referenz (this == o): sofort true.
 *   2. o ist null oder hat eine andere Klasse: false.
 *   3. Cast auf die eigene Klasse.
 *   4. Die relevanten Attribute vergleichen: primitive Typen mit ==,
 *      Objekte mit Objects.equals() (null-sicher).
 * - Der Parameter von equals() muss vom Typ Object sein, sonst wird die
 *   Methode nur ueberladen statt ueberschrieben. @Override deckt so einen
 *   Fehler beim Kompilieren auf.
 * - hashCode() ueberschreiben, z.B. mit Objects.hash(name, laenge, breite).
 * - Vertrag: Sind zwei Objekte laut equals() gleich, MUESSEN sie denselben
 *   hashCode() liefern. Darum verwenden beide Methoden dieselben Attribute.
 *   (Umgekehrt duerfen ungleiche Objekte zufaellig denselben Hashwert haben.)
 * - IDEs wie IntelliJ koennen equals() und hashCode() generieren.
 */
public class SchiffWithEqualsHashCode {

  // Attribute
  protected String name = "";
  protected int laenge = 0;
  protected int breite = 0;

  // Konstruktor
  public SchiffWithEqualsHashCode(String name, int laenge, int breite) {
    this.name = name;
    this.laenge = laenge;
    this.breite = breite;
  }

  public int getBreite() {
    return breite;
  }

  public int getLaenge() {
    return laenge;
  }

  public String getName() {
    return name;
  }

  public void setBreite(int breite) {
    this.breite = breite;
  }

  public void setLaenge(int laenge) {
    this.laenge = laenge;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void steuern(int winkel, String linksOderRechts) {
    System.out.println("Schiff biegt " + winkel
        + " Grad " + linksOderRechts + " ab.");
  }

  @Override
  public String toString() {
    return "Schiff [" +
        "name='" + name +
        ", laenge=" + laenge +
        ", breite=" + breite +
        ']';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) { // Mit selbst vergleichen
      return true;
    }
    if (o == null || getClass() != o.getClass()) { // Mit null vergleichen, oder falsche Klasse
      return false;
    }

    SchiffWithEqualsHashCode schiff = (SchiffWithEqualsHashCode) o; // Mit casting koennen wir obj als Schiff behandeln

    // Attribute vergleichen
    if (laenge != schiff.laenge) {
      return false;
    }
    if (breite != schiff.breite) {
      return false;
    }
    return Objects.equals(name, schiff.name);
  }

  @Override
  public int hashCode() {
    // Dieselben Attribute wie in equals() verwenden!
    return Objects.hash(name, laenge, breite);
  }

  /* Alternative
  @Override
  public int hashCode() {
    return Objects.hashCode(name + " " + laenge + " " + breite);
  }
  */
}

	