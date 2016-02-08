package com.utng.asociaciones1;

public class Calificacion {

	
		private int cal_ID;// Atributos
		private String cal_descripcion;
		
		// Asociacion
		private ProveerdorCalificado da = new ProveerdorCalificado(null);
}
