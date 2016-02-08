package com.utng.asociaciones2;

public class Orden {
	
	private int hora;// Atributos
	private String mesero;
	
	private Platillo platillo;// Asociaciones
	private Bebida bebida;
	private Pago pago = new Pago();
	private Cliente orden = new Cliente();

	public Orden(Platillo platillo, Bebida bebida) {
		this.platillo = platillo;
		this.bebida = bebida;
		// TODO Auto-generated constructor stub
	}

}
