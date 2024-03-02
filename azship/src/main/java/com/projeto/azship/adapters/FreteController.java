package com.projeto.azship.adapters;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.azship.model.Frete;
import com.projeto.azship.model.FreteInput;
import com.projeto.azship.ports.FreteControllerPort;

@RestController
public class FreteController implements FreteControllerPort {
	
	@Autowired
	private FreteServiceAdapter freteService;

	public FreteController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResponseEntity<List<Frete>> fretesBuscaGet(@Valid String parametro, @Valid Integer pagina) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> fretesIdDelete(Integer id) {
		// TODO Auto-generated method stub
		HttpStatus httpStatus = (this.freteService.delete(id)) ? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND;
		return ResponseEntity.status(httpStatus).build();
	}

	@Override
	public ResponseEntity<Frete> fretesIdPut(Integer id, @Valid FreteInput body) {
		// TODO Auto-generated method stub
		Frete frete = this.freteService.update(id, body);
		HttpStatus httpStatus = (frete == null) ? HttpStatus.NO_CONTENT : HttpStatus.OK;
		return ResponseEntity.status(httpStatus).body(frete);
	}

	@Override
	public ResponseEntity<Frete> fretesPost(@Valid FreteInput body) {
		// TODO Auto-generated method stub
		return ResponseEntity.status(HttpStatus.CREATED).body(this.freteService.create(body));
	}

}
