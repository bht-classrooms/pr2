package de.bht.pr2.lession03.example16;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet mit eigenen Objekten -- MIT equals() und hashCode().
 *
 * Neue Konzepte in dieser Klasse (Vergleich mit example15):
 * - SchiffWithEqualsHashCode ueberschreibt equals() und hashCode(). Zwei
 *   Schiffe mit gleichem Namen, gleicher Laenge und Breite gelten jetzt als
 *   gleich.
 * - Folge: Das Set enthaelt nur noch 2 Schiffe. Beim add() von schiffA2
 *   erkennt das HashSet, dass ein gleiches Element schon vorhanden ist.
 * - Ablauf im HashSet: Zuerst wird mit hashCode() der passende "Behaelter"
 *   (Bucket) gesucht, dann wird darin mit equals() genau verglichen.
 *   Darum muessen beide Methoden zusammenpassen.
 */
public class MainProgramm16 {

  // Die equals()- und hashCode()-Methode sollte überschrieben werden, wenn man eine eigene "Idendität" von Objekten braucht

  public static void main(String[] args) {
    //-----------------------------
    // Schiffe erzeugen
    SchiffWithEqualsHashCode schiffA1 = new SchiffWithEqualsHashCode("A", 40, 20);
    SchiffWithEqualsHashCode schiffA2 = new SchiffWithEqualsHashCode("A", 40, 20);

    SchiffWithEqualsHashCode schiffB1 = new SchiffWithEqualsHashCode("B", 40, 20);
    SchiffWithEqualsHashCode schiffB2 = new SchiffWithEqualsHashCode("B", 40, 20);

    //-----------------------------
    // Set erzeugen
    Set<SchiffWithEqualsHashCode> setVonSchiffen = new HashSet<>();
    setVonSchiffen.add(schiffA1);
    setVonSchiffen.add(schiffA2);
    setVonSchiffen.add(schiffB1);
    setVonSchiffen.add(schiffB2);

    // Ausgabe: nur 2 Schiffe -- A2 und B2 sind Duplikate von A1 und B1
    for (SchiffWithEqualsHashCode s : setVonSchiffen) {
      System.out.println(s);
    }
  }
}
