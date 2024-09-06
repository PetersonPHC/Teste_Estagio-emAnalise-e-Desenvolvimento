package view;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int contador = 0;
		
		System.out.print("Insira a String: ");
		String stringInformada = scanner.nextLine();
		String[] stringDividida = stringInformada.split("");
		
		for(String letra : stringDividida) {
			if(letra.toLowerCase().equals("a")) {
				contador++;
			}
		}
		
		scanner.close();
		
		if(contador == 0) {
			System.out.println("Não Existem Letras 'A' na String Informada");
		}else {
			System.out.println("Existe " + contador + " Letras 'A' na String informada");
		}

	}

}
