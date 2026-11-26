package de.bht.pr2.lession03.example04.auto;

/**
 * Auto -- wird in MainProgramm4 in einer ArrayList gespeichert.
 *
 * Konzepte in dieser Klasse:
 * - Enum als Attributtyp und Konstruktor-Parameter (AutoMarke marke).
 *   Das Attribut kann nur einen der im enum definierten Werte annehmen
 *   (oder null).
 * - Kapselung: private Attribute, Zugriff nur ueber Getter und Setter.
 * - Ein Setter kann Werte pruefen, bevor er sie uebernimmt (setFarbe()).
 * - toString() ueberschreiben, damit println(auto) bzw. println(liste) eine
 *   lesbare Ausgabe liefert (mit @Override gekennzeichnet).
 * - Ein Objekt einer anderen Klasse (Navi) kann lokal in einer Methode
 *   erzeugt und benutzt werden (naviBenutzen()).
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

  //-------------------
  // Konstruktor
  public Auto(String farbe, int anzahlVonTueren, boolean schiebedach,
      AutoMarke marke) { // Enum-Wert als Eingabe
    this.farbe = farbe;
    this.anzahlVonTueren = anzahlVonTueren;
    this.schiebedach = schiebedach;
    this.marke = marke; // Enum-Wert zuweisen
  }

  //-------------------
  // Methoden
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

  @Override
  public String toString() {
    String returnString = "Auto: " + farbe + ", " + anzahlVonTueren + " Tueren";
    if (schiebedach) {
      returnString += " mit Schiebedach";
    } else {
      returnString += " ohne Schiebedach";
    }

    return returnString;
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
}
