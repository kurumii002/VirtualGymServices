package com.gosh.vigym.dto;

import javax.validation.constraints.Min;

public class EstudiantePerfilDto {
	
	@Min(0)
	private Integer saldo;
	
	@Min(50)
	private Integer estatura;
	
	@Min(10)
	private Double peso;
	
	@Min(0)
	private Double imc;
	
	public EstudiantePerfilDto() {
		super();
	}
	public EstudiantePerfilDto(@Min(0) Integer saldo, @Min(50) Integer estatura, @Min(10) Double peso, @Min(0) Double imc) {
		super();
		this.saldo = saldo;
		this.estatura = estatura;
		this.peso = peso;
		this.imc = imc;
	}
	
	public Integer getSaldo() {
		return saldo;
	}
	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
	public Integer getEstatura() {
		return estatura;
	}
	public void setEstatura(Integer estatura) {
		this.estatura = estatura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getImc() {
		return imc;
	}
	public void setImc(Double imc) {
		this.imc = imc;
	}

}
