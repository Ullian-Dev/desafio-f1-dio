package com.dio.formula1.parada.pneus;

import com.dio.formula1.parada.Pneu;

public class Macio implements Pneu {

	public double calcularTempo(int distancia) {
		return distancia / 250;
	}
	
}