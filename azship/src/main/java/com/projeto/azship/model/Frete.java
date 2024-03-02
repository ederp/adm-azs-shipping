package com.projeto.azship.model;

import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "frete")
public class Frete {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	private Integer id;

	@Column(name = "local_origem")
	@JsonProperty("localOrigem")
	private String localOrigem;

	@Column(name = "local_destino")
	@JsonProperty("localDestino")
	private String localDestino;

	@Column(name = "tipo_carga")
	@JsonProperty("tipoCarga")
	private String tipoCarga;

	@Column(name = "peso_carga")
	@JsonProperty("pesoCarga")
	private Double pesoCarga;

	@Column(name = "cubagem_carga")
	@JsonProperty("cubagemCarga")
	private Double cubagemCarga;

	@Column(name = "data_coleta")
	@JsonProperty("dataColeta")
	private LocalDate dataColeta;

	@Column(name = "data_entrega")
	@JsonProperty("dataEntrega")
	private LocalDate dataEntrega;

	@Column(name = "valor_frete")
	@JsonProperty("valorFrete")
	private Double valorFrete;

	@Column(name = "status_frete")
	@JsonProperty("statusFrete")
	private String statusFrete;

	@Column(name = "meio_transporte")
	@JsonProperty("meioTransporte")
	private String meioTransporte;

	@Column(name = "condicoes_especiais")
	@JsonProperty("condicoesEspeciais")
	private String condicoesEspeciais;

	public Frete() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Frete(Integer id, String localOrigem, String localDestino, String tipoCarga, Double pesoCarga,
			Double cubagemCarga, LocalDate dataColeta, LocalDate dataEntrega, Double valorFrete, String statusFrete,
			String meioTransporte, String condicoesEspeciais) {
		super();
		this.id = id;
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
	
	public Frete(String localOrigem, String localDestino, String tipoCarga, Double pesoCarga, Double cubagemCarga,
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return Objects.hash(condicoesEspeciais, cubagemCarga, dataColeta, dataEntrega, id, localDestino, localOrigem,
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
		Frete other = (Frete) obj;
		return Objects.equals(condicoesEspeciais, other.condicoesEspeciais)
				&& Objects.equals(cubagemCarga, other.cubagemCarga) && Objects.equals(dataColeta, other.dataColeta)
				&& Objects.equals(dataEntrega, other.dataEntrega) && Objects.equals(id, other.id)
				&& Objects.equals(localDestino, other.localDestino) && Objects.equals(localOrigem, other.localOrigem)
				&& Objects.equals(meioTransporte, other.meioTransporte) && Objects.equals(pesoCarga, other.pesoCarga)
				&& Objects.equals(statusFrete, other.statusFrete) && Objects.equals(tipoCarga, other.tipoCarga)
				&& Objects.equals(valorFrete, other.valorFrete);
	}

	@Override
	public String toString() {
		return "FreteInput [id=" + id + ", localOrigem=" + localOrigem + ", localDestino=" + localDestino
				+ ", tipoCarga=" + tipoCarga + ", pesoCarga=" + pesoCarga + ", cubagemCarga=" + cubagemCarga
				+ ", dataColeta=" + dataColeta + ", dataEntrega=" + dataEntrega + ", valorFrete=" + valorFrete
				+ ", statusFrete=" + statusFrete + ", meioTransporte=" + meioTransporte + ", condicoesEspeciais="
				+ condicoesEspeciais + "]";
	}
	
}
