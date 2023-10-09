package whileLoop;
/*
Beschreiben was die folgende Funktion macht:
public static void func(int n) {
int m = n + 1;
while (true) {
if ((m % n) == 0) {
m ++;
continue;
}
m ++;
System.out.println("m = " + m);
}
}

--> Endlosschleife, welche die Zahlen ausgibt, die alle Ganzzahlen ausgibt die größer als n sind
--> Es werden Zahlen ausgegeben die durch n teilbar und nicht durch n teilbar sind / scheinbar im Wechsel
--> Beispiel n = 3:
m = 1715589 % 0
m = 1715591 % 2
m = 1715592 % 0
m = 1715594 % 2
m = 1715595 % 0
m = 1715597 % 2
 */
public class AufgabeEinsC {
    public static void func(int n) {
        int m = n + 1;
        while (true) {
            if ((m % n) == 0) {
                m ++;
                continue;
            }
            m ++;
            System.out.println("m = " + m);
        }
    }

    public static void main(String[] args) {
        func(3);
        /*
        4
        5 % 4 = Rest
        6 % 4 = Rest
        7 % 4 = Rest
        8 % 4 = 2
        12 % 4 = 3

         */
    }
}
