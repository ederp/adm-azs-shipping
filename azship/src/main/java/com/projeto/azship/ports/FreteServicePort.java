package com.projeto.azship.ports;

import org.springframework.data.domain.Page;

import com.projeto.azship.model.Frete;
import com.projeto.azship.model.FreteInput;

public interface FreteServicePort {
	
	public Frete create(FreteInput freteInput);
	
	public Page<Frete> findByParametro(String parametro, Integer pagina, Integer tamanho);
	
	public Frete update(Integer id, FreteInput freteInput);
	
	public boolean delete(Integer id);
}
