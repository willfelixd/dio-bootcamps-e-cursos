package dio;

/*Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). 
 * A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO: Complete os espaços em branco com uma possível solução para o desafio
		double pi = 3.14159;
		double R = sc.nextDouble();
		double volume = (4 / 3.0) * pi * (Math.pow(R, 3.0));
		System.out.printf("VOLUME = %.3f%n", volume);

		sc.close();
	}

}