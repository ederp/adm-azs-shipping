package com.projeto.azship.adapters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.azship.mapper.FreteMapper;
import com.projeto.azship.model.Frete;
import com.projeto.azship.model.FreteInput;
import com.projeto.azship.ports.FreteRepository;
import com.projeto.azship.ports.FreteServicePort;

@Service
public class FreteServiceAdapter implements FreteServicePort {
	
	@Autowired
	private FreteRepository freteRepository;
	
	public FreteServiceAdapter() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Transactional
	@Override
	public Frete create(FreteInput freteInput) {
		// TODO Auto-generated method stub
		Frete frete = FreteMapper.INSTANCE.toFrete(freteInput);
		return this.freteRepository.save(frete);
	}

	@Override
	public Page<Frete> findByParametro(String parametro, Integer pagina, Integer tamanho) {
		// TODO Auto-generated method stub
		PageRequest pageRequest = PageRequest.of(
                pagina,
                tamanho,
                Sort.Direction.ASC,
                "id");
		return new PageImpl<Frete>(freteRepository.findAll(FreteSpecification.buscarPorParametro(parametro)), 
				pageRequest, tamanho); 
	}

	@Transactional
	@Override
	public Frete update(Integer id, FreteInput freteInput) {
		// TODO Auto-generated method stub
		Frete frete = FreteMapper.INSTANCE.toFrete(freteInput);
		if (! this.freteRepository.findById(id).isEmpty()) {
			Frete freteUpdate = this.freteRepository.findById(id).get();
			
			if(frete.getLocalOrigem() != null) {
				freteUpdate.setLocalOrigem(frete.getLocalOrigem());
			}
			if(frete.getLocalDestino() != null) {
				freteUpdate.setLocalDestino(frete.getLocalDestino());
			}
			if(frete.getTipoCarga() != null) {
				freteUpdate.setTipoCarga(frete.getTipoCarga());
			}
			if(frete.getPesoCarga() != null) {
				freteUpdate.setPesoCarga(frete.getPesoCarga());
			}
			if(frete.getCubagemCarga() != null) {
				freteUpdate.setCubagemCarga(frete.getCubagemCarga());
			}
			if(frete.getDataColeta() != null) {
				freteUpdate.setDataColeta(frete.getDataColeta());
			}
			if(frete.getDataEntrega() != null) {
				freteUpdate.setDataEntrega(frete.getDataEntrega());
			}
			if(frete.getValorFrete() != null) {
				freteUpdate.setValorFrete(frete.getValorFrete());
			}
			if(frete.getStatusFrete() != null) {
				freteUpdate.setStatusFrete(frete.getStatusFrete());
			}
			if(frete.getMeioTransporte() != null) {
				freteUpdate.setMeioTransporte(frete.getMeioTransporte());
			}
			if(frete.getCondicoesEspeciais() != null) {
				freteUpdate.setCondicoesEspeciais(frete.getCondicoesEspeciais());
			}
			return this.freteRepository.save(freteUpdate);
		}
		return null;
	}

	@Transactional
	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		if (this.freteRepository.findById(id).isEmpty()) {
			return false;
		}
		this.freteRepository.deleteById(id);
		return true;
	}

}
