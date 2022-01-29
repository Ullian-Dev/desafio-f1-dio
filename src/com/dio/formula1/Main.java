package com.dio.formula1;
import java.util.Scanner;

import com.dio.formula1.parada.Pneu;
import com.dio.formula1.parada.TipoPneu;

public class Main {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Informe a distância em metros: ");
			int distancia = entrada.nextInt();
			System.out.println("Qual o tipo de Pneu:");
			System.out.println("(1) Macio, (2) Médio, (3) Duro");
			int opcaoPneu = entrada.nextInt();
			TipoPneu tipoPneu = TipoPneu.values()[opcaoPneu - 1];
			
			Pneu pneu = tipoPneu.obterPneu();
			double tempo = pneu.calcularTempo(distancia);
			System.out.println("O tempo total é de: ");
			System.out.printf("%.1f",tempo);
		}
	}
	
}