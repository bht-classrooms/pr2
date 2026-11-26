package de.bht.pr2.lession03.example10;

import java.util.ArrayList;
import java.util.List;

/**
 * Programming to an Interface.
 *
 * Neue Konzepte in dieser Klasse:
 * - List ist ein Interface, ArrayList eine Klasse, die dieses Interface
 *   implementiert.
 * - Als Variablentyp das Interface verwenden (List), nur beim Erzeugen die
 *   konkrete Klasse (ArrayList). Vorteil: Die Implementierung laesst sich
 *   spaeter an EINER Stelle austauschen (z.B. LinkedList), der restliche
 *   Code bleibt unveraendert.
 * - Das gilt auch fuer Parameter und Rueckgabetypen von Methoden: Eine
 *   Methode mit Parameter {@code List<Integer>} akzeptiert jede Art von Liste.
 * - Von einem Interface kann man kein Objekt erzeugen:
 *   {@code new List<>()} ist ein Compile-Fehler.
 */
public class MainProgramm10 {

  // Programming to an Interface

  public static void main(String[] args) {
    // Zu vermeiden: ArrayList ist eine Klasse
    ArrayList<Integer> liste1 = new ArrayList<>();

    // Besser: List ist ein Interface
    List<Integer> liste2 = new ArrayList<>();

    // Fehler: man darf ein Interface nicht als Objekt erzeugen
    // TODO: Kommentar in der nächsten Zeile entfernen
    //List<Integer> liste3 = new List<>();
  }
}
