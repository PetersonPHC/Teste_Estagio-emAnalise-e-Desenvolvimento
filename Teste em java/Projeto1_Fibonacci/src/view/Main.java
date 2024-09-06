package view;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (pertenceAFibonacci(numero)) {
            System.out.println("O número inserido PERTENCE à sequência de Fibonacci.");
        } else {
            System.out.println("O número inserido NÃO PERTENCE à sequência de Fibonacci.");
        }

        scanner.close();
    }
	
	public static boolean pertenceAFibonacci(int numero) {
        int numero1 = 0;
        int numero2 = 1;

        if (numero == numero1 || numero == numero2) {
            return true;
        }
        
        int proximo = numero1 + numero2;
        while (proximo <= numero) {
            if (proximo == numero) {
                return true;
            }
            
            numero1 = numero2;
            numero2 = proximo;
            proximo = numero1 + numero2;
        }

        return false;
    }

}
