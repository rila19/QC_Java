package QC_Java.String;

public class Aufgabe5Palindrom {
    /*
    Aufgabe 5
    Implementieren Sie eine statische Methode palindrom, die aus einem Text alle
    Palindrome auf der Konsole ausgibt. Folgender Aufruf
    palindrom("Der vor dir stehende Rentner heißt Otto Uwe") sollte z.B. folgendes
    auf der Konsole ausgeben:
    Rentner
    Otto
    Verwenden Sie die folgende Signatur für die Methode:
    public static void palindrom(String text)
     */
    public static  void printPolyndroms(String satz){
        //String satz = "na Rentner junge otto";
        satz = satz.toLowerCase();
        String[] satzarray = satz.split(" ");

        for(String ausgabe : satzarray){
            int i = 0;
            //System.out.println(ausgabe);
            for(int a = ausgabe.length(); a > 0; a--){
                if(ausgabe.charAt(a - 1) != ausgabe.charAt(i)){
                    //System.out.println("a: "+ausgabe.charAt(a - 1));
                    //System.out.println("b: "+ausgabe.charAt(i));
                    break;
                } else {
                    System.out.println(ausgabe);
                    i--;
                }
                i++;
            }
        }


    }

    public static void main(String[] args) {
        printPolyndroms("na Rentner junge otto");   //public static void palindrom(String text)
    }
}

