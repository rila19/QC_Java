package QC_Java.String;

/*
Aufgabe 2
Implementieren Sie eine statische Methode revert, die ein als Parameter
übergebenes String Object umkehrt. Folgender Aufruf revert("test") z.B. sollte
folgendes ausgeben "tset".
● Verwenden Sie keine der folgenden Klassen bzw. Möglichkeiten:
○ StringBuilder
○ StringBuffer
○ String Library als Dependency
● Verwenden Sie die folgende Signatur für die Methode:
public static String revert(String str)
 */
public class Aufgabe2Revert {

    public static String revert(String str){
        String result ="";
        for(int i = str.length() -1 ; i >= 0; i-- ){
            result += str.charAt(i);
        }
        return(result);
    }


    public static void main(String[] args) {
        System.out.println(revert("super"));
    }
}
