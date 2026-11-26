package de.bht.pr2.lession03.example03.schiff;

/**
 * Basisklasse der Schiff-Hierarchie (Schiff, Kreuzfahrtschiff,
 * Luxuskreuzfahrtschiff).
 *
 * Konzepte in dieser Klasse:
 * - protected-Attribute: Unterklassen duerfen direkt darauf zugreifen, auch
 *   wenn sie in einem anderen Package liegen (hier: schiff.freizeit).
 * - toString() ist mit @Override ueberschrieben. Der Compiler prueft dann,
 *   dass es die Methode in der Oberklasse (Object) wirklich gibt.
 * - steuern() wird in Kreuzfahrtschiff ueberschrieben und dort mit
 *   super.steuern(...) wiederverwendet.
 * - Die Klasse hat KEIN equals()/hashCode(). Darum gelten zwei Schiffe mit
 *   gleichen Werten nicht als gleich (siehe example15).
 */
public class Schiff {

  // Attribute
  protected String name = "";
  protected int laenge = 0;
  protected int breite = 0;

  // Konstruktor
  public Schiff(String name, int laenge, int breite) {
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
}

	