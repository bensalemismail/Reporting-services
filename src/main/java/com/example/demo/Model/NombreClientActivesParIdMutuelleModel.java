package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nombreclientactivesparidmutuelleview")
public class NombreClientActivesParIdMutuelleModel {
	
	
	@Id
	@Column(name="idmutuelle")
	private int idbu;
	@Column(name="mutuelle")
	private String bu;
	@Column(name="nombreclientactives")
	private int nombrePolice;
	
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
	public int getNombrePolice() {
		return nombrePolice;
	}
	public void setNombrePolice(int nombrePolice) {
		this.nombrePolice = nombrePolice;
	}
	
	
	

}
