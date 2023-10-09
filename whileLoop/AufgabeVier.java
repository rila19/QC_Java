package whileLoop;
/*
Aufgabe 4
Implementieren die Funktionen ggt, die den größten gemeinsamen Teiler von 2
ganzen Zahlen zurückgibt. Die Signatur der Funktion ist wie folgt:
public static int ggt(int n, int m);
Überprüfen Sie Ihre eigene Implementierung anhand von Aufrufen in einer main
Methode.
 */
public class AufgabeVier {
    public static int ggt(int n, int m){
    int i = 1;
    int teiler = 0;

        while(i <= n || i <= m){
           double a = n % i;
           double b = m % i;
            if(a == 0 && b == 0){
               teiler = i;
                //System.out.println("da :"+i);
            }
            i++;
        }
    return(teiler);
    }


    public static void main(String[] args) {
        System.out.println("Der größte Teiler ist: "+ggt(42, 15));
    }
}
