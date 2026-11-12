package de.bht.pr2.lab01;

import java.sql.SQLOutput;

public class Student {

    //-------------------------------------------
    // Attribute
    private String name = "";

    // Matrikelnummer
    private int registrationNumber = 0;

    // Medieninformatik, Technische Informatik, Druck- und Medientechnik und Screen Based Media
    private String courseOfStudies = "";

    // Rückmeldegebühr
    public static final int TUITION_FEE = 312;

    int semesterbeitrag;

    /**
     * This contructor parses a comma-separated row describing a student object.
     *
     * @param dataRow a comma-separated row describing a student object
     */
    // Z.B.:"Anna Alt,70001,Medieninformatik,312"
    public Student(String dataRow) throws StudentParseException, NotPaidTuitionFeeException,
            RegistrationNumberException, WrongCourseOfStudiesException, NumberFormatException {
        // TODO: Here goes your code ...

        String[] daten;
        daten = dataRow.split(",");
        if (daten.length == 4) {
            this.name = daten[0];
            this.courseOfStudies = daten[2];
            this.semesterbeitrag = Integer.parseInt(daten[3]);


            /*

            die folgende if bediningung () habe ich mit chatGPT gemacht :)
            die matches Mehode gibt ein boolean wert
            true wenn die Rex. stimmt
            \d  ==> eine Ziffer von 0 bis 9
            +   ==> mindestens einmal, beliebig oft

            erste \ verwendet Java als Sonderzeichen in Strings

            */
            if (!daten[3].matches("\\d+")) {
                NumberFormatException nfE = new NumberFormatException("NumberFormatException:\n" +
                        "ungültige Martikelnummer, Die Format stimmt nicht");
            }else {
                this.registrationNumber = Integer.parseInt(daten[1]);
            }


            /*

            die folgende if bediningung habe ich mit chatGPT gemacht :)
            die matches Mehode gibt ein boolean wert
            true wenn die Rex. stimmt
            \d  ==> eine Ziffer von 0 bis 9
            +   ==> mindestens einmal, beliebig oft

            erste \ verwendet Java als Sonderzeichen in Strings

            */
            if (!daten[3].matches("\\d+")) {
                NumberFormatException nfE = new NumberFormatException("NumberFormatException:\n" +
                        "ungültige Semesterbeitrag, Die Format stimmt nicht");
            }

            if (Integer.parseInt(daten[3]) != 312) {
                throw new NotPaidTuitionFeeException(
                        "Semesterbeitrag wurde nicht vollständig bezahlt."
                );
            }


            if (this.courseOfStudies == "Medieninformatik" ||
                    this.courseOfStudies == "Technische Informatik" ||
                    this.courseOfStudies == "Druck- und Medientechnik" ||
                    this.courseOfStudies == "Screen Based Media") {
                WrongCourseOfStudiesException wcE = new WrongCourseOfStudiesException("WrongCourseOfStudiesException\n" +
                        "Diese Studiengang gehört nicht zu der Liste der bekannten Studiengängen aus FB VI");
                throw wcE;
            }

        } else if (daten.length > 3) {
            StudentParseException spE = new StudentParseException("StudentParseException:\n" +
                    "Daten-Zeile kann nicht verarbeitet werden,\n" +
                    "Es sind zuviele daten eingegeben worden.\n" +
                    "Format:<Name Nachname>,<Martikelnummer>,<Studiengang>,<Beitrag>");
            throw spE;
        } else {
            StudentParseException spE = new StudentParseException("StudentParseException:\n" +
                    "Daten-Zeile kann nicht verarbeitet werden,\n" +
                    "Es sind zuwenig daten eingegeben worden.\n" +
                    "Format:<Name Nachname>,<Martikelnummer>,<Studiengang>,<Beitrag>");
            throw spE;
        }


    }

    @Override
    public String toString() {

        return "Student{" +
                "name='" + name + '\'' +
                ", registrationNumber = " + registrationNumber + "\n" +
                ", courseOfStudies = '" + courseOfStudies + "' \n" +
                "Semesterbeitrag = " + semesterbeitrag + "\n" +
                '}';
    }
}
