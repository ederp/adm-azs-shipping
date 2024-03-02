package com.projeto.azship.mapper;

import com.projeto.azship.model.Frete;
import com.projeto.azship.model.FreteInput;

public class FreteMapperImpl implements FreteMapper {

	@Override
	public Frete toFrete(FreteInput freteInput) {
		// TODO Auto-generated method stub
		Frete frete = new Frete(freteInput.getLocalOrigem(), 
				freteInput.getLocalDestino(), 
				freteInput.getTipoCarga(), 
				freteInput.getPesoCarga(),
				freteInput.getCubagemCarga(), 
				freteInput.getDataColeta(), 
				freteInput.getDataEntrega(),
				freteInput.getValorFrete(),
				freteInput.getStatusFrete(),
				freteInput.getMeioTransporte(), 
				freteInput.getCondicoesEspeciais());
		return frete;
	}

}
