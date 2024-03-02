package com.projeto.azship.ports;

import java.lang.annotation.*;

import com.projeto.azship.adapters.ValorMonetarioValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = ValorMonetarioValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValorMonetario {
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
	String message();
}
