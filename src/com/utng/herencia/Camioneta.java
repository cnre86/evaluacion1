package com.utng.herencia;

public class Camioneta extends Vehiculo {//Clase Camioneta que hereda de Vehiculo
	
	private float tara;//Atributo
	private float carga;

	
	public Camioneta() {// Constructor
		}

	
	public void cargar(float kilos) {// M�todos de la clase Auto

	}

	
	@Override
	public void caracteristicas() {// M�todo que hereda de Vehiculo
		// TODO Auto-generated method stub
		super.caracteristicas();
		System.out.println("La camioneta es de carga");
		
	}

}
