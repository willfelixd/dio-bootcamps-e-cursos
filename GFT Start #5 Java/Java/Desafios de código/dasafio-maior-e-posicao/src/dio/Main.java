package dio;

/*Você recebeu o desafio de ler 100 valores inteiros. 
 * Apresente então o maior valor lido e a posição dentre os 100 valores lidos.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior = 0, posicao = 0;
        
        for (int i = 1; i <= 100; i++) {
            
        	int numero = scan.nextInt();
            if (maior < numero) {
            	posicao = i;
                maior = numero;
            } 
        }
        
        System.out.print(maior + "\n" + posicao + "\n");
        
        scan.close();
    }
}