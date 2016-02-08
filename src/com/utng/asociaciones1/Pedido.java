package com.utng.asociaciones1;

public class Pedido {
	
	
		private double pe_id;// Atributos
		private Date pe_fechaPedido;
		private Date pe_fechaNecesidad;
		private Date pe_fechaProgramada;
		private Date pe_fechaEntrega;
		private int pe_estado;
		
		private List<Articulo> contacts;// Agregación

		public Pedido(List<Articulo> contacts) {
			this.contacts = contacts;
			// TODO Auto-generated constructor stub
		}

}
