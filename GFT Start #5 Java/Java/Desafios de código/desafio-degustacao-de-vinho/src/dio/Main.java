package dio;

/*Dado o qual foi o tipo do vinho e as respostas fornecidas, 
 * determine o n�mero de participantes que receberam a resposta correta.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String T = scan.nextLine();
		String respostasCompetidores = scan.nextLine();

		String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");
//TODO: Complete o c�digo com uma poss�vel solu��o para o problema.    
		int count = 0;
		for (int i = 0; i < respostasCompetidoresSplit.length; i++) {
			if (respostasCompetidoresSplit[i].equals(T))
				count++;
		}

		System.out.println(count);
		
		scan.close();
	}
}