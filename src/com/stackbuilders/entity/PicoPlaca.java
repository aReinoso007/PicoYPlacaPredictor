package com.stackbuilders.entity;

import java.time.LocalDateTime;

public class PicoPlaca {
	
	private String numberPlate;
	private String fecha;
	private String hora;
	
	public PicoPlaca(String numberPlate, String fecha, String hora) {
		super();
		this.numberPlate = numberPlate;
		this.fecha = fecha;
		this.hora = hora;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}


	@Override
	public String toString() {
		return "Query [numberPlate=" + numberPlate + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	
	
	

}
