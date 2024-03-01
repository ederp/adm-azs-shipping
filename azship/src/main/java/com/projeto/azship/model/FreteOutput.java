package com.projeto.azship.model;

import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FreteOutput extends FreteInput{

	@JsonProperty("id")
	private Integer freteOutputId;

	public FreteOutput() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FreteOutput(Integer id, String localOrigem, String localDestino, String tipoCarga, Double pesoCarga,
			Double cubagemCarga, LocalDate dataColeta, LocalDate dataEntrega, Double valorFrete, String statusFrete,
			String meioTransporte, String condicoesEspeciais) {
		super(id, localOrigem, localDestino, tipoCarga, pesoCarga, cubagemCarga, dataColeta, dataEntrega, valorFrete,
				statusFrete, meioTransporte, condicoesEspeciais);
		// TODO Auto-generated constructor stub
	}

	public FreteOutput(Integer freteOutputId) {
		super();
		this.freteOutputId = freteOutputId;
	}

	public Integer getFreteOutputId() {
		return freteOutputId;
	}

	public void setFreteOutputId(Integer freteOutputId) {
		this.freteOutputId = freteOutputId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(freteOutputId);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FreteOutput other = (FreteOutput) obj;
		return Objects.equals(freteOutputId, other.freteOutputId);
	}

	@Override
	public String toString() {
		return "FreteOutput [freteOutputId=" + freteOutputId + "]";
	}
	
}
