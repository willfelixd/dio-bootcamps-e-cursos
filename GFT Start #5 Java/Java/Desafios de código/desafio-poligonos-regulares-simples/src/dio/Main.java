package dio;

/*Você deve escrever um programa que, dados o número e o comprimento dos lados de um polígono regular, 
 * mostre seu perímetro.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		String[] split = N.split(" ");
//TODO: Complete os espaços em branco com uma possível solução para o desafio
		int P = Integer.parseInt(split[0]) * Integer.parseInt(split[1]);

		System.out.println(P);

		scan.close();
	}
}