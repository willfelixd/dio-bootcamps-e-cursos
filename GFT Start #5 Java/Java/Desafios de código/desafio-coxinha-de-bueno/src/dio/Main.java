package dio;
/*
Com base no n�mero total de coxinhas consumidas e o n�mero de participantes na competi��o, 
o dono do restaurante precisa que voc� desenvolva um programa para saber a quantidade m�dia 
de coxinha que os participantes da competi��o conseguem devorar.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		String[] inputSplit = input.split(" ");
//TODO: Complete os espa�os em branco com uma poss�vel solu��o para o desafio
		double media = Double.parseDouble(inputSplit[0]) / Double.parseDouble(inputSplit[1]);

		System.out.printf("%.2f", media);

		scan.close();
	}
}