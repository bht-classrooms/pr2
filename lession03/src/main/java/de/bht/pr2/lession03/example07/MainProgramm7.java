package de.bht.pr2.lession03.example07;

/**
 * Autoboxing und Unboxing - Zuweisungen.
 *
 * Neue Konzepte in dieser Klasse:
 * - Zu jedem der 8 primitiven Typen gibt es eine Wrapper-Klasse:
 *   byte/Byte, short/Short, int/Integer, long/Long, float/Float,
 *   double/Double, boolean/Boolean, char/Character.
 *   Achtung: Integer und Character heissen anders als ihr primitiver Typ.
 * - Autoboxing: Java wandelt einen primitiven Wert automatisch in ein Objekt
 *   der passenden Wrapper-Klasse um (primitiv zu Objekt).
 * - Unboxing: Java wandelt ein Wrapper-Objekt automatisch in den primitiven
 *   Wert um (Objekt zu primitiv).
 * - Ein int-Literal wie 4 wird nicht automatisch zu Long, Float oder Double
 *   (Autoboxing erweitert den Typ nicht). Darum braucht man die Suffixe
 *   L (long), F (float) und D (double).
 * - Achtung: Unboxing von null fuehrt zu einer NullPointerException,
 *   z.B. {@code Integer x = null; int y = x;}
 */
public class MainProgramm7 {

  // Autoboxing und Unboxing - Zuweisungen

  public static void main(String[] args) {
    // Autoboxing: primitiver Wert --> Wrapper-Objekt
    Byte byteObjekt = (byte) 1;
    Short shortObjekt = (short) 2;
    Integer integerObjekt = 3;
    Long longObjekt = 4L; // Ohne L: Compile-Fehler (int wird nicht zu Long)
    Float floatObjekt = 5F;
    Double doubleObjekt = 6D;
    Boolean booleanObjekt = true;
    Character characterObjekt = 'a';

    // Unboxing: Wrapper-Objekt --> primitiver Wert
    byte b = byteObjekt;
    short s = shortObjekt;
    int i = integerObjekt;
    long l = longObjekt;
    float f = floatObjekt;
    double d = doubleObjekt;
    boolean bool = booleanObjekt;
    char c = characterObjekt;
  }
}
