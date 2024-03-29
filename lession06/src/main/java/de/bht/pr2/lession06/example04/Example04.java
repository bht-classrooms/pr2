package de.bht.pr2.lession06.example04;

import java.io.*;

public class Example04 {

    // Bei Deserialisierung wird Konstruktor nicht aufgerufen

    private static Car deserialize(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);

            final Car auto1 = (Car) ois.readObject();
            ois.close();
            fis.close();
            return auto1;
        } catch (IOException | ClassNotFoundException e) { // HHH
            throw new RuntimeException(e);
        }
    }

    private static void serialize(Car car, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(car);
            oos.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        final Car car = new Car("Anna", "VW", "gelb", "Berlin", 10000);
        System.out.println(car.getNavi());

        serialize(car, "lession06/src/main/resources/Auto.ser");
        final Car deserializedAuto = deserialize("lession06/src/main/resources/Auto.ser");

        System.out.println(deserializedAuto.getNavi());
    }
}
