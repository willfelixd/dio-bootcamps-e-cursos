package dio;
/*
Dados o número total de espaços e figurinhas do álbum, e uma lista das figurinhas já compradas 
(que pode conter figurinhas repetidas), o seu desafio é determinar quantas figurinhas faltam para completar o álbum.*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numTotal = scan.nextInt();
		int numFigCompradas = scan.nextInt();
		Set<Integer> setFig = new HashSet<>();
//TODO: Complete os espaços em branco com uma solução possível para o problema
		for (int i = 1; i <= numFigCompradas; i++) {
			setFig.add(scan.nextInt());
		}
		System.out.println(numTotal - setFig.size());
		
		scan.close();
	}
}