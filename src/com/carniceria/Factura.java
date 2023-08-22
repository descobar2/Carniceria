package com.carniceria;

import java.util.Date;

public class Factura implements CalculoFactura {
	private String serie;
	private String numero;
	private Date fecha;
	
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public void calcularTotal() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void calcularIva() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void agregar() {
		// TODO Auto-generated method stub
		
	}
}
