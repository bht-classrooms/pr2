package de.bht.pr2.lession03.example09;

import java.util.ArrayList;
import java.util.List;

/**
 * Autoboxing und Unboxing - ArrayList.
 *
 * Neue Konzepte in dieser Klasse:
 * - Autoboxing beim Einfuegen: add(1) speichert ein Integer-Objekt.
 * - Unboxing beim Auslesen: int a = liste.get(0) wandelt das Integer-Objekt
 *   automatisch in einen int um.
 * - Dadurch fuehlt sich eine {@code List<Integer>} fast wie eine Liste von
 *   int-Werten an.
 * - Stolperfalle remove(): Bei einer {@code List<Integer>} entfernt
 *   remove(1) das Element an INDEX 1, nicht den Wert 1. Um den Wert zu
 *   entfernen: remove(Integer.valueOf(1)).
 * - Stolperfalle ==: Integer-Objekte mit equals() vergleichen, nicht mit ==.
 *   == vergleicht Referenzen. Wegen eines internen Caches liefert == nur
 *   fuer kleine Werte (-128 bis 127) true, bei groesseren Werten oft false.
 */
public class MainProgramm9 {

  // Autoboxing und Unboxing - ArrayList

  public static void main(String[] args) {
    List<Integer> listeVonIntegers = new ArrayList<>();

    listeVonIntegers.add(1); // Autoboxing
    listeVonIntegers.add(2); // Autoboxing
    listeVonIntegers.add(3); // Autoboxing

    int a = listeVonIntegers.get(0); // Unboxing
    int b = listeVonIntegers.get(1); // Unboxing
    int c = listeVonIntegers.get(2); // Unboxing
  }
}
