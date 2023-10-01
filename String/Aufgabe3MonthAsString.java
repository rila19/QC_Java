package QC_Java.String;

import java.text.DateFormatSymbols;

public class Aufgabe3MonthAsString {
/*
Aufgabe 3 - Sprint 9 Java String
Implementieren Sie eine statische Methode monthAsString. Dieser Methode soll
ein String object im Format "dd.mm.yyyy" übergeben werden können.
Anschließend soll die Methode den Monat als String ausgeschrieben(deutsche
Sprache) zurückgeben.
Der Aufruf monthAsString("06.09.2098") sollte z.B. "September" als Ergebnis
zurückgeben.
 */

    public static String monthAsString(String datum) {
        // 05.08.2023 - DD.MM.YYYY
        //String europeanDatePattern = "m";
        //DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        //String strG = europeanDateFormatter.format(LocalDate.of(2016, 7, 31));
        String monatZahl = "dd";
        for(int i = 0; i < 5; i++){
            if (i == 3){
                monatZahl = String.valueOf(datum.charAt(i));
                //System.out.println(monatZahl);
            }
            if (i == 4) {
                monatZahl = String.valueOf(datum.charAt(i));
                //System.out.println(monatZahl);
            }
        }
        DateFormatSymbols a = new DateFormatSymbols();
        int cool = Integer.parseInt(monatZahl);
        String[] b = a.getMonths();
        String c = b[cool-1];
        return(c);
    }

    public static void main(String[] args) {
        System.out.println( monthAsString("03.07.2023"));
    }
}

