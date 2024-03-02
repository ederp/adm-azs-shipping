package com.projeto.azship.ports;

import com.projeto.azship.model.Frete;
import com.projeto.azship.model.FreteInput;

public interface FreteServicePort {
	
	public Frete create(FreteInput freteInput);
	
	public Frete findByParametro(String parametro);
	
	public Frete update(Integer id, FreteInput freteInput);
	
	public boolean delete(Integer id);
}
