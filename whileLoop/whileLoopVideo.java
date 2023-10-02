package whileLoop;

public class whileLoopVideo {
    public static long fakultaet(int n) {
        long result = 1;
        int a = 1;
        while (a <= n) {
            result *= a;
            a++;
        }
    return result;
    }
    public static void main (String[]args){
    /*
    Iterationen können übersprungen werden mit: continue;
    Iterationen können abgebrochen werden mit: break;

    while-schleifen haben keine Initialisierung von Variablen im Schleifenkopf!
    Empfehlung: Wenn eine Schleife durch eine Zählvariable bestimmt wird, besser for-Schleife nehmen

    while (eine Anweisung){
    }
    Ausgabe Quadratzahlen von allen Zahlen von 0 - n
    Pseudocode: Beschreibung von dem, was man programmieren möchte
    while(a >= n){
    Ausgabe a*a
    }
    * n = 3
    * a = 0
    * in Klammern stehend nennt man "Abbruchanweisung"
    * while (0 <= 3) 1. Iteration
    * -> 0 true
    * ! Endlosschleife -> a muss inkrementiert werden
    * am Ende a = 1 (a++)
    * while (1 <= 3) 2. Iteration
    * -> true
    * a = 2
    * while (2 <= 3) 3. Iteration
    + -> true
    * a = 3
    * while (3 <= 3) 4. Iteration
    * -> true
    * a = 4
    * white (4 <= 3) 5. Iteration
    * -> false // Abbruch
     */
        int n = 9;
        System.out.println(n + "! = " + fakultaet(n));
    }
}
