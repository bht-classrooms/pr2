package de.bht.pr2.lession03.example06;

import java.util.ArrayList;
import java.util.List;

/**
 * Referenztyp angeben.
 *
 * Neue Konzepte in dieser Klasse:
 * - Auf der linken Seite (Variablentyp) muss der Typ-Parameter immer
 *   angegeben werden: {@code List<Integer>}. {@code List<>} ist ein
 *   Compile-Fehler.
 * - Auf der rechten Seite (nach new) darf man ihn wiederholen
 *   ({@code new ArrayList<Integer>()}) oder weglassen ({@code new ArrayList<>()}).
 * - Diamond-Operator {@code <>}: Der Compiler leitet den Typ aus der linken
 *   Seite ab. Das ist kuerzer und vermeidet Wiederholungen, darum "sogar besser".
 * - Ganz ohne spitze Klammern ({@code List liste = new ArrayList();}) entsteht
 *   ein sogenannter Raw Type: Der Compiler kann den Elementtyp nicht mehr
 *   pruefen. Das sollte man vermeiden.
 */
public class MainProgramm6 {

  // Referenztyp angeben

  public static void main(String[] args) {
    // TODO: Kommentar in der nächsten Zeile entfernen
    // List<> liste1 = new ArrayList<>(); // Nein, nein, nein!!

    List<Integer> liste2 = new ArrayList<Integer>(); // OK

    List<Integer> liste3 = new ArrayList<>(); // OK ... sogar besser
  }

}
