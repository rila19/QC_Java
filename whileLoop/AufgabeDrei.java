package whileLoop;
/*
Aufgabe 3
Implementieren Sie die Funktion primeNumbers, sodass alle Primzahlen bis n
(inklusiv) auf der Konsole ausgegeben werden. Die Signatur der Funktion ist wie
folgt:
public static void primeNumbers(int n);
Falls eine Schleife benötigt wird, dann verwenden Sie eine While Schleife.
Überprüfen Sie Ihre eigene Implementierung anhand von Aufrufen in einer main
Methode.
 */
public class AufgabeDrei {
    public static void primeNumbers(int n){
        int eingabeZahl = n;
        int zaehl1 = 2;

        while(zaehl1 <= eingabeZahl){
            int zaehl2 = 1;
            int wieOftModuloNull = 0; // darf nur 2 sein, wenn mehr, keine Primzahl

            while(zaehl2 <= zaehl1){
                if (zaehl1 % zaehl2 == 0){
                    wieOftModuloNull++;
                }
                if(zaehl2 == zaehl1 && wieOftModuloNull == 2){
                    System.out.println("Primzahl: "+zaehl1);
                }
                zaehl2++;
            }
        zaehl1++;
        }
    }

    public static void main(String[] args) {
      primeNumbers(20);
    }
}
