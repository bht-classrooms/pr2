package de.bht.pr2.lession03.example14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * HashSet - Objekte durchlaufen.
 *
 * Neue Konzepte in dieser Klasse:
 * - Ein Set hat keinen Index, darum geht keine klassische for-Schleife
 *   mit get(i). Es gibt drei Moeglichkeiten:
 *   1. for-each-Schleife -- der einfachste Weg.
 *   2. Iterator mit hasNext()/next() (siehe example11) -- funktioniert fuer
 *      jede Collection, also auch fuer Sets.
 *   3. Das Set in eine ArrayList kopieren und dann mit Index durchlaufen.
 * - Die Reihenfolge beim Durchlaufen eines HashSet ist nicht festgelegt.
 *   Erst die Kopie in eine ArrayList hat eine feste Reihenfolge (mit Index).
 */
public class MainProgramm14 {

  // HashSet - Objekte durchlaufen

  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("a");
    set.add("b");
    set.add("c");
    set.add("d");
    set.add("e");
    set.add("f");

    // Mit for-Schleife
    System.out.println("----- for-Schleife -----");
    for (String s : set) {
      System.out.print(s + " :: ");
    }
    System.out.println();

    // Mit Iterator
    System.out.println("----- Iterator -----");
    Iterator<String> it = set.iterator();
    while (it.hasNext()) {
      String s = it.next();
      System.out.print(s + " :: ");
    }
    System.out.println();

    // Mit ArrayList
    System.out.println("----- ArrayList -----");
    List<String> list = new ArrayList<>(set);
    for (int i = 0; i < list.size(); i++) {
      String s = list.get(i);
      System.out.println(i + " :: " + s);
    }
  }
}
