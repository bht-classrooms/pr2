package de.bht.pr2.lession04.example07;

import java.util.HashMap;
import java.util.Map;

/**
 * Auto mit einer Collection als Attribut.
 *
 * Neue Konzepte in dieser Klasse (markiert mit "NEU"):
 * - Eine Map als Attribut einer Klasse: {@code Map<String, Boolean>}
 *   (Schluessel: Name der Ausruestung, Wert: vorhanden ja/nein).
 * - Das Map-Objekt wird im Konstruktor erzeugt und mit Standardwerten
 *   gefuellt. Ohne {@code new HashMap<>()} waere das Attribut null, und jeder
 *   Zugriff wuerde eine NullPointerException ausloesen.
 * - Wrapper-Klasse Boolean als Werttyp: Generics erlauben keine primitiven
 *   Typen ({@code Map<String, boolean>} geht nicht). Autoboxing wandelt
 *   true/false automatisch in Boolean-Objekte um.
 * - Kapselung: Das Attribut ist private, und es gibt keinen Getter fuer die
 *   Map. Aendern kann man sie nur ueber ausruestungEntfernen() und
 *   ausruestungInstallieren().
 * - put() dient zum Aendern UND zum Hinzufuegen: Ein vorhandener Schluessel
 *   bekommt einen neuen Wert, ein neuer Schluessel wird angelegt.
 * - ausruestungEntfernen() setzt den Wert auf false, statt das Paar mit
 *   remove() zu loeschen. So bleibt sichtbar, dass die Ausruestung bekannt,
 *   aber nicht vorhanden ist.
 * - toString() gibt auch die Map aus; die Map hat selbst ein passendes toString().
 */
public class Auto {

  //-------------------
  // Attribute
  private String farbe = "unbekannt";
  private int anzahlVonTueren = 4;
  private boolean schiebedach = true;
  private boolean lichtAn = false;
  private int geschwindigkeit = 0;
  private AutoMarke marke = null;

  //===== NEU =====
  private Map<String, Boolean> sonstigeAusruestungen = null;

  //-------------------
  // Konstruktor
  public Auto(String farbe, int anzahlVonTueren, boolean schiebedach,
      AutoMarke marke) { // Enum-Wert als Eingabe
    this.farbe = farbe;
    this.anzahlVonTueren = anzahlVonTueren;
    this.schiebedach = schiebedach;
    this.marke = marke; // Enum-Wert zuweisen

    //===== NEU =====
    // Map erzeugen -- sonst waere das Attribut null
    sonstigeAusruestungen = new HashMap<String, Boolean>();
    // Nach Standard vorhanden (Autoboxing: true --> Boolean)
    sonstigeAusruestungen.put("Ersatzrad", true);
    sonstigeAusruestungen.put("Warndreieck", true);
    // Nach Standard nicht vorhanden
    sonstigeAusruestungen.put("Eiskratzer", false);
  }

  //-------------------
  // Methoden

  //===== NEU =====
  public void ausruestungEntfernen(String ausruestung) {
    // Wert auf false setzen, Schluessel bleibt erhalten
    sonstigeAusruestungen.put(ausruestung, false);
  }

  //===== NEU =====
  public void ausruestungInstallieren(String ausruestung) {
    // Vorhandener Schluessel: Wert ersetzen / neuer Schluessel: Paar anlegen
    sonstigeAusruestungen.put(ausruestung, true);
  }

  public void bremsen() {
    while (geschwindigkeit > 0) {
      geschwindigkeit--;
    }
  }

  public int getAnzahlVonTueren() { // Getter
    return anzahlVonTueren;
  }

  public String getFarbe() { // Getter
    return farbe;
  }

  public int getGeschwindigkeit() { // Getter
    return geschwindigkeit;
  }

  public boolean getLichtAn() { // Getter
    return lichtAn;
  }

  public AutoMarke getMarke() { // Getter
    return marke;
  }

  public boolean getSchiebedach() { // Getter
    return schiebedach;
  }

  public void lichtAnmachen() {
    if (!lichtAn) {
      lichtAn = true;
    }
  }

  public void naviBenutzen(String marke, String stimme, String adresse) {
    Navi tomtom = new Navi(marke, stimme);
    tomtom.leiten(adresse);
  }

  public void setAnzahlVonTueren(int anzahlVonTueren) { // Setter
    this.anzahlVonTueren = anzahlVonTueren;
  }

  public void setFarbe(String farbe) { // Setter
    // Eventuell Pruefung oder Anpassung, z.B.
    if (!farbe.equals("durchsichtig")) {
      this.farbe = farbe;
    }
  }

  public void setGeschwindigkeit(int geschwindigkeit) { // Setter
    this.geschwindigkeit = geschwindigkeit;
  }

  public void setMarke(AutoMarke marke) { // Setter
    this.marke = marke;
  }

  public void setLichtAn(boolean lichtAn) { // Setter
    this.lichtAn = lichtAn;
  }

  public void setSchiebedach(boolean schiebedach) { // Setter
    this.schiebedach = schiebedach;
  }

  public void tuerAufmachen(String tuer) {
    System.out.println("Tuer " + tuer + " auf");
  }

  public void tuerenAufmachen() {
    tuerAufmachen("links vorne");
    tuerAufmachen("rechts vorne");
    tuerAufmachen("links hinten");
    tuerAufmachen("rechts hinten");
  }

  @Override
  public String toString() {
    return "Auto [" +
        "farbe='" + farbe +
        ", anzahlVonTueren=" + anzahlVonTueren +
        ", schiebedach=" + schiebedach +
        ", lichtAn=" + lichtAn +
        ", geschwindigkeit=" + geschwindigkeit +
        ", marke=" + marke +
        ", sonstigeAusruestungen=" + sonstigeAusruestungen +
        ']';
  }
}
