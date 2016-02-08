package com.utng.herencia;

public class Auto extends Vehiculo {//Clase Auto que hereda de vehiculo
	
	private boolean descapotable;//Atributo

	public void subir() {//Método
	}

	public void bajar() {
	}

	
	@Override
	public void caracteristicas() {//Se hereda de vehiculo
		// TODO Auto-generated method stub
		super.caracteristicas();
		System.out.println("El auto es familiar");
		
	}
}
