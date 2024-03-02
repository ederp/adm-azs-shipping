package com.projeto.azship.adapters.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.projeto.azship.ports.swagger.SwaggerDocConfigPort;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@OpenAPIDefinition
@Configuration
public class SwaggerDocumentationConfig implements SwaggerDocConfigPort {

	@Bean
	@Override
	public OpenAPI openApi() {
		// TODO Auto-generated method stub
		return new OpenAPI()
	            .info(new Info()
	                .title("API de Fretes")
	                .description("Documentação da API para o sistema de gestão de Fretes")
	                .termsOfService("")
	                .version("1.0.0")
	                .license(new License()
	                    .name("")
	                    .url("http://unlicense.org"))
	                .contact(new io.swagger.v3.oas.models.info.Contact()
	                    .email("epereira1984@uol.com.br")));
	}

}
