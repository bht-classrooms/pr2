package de.bht.pr2.lession04.common;

import java.util.Objects;

/**
 * Gemeinsame Klasse fuer mehrere Beispiele dieser Lektion (Package common).
 *
 * Neue Konzepte in dieser Klasse:
 * - equals() und hashCode() sind aus lession03 bekannt. In dieser Lektion
 *   werden sie zur Voraussetzung: Nur mit ihnen funktionieren Person-Objekte
 *   richtig in einem HashSet (example05) und als Schluessel einer HashMap
 *   (example09b, example10).
 * - Vertrag zwischen equals() und hashCode(): Sind zwei Objekte laut equals()
 *   gleich, MUESSEN sie denselben hashCode() liefern. Deshalb verwenden beide
 *   Methoden dieselben Attribute (hier: name).
 * - Objects.equals(a, b) vergleicht null-sicher, Objects.hash(...) berechnet
 *   einen Hashwert aus einem oder mehreren Werten.
 * - Zwei verschiedene Objekte mit gleichem Namen gelten als gleich:
 *   new Person("Anna Alt").equals(new Person("Anna Alt")) liefert true.
 * - Achtung: setName() aendert den Hashwert. Liegt ein Person-Objekt schon
 *   als Schluessel in einer HashMap (oder in einem HashSet), darf man es
 *   nicht mehr so veraendern, sonst wird es dort nicht mehr gefunden.
 */
public class Person {

  //----------------------------
  // Attribute
  protected String name = "";

  //----------------------------
  // Konstruktor
  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person [" +
        "name='" + name +
        ']';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    // Nur Objekte genau derselben Klasse koennen gleich sein
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Person person = (Person) o;

    // null-sicherer Vergleich der Attribute
    return Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    // Dieselben Attribute wie in equals() verwenden!
    return Objects.hash(name);
  }
}
