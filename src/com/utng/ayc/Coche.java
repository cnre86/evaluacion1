package com.utng.ayc;

public class Coche {

	
		private Motor m;// Asociación

		public Coche(Motor m) {
			this.m = m;
		}

		
		public void asignaConductor(Persona maneja) {// Metodos
			maneja = new Persona("");
		}

		
		public void enciende() {// Metodos

		}

		public void acelera() {

		}

		public void apaga() {

		}

		public void frena() {

		}

		public boolean estaEncendido() {
			return true;
		}
}
