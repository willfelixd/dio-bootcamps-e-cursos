package dio;

/*Voc� deve escrever um programa que, dados o n�mero e o comprimento dos lados de um pol�gono regular, 
 * mostre seu per�metro.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		String[] split = N.split(" ");
//TODO: Complete os espa�os em branco com uma poss�vel solu��o para o desafio
		int P = Integer.parseInt(split[0]) * Integer.parseInt(split[1]);

		System.out.println(P);

		scan.close();
	}
}