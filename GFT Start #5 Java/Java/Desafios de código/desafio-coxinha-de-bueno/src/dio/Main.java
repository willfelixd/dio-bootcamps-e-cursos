package dio;
/*
Com base no número total de coxinhas consumidas e o número de participantes na competição, 
o dono do restaurante precisa que você desenvolva um programa para saber a quantidade média 
de coxinha que os participantes da competição conseguem devorar.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		String[] inputSplit = input.split(" ");
//TODO: Complete os espaços em branco com uma possível solução para o desafio
		double media = Double.parseDouble(inputSplit[0]) / Double.parseDouble(inputSplit[1]);

		System.out.printf("%.2f", media);

		scan.close();
	}
}