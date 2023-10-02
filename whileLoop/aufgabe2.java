package whileLoop;
/*
* Ergänzen Sie folgende Funktion, so dass die Summe der im Array arr enthaltenen
* Zahlen berechnet wird. Verwenden Sie dafür eine While Schleife.
* public static double array_summe(double[] arr) {
* TODO: Summe implementieren
* }
* Überprüfen Sie Ihre eigene Implementierung anhand von Aufrufen in einer main
* Methode.
 */
public class aufgabe2 {

    public static double array_summe(double[] arr) {
        //Array Deklaration: int[] a = new a[5];
        // hier wird deklariert und initialisiert
        //double[] a = {1, 2, 3, 4, 5};
        int i = 0;
        double i1 = 0.0;
        while(i < arr.length){
            i1 += arr[i];
            i++;
        }
    return i1;}

    public static void main(String[] args) {
        double[] a ={1.2, 1.3, 1.4, 1.5, 1.6};
        System.out.println(array_summe(a));
    }
}
