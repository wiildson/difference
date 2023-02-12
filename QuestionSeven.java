/*
 Crie um algoritmo que leia dois números e apresente a diferença entre eles.
 */

package QuestionSeven;

import java.util.Locale;
import java.util.Scanner;

public class QuestionSeven {

	public static int numero1;
	public static int numero2;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o 1º número: ");
		numero1 = sc.nextInt();
		System.out.print("Digite o 2º número: ");
		numero2 = sc.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("A diferença do 1 para o 2 número é: " + (numero1-numero2));
			System.out.println(numero1 +" - " + numero2 + " = " + (numero1-numero2));
		}
		else {
			System.out.println("A diferença do 2 para o 1 número é: " + (numero2-numero1));
			System.out.println(numero2 +" - " + numero1 + " = " + (numero2-numero1));
		}
		
	}

}