package com.projeto.azship.model;

import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;


public class FreteInput {

	@JsonProperty("localOrigem")
	private String localOrigem;

	@JsonProperty("localDestino")
	private String localDestino;

	@JsonProperty("tipoCarga")
	private String tipoCarga;

	@JsonProperty("pesoCarga")
	private Double pesoCarga;

	@JsonProperty("cubagemCarga")
	private Double cubagemCarga;

	@JsonProperty("dataColeta")
	private LocalDate dataColeta;

	@JsonProperty("dataEntrega")
	private LocalDate dataEntrega;

	@JsonProperty("valorFrete")
	private Double valorFrete;

	@JsonProperty("statusFrete")
	private String statusFrete;

	@JsonProperty("meioTransporte")
	private String meioTransporte;
	
	@JsonProperty("condicoesEspeciais")
	private String condicoesEspeciais;

	public FreteInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FreteInput(String localOrigem, String localDestino, String tipoCarga, Double pesoCarga, Double cubagemCarga,
			LocalDate dataColeta, LocalDate dataEntrega, Double valorFrete, String statusFrete, String meioTransporte,
			String condicoesEspeciais) {
		super();
		this.localOrigem = localOrigem;
		this.localDestino = localDestino;
		this.tipoCarga = tipoCarga;
		this.pesoCarga = pesoCarga;
		this.cubagemCarga = cubagemCarga;
		this.dataColeta = dataColeta;
		this.dataEntrega = dataEntrega;
		this.valorFrete = valorFrete;
		this.statusFrete = statusFrete;
		this.meioTransporte = meioTransporte;
		this.condicoesEspeciais = condicoesEspeciais;
	}
	
	public String getLocalOrigem() {
		return localOrigem;
	}

	public void setLocalOrigem(String localOrigem) {
		this.localOrigem = localOrigem;
	}

	public String getLocalDestino() {
		return localDestino;
	}

	public void setLocalDestino(String localDestino) {
		this.localDestino = localDestino;
	}

	public String getTipoCarga() {
		return tipoCarga;
	}

	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}

	public Double getPesoCarga() {
		return pesoCarga;
	}

	public void setPesoCarga(Double pesoCarga) {
		this.pesoCarga = pesoCarga;
	}

	public Double getCubagemCarga() {
		return cubagemCarga;
	}

	public void setCubagemCarga(Double cubagemCarga) {
		this.cubagemCarga = cubagemCarga;
	}

	public LocalDate getDataColeta() {
		return dataColeta;
	}

	public void setDataColeta(LocalDate dataColeta) {
		this.dataColeta = dataColeta;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public String getStatusFrete() {
		return statusFrete;
	}

	public void setStatusFrete(String statusFrete) {
		this.statusFrete = statusFrete;
	}

	public String getMeioTransporte() {
		return meioTransporte;
	}

	public void setMeioTransporte(String meioTransporte) {
		this.meioTransporte = meioTransporte;
	}

	public String getCondicoesEspeciais() {
		return condicoesEspeciais;
	}

	public void setCondicoesEspeciais(String condicoesEspeciais) {
		this.condicoesEspeciais = condicoesEspeciais;
	}

	@Override
	public int hashCode() {
		return Objects.hash(condicoesEspeciais, cubagemCarga, dataColeta, dataEntrega, localDestino, localOrigem,
				meioTransporte, pesoCarga, statusFrete, tipoCarga, valorFrete);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FreteInput other = (FreteInput) obj;
		return Objects.equals(condicoesEspeciais, other.condicoesEspeciais)
				&& Objects.equals(cubagemCarga, other.cubagemCarga) && Objects.equals(dataColeta, other.dataColeta)
				&& Objects.equals(dataEntrega, other.dataEntrega) && Objects.equals(localDestino, other.localDestino)
				&& Objects.equals(localOrigem, other.localOrigem)
				&& Objects.equals(meioTransporte, other.meioTransporte) && Objects.equals(pesoCarga, other.pesoCarga)
				&& Objects.equals(statusFrete, other.statusFrete) && Objects.equals(tipoCarga, other.tipoCarga)
				&& Objects.equals(valorFrete, other.valorFrete);
	}

	@Override
	public String toString() {
		return "FreteInput [localOrigem=" + localOrigem + ", localDestino=" + localDestino + ", tipoCarga=" + tipoCarga
				+ ", pesoCarga=" + pesoCarga + ", cubagemCarga=" + cubagemCarga + ", dataColeta=" + dataColeta
				+ ", dataEntrega=" + dataEntrega + ", valorFrete=" + valorFrete + ", statusFrete=" + statusFrete
				+ ", meioTransporte=" + meioTransporte + ", condicoesEspeciais=" + condicoesEspeciais + "]";
	}
	
	
}
