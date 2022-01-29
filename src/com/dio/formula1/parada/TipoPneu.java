package com.dio.formula1.parada;

import com.dio.formula1.parada.pneus.Macio;
import com.dio.formula1.parada.pneus.Medio;
import com.dio.formula1.parada.pneus.Duro;

public enum TipoPneu {

	MACIO {
		@Override
		public Pneu obterPneu() {
			return new Macio();
		}
	},
	MEDIO {
		@Override
		public Pneu obterPneu() {
			return new Medio();
		}
	},
	DURO {
		@Override
		public Pneu obterPneu() {
			return new Duro();
		}
	};
	
		public abstract Pneu obterPneu();
}