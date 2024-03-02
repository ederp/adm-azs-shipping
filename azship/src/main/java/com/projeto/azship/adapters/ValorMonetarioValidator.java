package com.projeto.azship.adapters;

import java.math.BigDecimal;

import com.projeto.azship.ports.ValorMonetario;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValorMonetarioValidator implements ConstraintValidator<ValorMonetario, BigDecimal> {

	@Override
	public void initialize(ValorMonetario constraintAnnotation) {
	}

	@Override
	public boolean isValid(BigDecimal value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value.toString().matches("^\\d+\\.\\d{2}$");
	}

}
