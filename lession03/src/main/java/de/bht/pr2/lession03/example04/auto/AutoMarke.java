package de.bht.pr2.lession03.example04.auto;

/**
 * Aufzaehlungstyp (Enum) fuer Automarken.
 *
 * Konzepte in dieser Datei:
 * - Ein enum definiert eine feste Menge von Konstanten.
 * - Typsicherheit: Ein Attribut vom Typ AutoMarke kann nur diese Werte
 *   annehmen (anders als ein String, bei dem jeder Tippfehler erlaubt waere).
 * - Zugriff ueber den Typnamen, z.B. AutoMarke.AUDI.
 * - Konvention: Konstanten in GROSSBUCHSTABEN, Woerter mit Unterstrich getrennt.
 */
public enum AutoMarke {
  AUDI,
  BMW,
  MERCEDES_BENZ,
  PORSCHE,
  VOLKSWAGEN
}
