package com.projeto.azship.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.projeto.azship.model.Frete;
import com.projeto.azship.model.FreteInput;

@Mapper
public interface FreteMapper {
	
	FreteMapper INSTANCE = Mappers.getMapper(FreteMapper.class);
	Frete toFrete(FreteInput freteInput);
}
