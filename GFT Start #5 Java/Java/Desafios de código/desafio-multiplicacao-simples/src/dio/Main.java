package dio;
/*
Voc� receber� dois valores inteiros. Fa�a a leitura e em seguida calcule o produto entre estes dois valores. 
Atribua esta opera��o � vari�vel PROD.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A, B, PROD;

		A = sc.nextInt();
		B = sc.nextInt();

		PROD = A * B; // implemente o c�digo que representa a multiplica��o.

		System.out.println("PROD = " + PROD);

		sc.close();

	}
}