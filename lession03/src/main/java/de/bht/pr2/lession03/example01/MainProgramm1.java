package de.bht.pr2.lession03.example01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ArrayList erzeugen.
 *
 * Neue Konzepte in dieser Klasse:
 * - Eine ArrayList ist eine Liste mit dynamischer Groesse: Anders als ein
 *   Array waechst sie automatisch, wenn man Elemente hinzufuegt.
 * - Generics: In spitzen Klammern steht der Typ der Elemente, z.B.
 *   {@code List<Integer>}. Der Compiler prueft dann, dass nur Integer-Objekte
 *   in die Liste kommen.
 * - Interface als Variablentyp (List), konkrete Klasse beim Erzeugen
 *   (ArrayList) -- mehr dazu in example10.
 * - Drei Arten, eine Liste zu erzeugen:
 *   1. Leer: {@code new ArrayList<Integer>()}
 *   2. Aus einer anderen Collection (Kopier-Konstruktor):
 *      {@code new ArrayList<Integer>(liste1)} -- eine neue, eigenstaendige Liste
 *      mit denselben Elementen.
 *   3. Aus einem Array: Arrays.asList(array)
 * - Achtung bei Arrays.asList(): Die Liste hat eine feste Groesse, weil sie
 *   direkt auf dem Array arbeitet. add() und remove() werfen eine
 *   UnsupportedOperationException (Runtime-Error), set() ist erlaubt.
 *   Fuer eine veraenderbare Liste: {@code new ArrayList<>(Arrays.asList(array))}
 */
public class MainProgramm1 {

  // ArrayList erzeugen

  public static void main(String[] args) {
    //----------------------------
    // Eingabe: nichts
    List<Integer> liste1 = new ArrayList<Integer>();

    //----------------------------
    // Eingabe: eine Collection
    liste1.add(10);
    liste1.add(20);
    liste1.add(30);
    // Neue Liste mit denselben Elementen wie liste1
    List<Integer> liste2 = new ArrayList<Integer>(liste1);

    //----------------------------
    // Mit einem Array
    Integer[] array = {1, 2, 3, 4, 5};
    List<Integer> liste3 = Arrays.asList(array);
    // Achtung:
    // liste3 hat eine feste Groesse!
    liste3.add(6); // Fehler - Runtime-Error! (UnsupportedOperationException)
  }
}
