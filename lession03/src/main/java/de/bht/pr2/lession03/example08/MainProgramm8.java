package de.bht.pr2.lession03.example08;

/**
 * Autoboxing und Unboxing - Methoden.
 *
 * Neue Konzepte in dieser Klasse:
 * - Autoboxing und Unboxing passieren auch bei Methodenaufrufen:
 *   - Parameter: Ein int-Argument wird beim Aufruf myMethod(a) automatisch
 *     in ein Integer-Objekt umgewandelt (Autoboxing).
 *   - Rueckgabe: Das zurueckgegebene Integer wird bei der Zuweisung an
 *     int b automatisch in einen int umgewandelt (Unboxing).
 * - Rechnen mit Wrapper-Objekten: Bei i += 100 macht Java Unboxing,
 *   addiert und macht wieder Autoboxing. Dabei entsteht ein NEUES
 *   Integer-Objekt, denn Wrapper-Objekte sind unveraenderlich (immutable).
 * - Die Variable a in main() bleibt deshalb 10, b ist 110.
 */
public class MainProgramm8 {

  // Autoboxing und unboxing - Methoden

  public static Integer myMethod(Integer i) { // Autoboxing
    i += 100; // Unboxing, Addition, Autoboxing --> neues Integer-Objekt
    return i;
  }

  public static void main(String[] args) {
    int a = 10;
    // Autoboxing beim Aufruf (a --> Integer), Unboxing bei der Zuweisung an b
    int b = myMethod(a); // Unboxing
  }
}
