package com.utng.asociaciones1;

import java.awt.List;
import java.sql.Date;

public class ProveedorCalificado {
	
		private Date fechaCalificacion;// Atributos
		private int cal_ID;
		private int pr_ID;
		
		private List<Calificacion> calificacions;// Agregación

		public ProveerdorCalificado(List<Calificacion> calificacions) {
			// TODO Auto-generated constructor stub
			this.calificacions = calificacions;

		}

}
