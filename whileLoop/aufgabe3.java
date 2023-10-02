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
public class aufgabe3 {
    public static void primeNumbers(int n){
        int i=1;
        int s = 0;
        while(i <= n){
            if(n < 2 || s >= 2){
                System.out.println("keine Primzahl");
                break;
            } else if(n % i == 0){
                s++;
            }
            i++;
            if(i == n){
                System.out.println("Primzahl gefunden");
            }
        }
    }

    public static void main(String[] args) {
      primeNumbers(24);
    }
}
