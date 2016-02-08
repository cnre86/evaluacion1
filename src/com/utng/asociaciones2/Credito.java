package com.utng.asociaciones2;

import java.util.Date;

public class Credito extends Pago {
	
	private int numeroTdeCredito;// Atributos
	private String tipo;
	private Date fechaDeExp;
	private String nombre;
	
	public boolean hacerCargo(double total){
		return false;
	}
}
