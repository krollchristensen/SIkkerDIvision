import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Indtast dividend (eller skriv 'exit' for at afslutte): ");
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                break; // Afslutter løkken og programmet
            }
            int dividend = Integer.parseInt(input);

            System.out.print("Indtast divisor: ");
            int divisor = scanner.nextInt();
            scanner.nextLine(); // Ryd bufferen efter at læse et heltal

            try {
                int result = dividend / divisor;
                System.out.println("Resultat: " + dividend + " / " + divisor + " = " + result);
            } catch (ArithmeticException e) {
                System.err.println("Fejl: Kan ikke dividere med nul. Prøv igen.");
                // Programmet fortsætter herfra, beder om nye input
            }
        }
        System.out.println("Programmet er afsluttet.");
        scanner.close();
    }
}
