# **Aufgabenblatt 8: Regular Expressions******

## **Aufgabe**
Implementieren Sie einen Konsolen-Taschenrechner, der folgende Operatoren
unterstützt:
● Addition (+)
● Subtraktion (-)
● Multiplication (x)
● Division (/)
● Modulo (%)

### Das Programm soll die folgenden Muster (Formate) für die auszuwertenden
Eingaben unterstützen:**

● Binäre Operatoren (2 Operanden): Operand1 Operator Operand2
○ Bsp.: 12 x 12
● Unäre Operatoren (1 Operand): Operator Operand
○ Bsp.: + 23, - 43

### Der Taschenrechner soll nach dem Modell eines REPL (Read Eval Print Loop) mit  den folgenden Schritten bzw. Zuständen implementiert werden:
1. Read: Interaktive Eingabe des Anwenders übernehmen
2. Eval: Eingabe auswerten
3. Print: Ergebnis ausgeben
4. Loop: Reset und Übergang zum Zustand Read
   Beschreibung der Zuständen
1. Read
   In diesem Zustand soll der Taschenrechner eine Interaktionsmöglichkeit dem
   Anwender geben, sodass dieser seine Eingabe eintippen kann.
2. Eval
   In diesem Zustand wird die Eingabe des Anwenders ausgewertet.
3. Print
   In diesem Zustand wird das Ergebnis der Auswertung ausgegeben.
4. Loop
   In diesem Zustand wird ein Reset und einen Übergang zum Zustand Read
   eingeleitet.
5. Das Programm soll mit der Eingabe: :q beendet werden.

#### Hinweise:
● Verwenden Regular Expression um die folgenden Teile einer Eingabe zu
erkennen:
○ Operatoren
○ Operanden
● Konzipieren Sie Ihr Programm als Pseudo Code