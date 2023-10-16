package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Pattern plusOppattern = Pattern.compile("\\s*(\\d+)\\s*\\+\\s*(\\d+)|\\s*\\+\\s*(\\d+)|\\s*(\\d+)");
        Pattern Minuspattern = Pattern.compile("\\s*(\\d+)\\s*\\-\\s*(\\d+)|\\s*\\-\\s*(\\d+)|\\s*(\\d+)");
        Pattern Divpattern = Pattern.compile("\\s*(\\d+)\\s*\\/\\s*(\\d+)|\\s*\\/\\s*(\\d+)|\\s*(\\d+)");
        Pattern Multipattern = Pattern.compile("\\s*(\\d+)\\s*\\*\\s*(\\d+)|\\s*\\*\\s*(\\d+)|\\s*(\\d+)");
        Pattern Modulopattern = Pattern.compile("\\s*(\\d+)\\s*\\%\\s*(\\d+)|\\s*\\%\\s*(\\d+)|\\s*(\\d+)");
        Pattern quitPattern = Pattern.compile("^\\s*:q\\s*$");

        boolean calculatorStopped = false;
        while(!calculatorStopped) {
            System.out.print("Gib eine Rechenoperation ein: ");
            String input = scanner.nextLine(); // liest ganze Zeile bis zum "Enter"
            Matcher plusOpMatcher = plusOppattern.matcher(input);
            Matcher MinusMatcher = Minuspattern.matcher(input);
            Matcher DivMatcher = Divpattern.matcher(input);
            Matcher MultiMatcher = Multipattern.matcher(input);
            Matcher ModuloMatcher = Modulopattern.matcher(input);
            Matcher quit =  quitPattern.matcher(input);

            if (plusOpMatcher.matches()) {
                System.out.println("Plus");
                if (plusOpMatcher.group(4) != null) {
                    double result = Double.parseDouble(plusOpMatcher.group(4));
                    System.out.println(input + " = " + result);
                } else if (plusOpMatcher.group(3) != null) {
                    double result = Double.parseDouble(plusOpMatcher.group(3));
                    System.out.println(input + " = " + result);

                } else {
                    double ersterOperand = Double.parseDouble(plusOpMatcher.group(1));
                    double zweiterOperant = Double.parseDouble(plusOpMatcher.group(2));
                    double result = ersterOperand + zweiterOperant;
                    System.out.println(result);
                }
            } else if (MinusMatcher.matches()) {
                System.out.println("Minus");
                if (MinusMatcher.group(4) != null) {
                    double result = Double.parseDouble(MinusMatcher.group(4));
                    System.out.println(input + " = " + result);
                } else if (MinusMatcher.group(3) != null) {
                    double result = Double.parseDouble(MinusMatcher.group(3));
                    System.out.println(input + " = " + result);

                } else {
                    double ersterOperand = Double.parseDouble(MinusMatcher.group(1));
                    double zweiterOperant = Double.parseDouble(MinusMatcher.group(2));
                    double result = ersterOperand - zweiterOperant;
                    System.out.println(result);
                }
            } else if (DivMatcher.matches()) {
                System.out.println("Div");
                if (DivMatcher.group(4) != null) {
                    double result = Double.parseDouble(DivMatcher.group(4));
                    System.out.println(input + " = " + result);
                } else if (DivMatcher.group(3) != null) {
                    double result = Double.parseDouble(DivMatcher.group(3));
                    System.out.println(input + " = " + result);

                } else {
                    double ersterOperand = Double.parseDouble(DivMatcher.group(1));
                    double zweiterOperant = Double.parseDouble(DivMatcher.group(2));
                    double result = ersterOperand / zweiterOperant;
                    System.out.println(result);
                }
            } else if (MultiMatcher.matches()) {
                System.out.println("Multi");
                if (MultiMatcher.group(4) != null) {
                    double result = Double.parseDouble(MultiMatcher.group(4));
                    System.out.println(input + " = " + result);
                } else if (MultiMatcher.group(3) != null) {
                    double result = Double.parseDouble(MultiMatcher.group(3));
                    System.out.println(input + " = " + result);

                } else {
                    double ersterOperand = Double.parseDouble(MultiMatcher.group(1));
                    double zweiterOperant = Double.parseDouble(MultiMatcher.group(2));
                    double result = ersterOperand * zweiterOperant;
                    System.out.println(result);
                }
            }else if (ModuloMatcher.matches()) {
                System.out.println("Mod");
                if (ModuloMatcher.group(4) != null) {
                    double result = Double.parseDouble(ModuloMatcher.group(4));
                    System.out.println(input + " = " + result);
                } else if (ModuloMatcher.group(3) != null) {
                    double result = Double.parseDouble(ModuloMatcher.group(3));
                    System.out.println(input + " = " + result);

                } else {
                    double ersterOperand = Double.parseDouble(ModuloMatcher.group(1));
                    double zweiterOperant = Double.parseDouble(ModuloMatcher.group(2));
                    double result = ersterOperand % zweiterOperant;
                    System.out.println(result);
                }
            } else if(quit.matches()){
                    System.out.println("Taschenrechner wird gestoppt");
                    calculatorStopped = true;
            }
            else {
                System.out.println("das haut nicht hin");
            }
        }
    }
}
