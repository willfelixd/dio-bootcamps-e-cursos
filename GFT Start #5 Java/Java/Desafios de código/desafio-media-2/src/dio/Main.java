package dio;
/*Leia 3 valores, no caso, vari�veis A, B e C, que s�o as tr�s notas de um aluno. 
 * A seguir, calcule a m�dia do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double nota1 = input.nextDouble();
		double nota2 = input.nextDouble();
		double nota3 = input.nextDouble();
//TODO: Complete os espa�os em branco com uma poss�vel solu��o para o desafio
		double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
		System.out.printf("MEDIA = %.1f", media);

		input.close();
	}
}