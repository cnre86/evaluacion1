package com.utng.asociaciones1;

import java.awt.List;
import java.util.ArrayList;

public class Proveedor {
	
		private double pr_ID;// Atributos
		private String pr_RazonSocial;
		private String pr_contacto;
		private String pr_telefono1;
		private Short pr_telefono2;
		private Short pr_fax;
		private String pr_email1;
		private String pr_email2;
		private String pr_web;
		private int pr_CUIT;

		
		private List<Rubro> rubros;// Agregación
		private Direccion direccion;
		
		private Precios da = new Precios();// Asociacion
		private List<Articulo> necesita = new ArrayList<Articulo>();
		
		private Calificacion tiene = new Calificacion();// Asociacion

		public Proveedor(List<Rubro> rubros, Direccion direccion) {
			this.rubros = rubros;
			this.direccion = direccion;
			// TODO Auto-generated constructor stub
		}

}
