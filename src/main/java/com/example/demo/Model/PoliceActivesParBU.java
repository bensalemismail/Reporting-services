package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nombrepolicesbu")
public class PoliceActivesParBU {
	
	@Id
	@Column(name="idbu")
	private int idbu;
	@Column(name="bu")
	private String bu;
	@Column(name="policesactives")
	private int nombre;
	public int getIdbu() {
		return idbu;
	}
	public void setIdbu(int idbu) {
		this.idbu = idbu;
	}
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	
	

}
