package de.bht.pr2.lession03.example03.schiff.freizeit;

import de.bht.pr2.lession03.example03.schiff.Schiff;

/**
 * Unterklasse von Schiff.
 *
 * Konzepte in dieser Klasse:
 * - Vererbung mit extends: Ein Kreuzfahrtschiff IST ein Schiff und erbt
 *   dessen Attribute und Methoden.
 * - Die Klasse liegt in einem anderen Package als Schiff. Deshalb ist ein
 *   import noetig, und der Zugriff auf name, laenge, breite klappt nur, weil
 *   sie protected sind.
 * - super(...) ruft den Konstruktor der Oberklasse auf und muss die erste
 *   Anweisung im Konstruktor sein.
 * - this(...) ruft einen anderen Konstruktor derselben Klasse auf
 *   (Konstruktor-Verkettung mit Standardwerten fuer das Schwimmbad).
 * - Methode ueberschreiben: steuern() ergaenzt das Verhalten und ruft mit
 *   super.steuern(...) die Version der Oberklasse auf.
 * - toString() baut auf super.toString() auf.
 * - @Override kennzeichnet ueberschriebene Methoden (steuern(), toString()).
 *   Der Compiler meldet einen Fehler, wenn es in der Oberklasse keine
 *   passende Methode gibt (z.B. bei einem Tippfehler im Namen).
 */
public class Kreuzfahrtschiff extends Schiff {

  // Attribute
  protected int schwimmbadLaenge = 0;
  protected int schwimmbadBreite = 0;
  protected int schwimmbadTiefe = 0;
  protected boolean klimaanlageAn = false;

  // Konstruktoren
  public Kreuzfahrtschiff(String name, int laenge, int breite) {
    this(name, laenge, breite,
        20, 7, 2); // Default-Schwimmbad-Groesse
  }

  public Kreuzfahrtschiff(String name, int laenge, int breite,
      int schwimmbadLaenge, int schwimmbadBreite, int schwimmbadTiefe) {
    super(name, laenge, breite); // Konstruktor in der
    // Schiff-Klasse aufrufen
    this.schwimmbadLaenge = schwimmbadLaenge;
    this.schwimmbadBreite = schwimmbadBreite;
    this.schwimmbadTiefe = schwimmbadTiefe;
  }

  // Methoden
  public int getSchwimmbadBreite() {
    return schwimmbadBreite;
  }

  public int getSchwimmbadLaenge() {
    return schwimmbadLaenge;
  }

  public int getSchwimmbadTiefe() {
    return schwimmbadTiefe;
  }

  public void setSchwimmbadBreite(int schwimmbadBreite) {
    this.schwimmbadBreite = schwimmbadBreite;
  }

  public void setSchwimmbadLaenge(int schwimmbadLaenge) {
    this.schwimmbadLaenge = schwimmbadLaenge;
  }

  public void setSchwimmbadTiefe(int schwimmbadTiefe) {
    this.schwimmbadTiefe = schwimmbadTiefe;
  }

  public void klimaanlageEinschalten() {
    klimaanlageAn = true;
  }

  public void klimaanlageAusschalten() {
    klimaanlageAn = false;
  }

  public void schwimmbadBlubbern() {
    System.out.println("Das Schwimmbad blubbert ..ooOOOooOO");
  }

  // Ueberschreibt steuern() aus Schiff
  @Override
  public void steuern(int winkel, String linksOderRechts) {
    System.out.println("Liebe Fahrgaeste, wir aendern die Richtung gleich!");
    super.steuern(winkel, linksOderRechts); // Version aus Schiff aufrufen
  }

  @Override
  public String toString() {
    String returnString = "Kreuzfahrtschiff / "
        + super.toString()
        + " mit Schwimbad ("
        + schwimmbadLaenge + "m x " + schwimmbadBreite + "m x "
        + schwimmbadTiefe + "m)";
    return returnString;
  }
}

	