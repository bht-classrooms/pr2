package de.bht.pr2.lession03.example03.schiff.freizeit;

/**
 * Unterklasse von Kreuzfahrtschiff.
 *
 * Konzepte in dieser Klasse:
 * - Mehrstufige Vererbung: Schiff, davon abgeleitet Kreuzfahrtschiff, davon
 *   abgeleitet Luxuskreuzfahrtschiff. Ein Luxuskreuzfahrtschiff ist also
 *   auch ein Kreuzfahrtschiff und ein Schiff.
 * - Gleiches Package wie Kreuzfahrtschiff, darum ist kein import noetig.
 * - super(...) ruft immer den Konstruktor der direkten Oberklasse auf
 *   (hier Kreuzfahrtschiff).
 * - Ueberladen statt Ueberschreiben: schwimmbadBlubbern(int sekunden) hat
 *   eine andere Parameterliste als schwimmbadBlubbern() in der Oberklasse.
 *   Beide Varianten sind verfuegbar.
 * - toString() mit super.toString() ueber mehrere Stufen: Die Ausgabe
 *   enthaelt die Texte aller drei Klassen.
 */
public class Luxuskreuzfahrtschiff extends Kreuzfahrtschiff {

  // Attribut
  protected int anzahlVonMasseuren = 0;

  // Konstruktor
  public Luxuskreuzfahrtschiff(String name, int laenge, int breite,
      int schwimmbadLaenge, int schwimmbadBreite, int schwimmbadTiefe,
      int anzahlVonMasseuren) {
    super(name, laenge, breite,
        schwimmbadLaenge, schwimmbadBreite, schwimmbadTiefe);
    this.anzahlVonMasseuren = anzahlVonMasseuren;
  }

  // Methoden
  public int getAnzahlVonMasseuren() {
    return anzahlVonMasseuren;
  }

  public void masseurAbrufen() {
    System.out.println("Ein Masseur kommt sofort zu Ihnen");
  }

  public void setAnzahlVonMasseuren(int anzahlVonMasseuren) {
    this.anzahlVonMasseuren = anzahlVonMasseuren;
  }

  // Ueberladen (andere Parameter), nicht ueberschrieben
  public void schwimmbadBlubbern(int sekunden) {
    System.out.println("Das Schwimmbad blubbert ..ooOOOooOO fuer "
        + sekunden + " Sekunden");
  }

  @Override
  public String toString() {
    String returnString = "Luxuskreuzfahrtschiff / "
        + super.toString()
        + " & mit " + anzahlVonMasseuren + " Masseure";
    return returnString;
  }
}
	