package com.projeto.azship.adapters;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.data.jpa.domain.Specification;

import com.projeto.azship.model.Frete;

public class FreteSpecification {
	public static Specification<Frete> buscarPorParametro(String parametro) {
        return (root, query, criteriaBuilder) -> {
            if (parametro == null || parametro.isEmpty()) {
                return criteriaBuilder.conjunction(); // Retorna uma condição trivial se o parâmetro for nulo ou vazio
            }
            
            if (ehNumerico(parametro)) {
            	return criteriaBuilder.or(
                        criteriaBuilder.equal(root.get("id"), Integer.parseInt(parametro)),
                        criteriaBuilder.equal(root.get("pesoCarga"), new BigDecimal(parametro)),
                        criteriaBuilder.equal(root.get("cubagemCarga"), new BigDecimal(parametro)),
                        criteriaBuilder.equal(root.get("valorFrete"), new BigDecimal(parametro))
                );
            } else if(ehFormatoData(parametro)){
            	return criteriaBuilder.or(
            			criteriaBuilder.equal(root.get("dataColeta"), LocalDate.parse(parametro)),
                        criteriaBuilder.equal(root.get("dataEntrega"), LocalDate.parse(parametro))
            			);
            } else {
            	return criteriaBuilder.or(
                        criteriaBuilder.like(criteriaBuilder.lower(root.get("localOrigem")), "%" + parametro.toLowerCase() + "%"),
                        criteriaBuilder.like(criteriaBuilder.lower(root.get("localDestino")), "%" + parametro.toLowerCase() + "%"),
                        criteriaBuilder.like(criteriaBuilder.lower(root.get("tipoCarga")), "%" + parametro.toLowerCase() + "%"),
                        criteriaBuilder.like(criteriaBuilder.lower(root.get("statusFrete")), "%" + parametro.toLowerCase() + "%"),
                        criteriaBuilder.like(criteriaBuilder.lower(root.get("meioTransporte")), "%" + parametro.toLowerCase() + "%"),
                        criteriaBuilder.like(criteriaBuilder.lower(root.get("condicoesEspeciais")), "%" + parametro.toLowerCase() + "%")
                    );
            }
        };
    }
	
	// Método auxiliar para verificar se uma string é numérica
    private static boolean ehNumerico(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
    
    private static boolean ehFormatoData(String str) {
        // Verifica se a string corresponde ao formato de data "YYYY-MM-DD"
        return str.matches("^\\d{4}-\\d{2}-\\d{2}$");
    }
}
