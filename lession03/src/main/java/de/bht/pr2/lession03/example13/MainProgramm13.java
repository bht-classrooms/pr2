package de.bht.pr2.lession03.example13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * HashSet - Methoden.
 *
 * Neue Konzepte in dieser Klasse:
 * - add() eines schon vorhandenen Elements ("c") aendert das Set nicht.
 *   add() liefert dann false, sonst true.
 * - addAll() funktioniert mit jeder Collection, hier mit einer List.
 * - contains(element) prueft, ob ein Element enthalten ist. Bei einem
 *   HashSet ist das sehr schnell, auch bei vielen Elementen.
 * - remove(element) entfernt ein Element ueber seinen Wert. Anders als bei
 *   der List gibt es keinen Index: kein get(index), set(index, ...) oder
 *   remove(index).
 * - size(), isEmpty() und clear() funktionieren wie bei der ArrayList, weil
 *   sie im gemeinsamen Interface Collection definiert sind.
 */
public class MainProgramm13 {

  // HashSet - Methoden

  public static void main(String[] args) {
    System.out.println("------ Am Anfang ------");
    Set<String> set = new HashSet<>();
    set.add("a");
    set.add("b");
    set.add("c");
    set.add("d");
    set.add("e");
    set.add("f");
    System.out.println(set);

    System.out.println("----- add(\"c\") -----");
    set.add("c"); // Schon vorhanden --> keine Aenderung, add() liefert false
    System.out.println(set);

    System.out.println("----- addAll(x,y,z) -----");
    List<String> liste = new ArrayList<>();
    liste.add("x");
    liste.add("y");
    liste.add("z");
    set.addAll(liste);
    System.out.println(set);

    System.out.println("----- contains(\"c\") -----");
    boolean containsC = set.contains("c");
    System.out.println(containsC + " :: " + set);

    System.out.println("----- remove(\"c\") -----");
    set.remove("c"); // Entfernen ueber den Wert, nicht ueber einen Index
    System.out.println(set);

    System.out.println("----- contains(\"c\") -----");
    containsC = set.contains("c");
    System.out.println(containsC + " :: " + set);

    System.out.println("----- size() -----");
    int groesse = set.size();
    System.out.println(groesse + " :: " + set);

    System.out.println("----- isEmpty() -----");
    boolean leer = set.isEmpty();
    System.out.println(leer + " :: " + set);

    System.out.println("----- clear() -----");
    set.clear();
    groesse = set.size();
    System.out.println(groesse + " :: " + set);

    System.out.println("----- isEmpty() -----");
    leer = set.isEmpty();
    System.out.println(leer + " :: " + set);
  }
}
