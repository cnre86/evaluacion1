package com.utng.asociaciones1;

import java.awt.List;

public class Articulos {

	
		private String art_ID;// Atributos de la clase
		private String art_Descripcion;
		private int art_estado;
		private int art_tipo;
		private int art_cantidad;
		private double art_cantidadCritica;
		private double art_cantidadMinima;

		
		private List<Rubro> rubros;// Agregación
		
		private Precios tiene = new Precios();// Asociacion

		public Articulo(List<Rubro> rubros) {
			this.rubros = rubros;
			// TODO Auto-generated constructor stub
		}

}
