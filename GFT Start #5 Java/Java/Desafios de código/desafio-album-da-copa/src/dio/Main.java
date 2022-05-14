package dio;
/*
Dados o n�mero total de espa�os e figurinhas do �lbum, e uma lista das figurinhas j� compradas 
(que pode conter figurinhas repetidas), o seu desafio � determinar quantas figurinhas faltam para completar o �lbum.*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numTotal = scan.nextInt();
		int numFigCompradas = scan.nextInt();
		Set<Integer> setFig = new HashSet<>();
//TODO: Complete os espa�os em branco com uma solu��o poss�vel para o problema
		for (int i = 1; i <= numFigCompradas; i++) {
			setFig.add(scan.nextInt());
		}
		System.out.println(numTotal - setFig.size());
		
		scan.close();
	}
}