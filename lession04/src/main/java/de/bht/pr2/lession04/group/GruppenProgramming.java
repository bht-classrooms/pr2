package de.bht.pr2.lession04.group;


import de.bht.pr2.lession04.example07.Auto;
import de.bht.pr2.lession04.example07.AutoMarke;
import java.util.HashMap;
import java.util.Map;

/**
 * Gruppenaufgabe: Map aus einem Attribut aufbauen und darauf zugreifen.
 *
 * Konzepte in dieser Klasse (Anwendung von example01 und example02):
 * - Map mit einem Attribut des Objekts als Schluessel: farbe (String)
 *   als Schluessel, Auto als Wert.
 * - Zugriff ueber den Schluessel mit get("blau") statt Suche per Schleife.
 * - Klassen aus einem anderen Package verwenden (import aus example07);
 *   das geht, weil Auto und AutoMarke public sind.
 * - Achtung: Haetten zwei Autos dieselbe Farbe, wuerde das zweite put()
 *   das erste Auto ueberschreiben -- Schluessel sind eindeutig.
 */
public class GruppenProgramming {

  // Aufgaben:
  // (1) Map erzeugen: farbe --> Auto
  // (2) das blaue Auto zugreifen

  public static void main(String[] args) {
    Auto autoRot = new Auto("rot", 4, true, AutoMarke.AUDI);
    Auto autoGelb = new Auto("gelb", 4, true, AutoMarke.BMW);
    Auto autoBlau = new Auto("blau", 4, true, AutoMarke.PORSCHE);
    Auto autoGruen = new Auto("gruen", 4, true, AutoMarke.VOLKSWAGEN);

    Map<String, Auto> farbenZuAutos = new HashMap<String, Auto>();
    farbenZuAutos.put(autoRot.getFarbe(), autoRot);
    farbenZuAutos.put(autoGelb.getFarbe(), autoGelb);
    farbenZuAutos.put(autoBlau.getFarbe(), autoBlau);
    farbenZuAutos.put(autoGruen.getFarbe(), autoGruen);

    Auto autoZuZugreifen = farbenZuAutos.get("blau");
    System.out.println(autoZuZugreifen);
  }
}
