import java.util.Queue;
import java.util.Stack;

import utils.QueuePalindrome;
import utils.SignValidator;
import utils.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dayanna Chacha");
        //runSingValidator();
        //runStackSorter();
        runQueuePalindrome();
    }

    // SignValidator
    /*private static void runSingValidator() {
        System.out.println("\nEjercicio 01: Validación de Signos");
        SignValidator signValidator = new SignValidator();
        String cadena1 = "{[()]}"; // VALIDO
        String cadena2 = "{[(])}"; // NO VALIDO

        System.out.println("Cadena: " + cadena1 + " es valida? " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es valida? " + signValidator.isValid(cadena2));
    }*/

    // StackSorter
    /*private static void runStackSorter(){
        System.out.println("\nEjercicio 02: Ordenar un Stack");
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Stack Original: ");
        System.out.println(stack);

        StackSorter sorter = new StackSorter();
        sorter.sort(stack);

        System.out.println("Stack Ordenado");
        System.out.println(stack);
    }*/

    // QueuePalindrome
    private static void runQueuePalindrome(){
        System.out.println("\nEjercicio 03: Palíndromo usando Colas");
        QueuePalindrome palindrome = new QueuePalindrome();
        System.out.println("\"ana\" es palíndromo?: " + palindrome.isPalindrome("ana"));
        System.out.println("\"radar\" es palíndromo?: " + palindrome.isPalindrome("radar"));
        System.out.println("\"java\" es palíndromo?: " + palindrome.isPalindrome("java"));
    }
}
