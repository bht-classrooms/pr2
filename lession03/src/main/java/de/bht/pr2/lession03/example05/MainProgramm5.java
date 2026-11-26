package de.bht.pr2.lession03.example05;

import java.util.ArrayList;
import java.util.List;

/**
 * Integer, Double - Liste von Zahlen.
 *
 * Neue Konzepte in dieser Klasse:
 * - Generics erlauben nur Referenztypen (Klassen), keine primitiven Typen.
 *   {@code List<int>} oder {@code List<double>} geht nicht.
 * - Stattdessen verwendet man die Wrapper-Klassen: Integer fuer int,
 *   Double fuer double, usw. (alle Wrapper-Klassen in example07).
 * - Beim add(1) wandelt Java den int-Wert automatisch in ein Integer-Objekt
 *   um (Autoboxing, mehr dazu in example07 bis example09).
 * - Die Wrapper-Klassen haben ein passendes toString(), darum erscheint
 *   die Liste als [1, 2, 3].
 */
public class MainProgramm5 {

  // Integer, Double - Liste von Zahlen

  public static void main(String[] args) {
    // Integer statt int -- Generics brauchen eine Klasse
    List<Integer> listeVonIntegers = new ArrayList<Integer>();
    listeVonIntegers.add(1);
    listeVonIntegers.add(2);
    listeVonIntegers.add(3);
    System.out.println(listeVonIntegers);

    List<Double> listeVonDoubles = new ArrayList<Double>();
    listeVonDoubles.add(1.11);
    listeVonDoubles.add(2.22);
    listeVonDoubles.add(3.33);
    System.out.println(listeVonDoubles);
  }
}
