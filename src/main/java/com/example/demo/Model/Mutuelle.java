package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dimmutuelle")
public class Mutuelle {
	
	@Id
	@Column(name="idbu")
	private int IdBU;
	@Column(name="idmutuelle")
	private int IDMutuelle;
	@Column(name="mutuelle")
	private String Mutuelle;
	@Column(name="codebu")
	private String codeBU;
	@Column(name="bu")
	private String BU;
	
	public int getIdBU() {
		return IdBU;
	}
	public void setIdBU(int idBU) {
		IdBU = idBU;
	}
	public int getIDMutuelle() {
		return IDMutuelle;
	}
	public void setIDMutuelle(int iDMutuelle) {
		IDMutuelle = iDMutuelle;
	}
	public String getMutuelle() {
		return Mutuelle;
	}
	public void setMutuelle(String mutuelle) {
		Mutuelle = mutuelle;
	}
	public String getCodeBU() {
		return codeBU;
	}
	public void setCodeBU(String codeBU) {
		this.codeBU = codeBU;
	}
	public String getBU() {
		return BU;
	}
	public void setBU(String bU) {
		BU = bU;
	}
	
	
	

}
