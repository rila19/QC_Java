package whileLoop;
/*
Aufgabe 1
        B) Schreiben folgendes Snippet anhand einer While Schleife um:
        for (int i = 0; i < 10; i++) {
        if ((i%2) == 0) {
        System.out.println(i + " ist eine gerade Zahl")
        } else {
        System.out.println(i + " ist eine ungerade Zahl");
        }
    }
*/
public class AufgabeEins {

    public static void geradeZahl(){
        int i = 0;
        while(i < 10){
            if ((i%2) == 0) {
                System.out.println(i + " ist eine gerade Zahl");
            } else {
                System.out.println(i + " ist eine ungerade Zahl");
            }
            i++;
        }
    }

    public static void main(String[] args) {
        geradeZahl();
    }

}
