package de.bht.pr2.lession04.example01;


import de.bht.pr2.lession04.common.Schiff;
import java.util.HashMap;
import java.util.Map;

/**
 * HashMap erzeugen.
 *
 * Neue Konzepte in dieser Klasse:
 * - Eine Map speichert Schluessel-Wert-Paare: Zu jedem Schluessel (Key)
 *   gehoert genau ein Wert (Value). Hier: Schiffsname (Key) und Schiff (Value).
 * - Generics mit zwei Typ-Parametern: {@code Map<String, Schiff>}
 *   (String = Typ der Schluessel, Schiff = Typ der Werte).
 * - Interface als Variablentyp (Map), konkrete Klasse beim Erzeugen (HashMap)
 *   -- genau wie List/ArrayList in lession03.
 * - Diamond-Operator: {@code new HashMap<>()} -- die Typ-Parameter leitet der
 *   Compiler aus der linken Seite der Zuweisung ab.
 * - put(key, value) fuegt ein Paar ein. Der Schluessel wird oft aus einem
 *   Attribut des Werts gebildet (schiff.getName()).
 * - Kopier-Konstruktor: {@code new HashMap<>(andereMap)} erzeugt eine neue Map
 *   mit denselben Paaren. Es ist eine flache Kopie: Die Schiff-Objekte selbst
 *   werden nicht kopiert, beide Maps verweisen auf dieselben Objekte.
 * - toString() einer Map hat die Form {schluessel1=wert1, schluessel2=wert2}.
 * - Eine HashMap garantiert keine bestimmte Reihenfolge der Eintraege.
 */
public class MainProgramm1 {

  // HashMap erzeugen

  public static void main(String[] args) {
    //----------------------------
    // Eingabe: nichts
    Map<String, Schiff> nameToShip = new HashMap<>();

    //----------------------------
    // Eingabe: eine Map
    Schiff schiff1 = new Schiff("a", 10, 20);
    Schiff schiff2 = new Schiff("b", 10, 30);
    Schiff schiff3 = new Schiff("c", 20, 20);

    // put(Schluessel, Wert)
    nameToShip.put(schiff1.getName(), schiff1);
    nameToShip.put(schiff2.getName(), schiff2);
    nameToShip.put(schiff3.getName(), schiff3);

    // Neue Map mit denselben Paaren (flache Kopie: dieselben Schiff-Objekte)
    Map<String, Schiff> namenZuSchiffen2 = new HashMap<>(nameToShip);

    System.out.println(namenZuSchiffen2);
  }
}
