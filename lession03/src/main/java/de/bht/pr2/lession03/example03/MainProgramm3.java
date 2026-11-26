package de.bht.pr2.lession03.example03;

import de.bht.pr2.lession03.example03.schiff.Schiff;
import de.bht.pr2.lession03.example03.schiff.freizeit.Kreuzfahrtschiff;
import de.bht.pr2.lession03.example03.schiff.freizeit.Luxuskreuzfahrtschiff;
import java.util.ArrayList;
import java.util.List;

/**
 * Up- und Downcasting - Wann nuetzlich?
 *
 * Neue Konzepte in dieser Klasse:
 * - Eine {@code List<Schiff>} kann auch Objekte von Unterklassen aufnehmen
 *   (Kreuzfahrtschiff, Luxuskreuzfahrtschiff). Beim Einfuegen findet
 *   automatisch ein Upcasting statt.
 * - Ueber eine Variable vom Typ Schiff sind nur die Methoden von Schiff
 *   aufrufbar. Fuer spezielle Methoden (masseurAbrufen(),
 *   schwimmbadBlubbern()) braucht man ein Downcasting.
 * - Vor dem Downcasting mit instanceof pruefen, sonst droht eine
 *   ClassCastException (Runtime-Error).
 * - Reihenfolge der instanceof-Pruefungen: Die speziellste Klasse zuerst!
 *   Ein Luxuskreuzfahrtschiff ist auch ein Kreuzfahrtschiff -- stuende die
 *   Kreuzfahrtschiff-Pruefung oben, wuerde der Luxus-Zweig nie erreicht.
 * - Klassen aus anderen Packages (schiff, schiff.freizeit) werden mit import
 *   eingebunden.
 * - Hinweis (seit Java 16): Pattern Matching fasst Pruefung und Cast
 *   zusammen: {@code if (s instanceof Luxuskreuzfahrtschiff l) { l.masseurAbrufen(); }}
 */
public class MainProgramm3 {

  // Up- und Downcasting - Wann nuetzlich?

  public static void main(String[] args) {
    //-----------------------------
    // Objekte erzeugen
    Schiff schiff = new Schiff("S-Schiff", 5, 3);

    Kreuzfahrtschiff kreuz =
        new Kreuzfahrtschiff("K-Schiff",
            40, 20,
            20, 10, 4);

    Luxuskreuzfahrtschiff luxus =
        new Luxuskreuzfahrtschiff("L-Schiff",
            40, 20,
            20, 10, 4,
            5);

    //-----------------------------
    // Liste von Schiffe erstellen
    List<Schiff> listeVonSchiffen = new ArrayList<Schiff>();
    listeVonSchiffen.add(schiff);
    listeVonSchiffen.add(kreuz); // Upcasting hier
    listeVonSchiffen.add(luxus); // Upcasting hier

    //-----------------------------
    // Schiff fuer Schiff in der Liste bearbeiten
    for (Schiff s : listeVonSchiffen) {
      // Speziellste Klasse zuerst pruefen!
      if (s instanceof Luxuskreuzfahrtschiff) {
        Luxuskreuzfahrtschiff l = (Luxuskreuzfahrtschiff) s; // Downcasting
        l.masseurAbrufen();
      } else if (s instanceof Kreuzfahrtschiff) {
        Kreuzfahrtschiff k = (Kreuzfahrtschiff) s; // Downcasting
        k.schwimmbadBlubbern();
      } else { // Kein Downcasting noetig
        s.steuern(30, "links");
      }
    }
  }
}
