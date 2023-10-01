package QC_Java.String;
public class Aufgabe4Anagram {
    /*
    Aufgabe 4
    Ein Anagramm ist ein Satz, der durch Umstellen aller Buchstaben eines anderen
    Satzes gebildet werden kann. Gross- und Kleinschreibung wird dabei ignoriert.
    Ebenso spielen Leerzeichen keine Rolle. Aus dem Wort "Desperation" läßt sich zum
    Beispiel der Satz "A Rope Ends It" bilden.
    Implementieren eine statische Methode isAnagram, mit der zwei Zeichenketten
    daraufhin überprüft werden können, ob sie ein Anagram bilden.
    Verwenden Sie die folgende Signatur für die Methode:
    public static boolean isAnagram(String str)
     */
    public static boolean isAnagram(){
        int c, p = 0;
        boolean x = true;
        int vergleich1;
        int vergleich2;
        char v;

        String a = "Desperation";
        a = a.replaceAll(" +","");
        a = a.toLowerCase();
        String b = "A Rope Ends It";
        b = b.replaceAll(" +","");
        b = b.toLowerCase();

        if(a.length() == b.length() ){
            for (c = a.length(); c >= 1; c--) {
                v = a.charAt(c - 1); // l
                vergleich1 = 0;
                vergleich2 = 0;
                for (p = a.length(); p >= 1; p--) {
                    if (a.charAt(p - 1) == v) {
                        vergleich1++;
                    }
                }
                for (p = b.length(); p >= 1; p--) {
                    if (b.charAt(p - 1) == v) {
                        vergleich2++;
                    }
                }
                /*
                System.out.println("----------");
                System.out.println("in " + a + " tritt " + v + " " + vergleich1 + " x auf.");
                System.out.println("in " + b + " tritt " + v + " " + vergleich2 + " x auf.");
                System.out.println("----------");
                System.out.println("Buchstabe "+v+" Vergleich 1: "+vergleich1+ " Vergleich 2: "+vergleich2);
                */
                if(vergleich1 != vergleich2){
                    //System.out.println("ABBRUCH unterschiedliche Anzahl der selben Buchstaben !");
                    x = false;
                    break;
                } else {x = true;}
            }
        } else {
            // Wenn Buchstabenanzahl nicht gleich
            // System.out.println("Das Wort ist kein Anagramm!");
            x = false;
        }
        return(x);
    }

    public static void main(String[] args) {
        isAnagram();
        if (isAnagram()) {
            System.out.println("Du hast ein Anagramm gefunden - Gut gemacht!");
        } else {
            System.out.println("Das ist kein Anagramm !");
        }
    }
}
