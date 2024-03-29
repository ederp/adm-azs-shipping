package com.projeto.azship.ports;

import jakarta.validation.Valid;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.projeto.azship.model.Frete;
import com.projeto.azship.model.FreteInput;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

public interface FreteControllerPort {
	@Operation(summary = "Buscar fretes com base em um parâmetro", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Fretes encontrados", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Frete.class))),
        @ApiResponse(responseCode = "404", description = "Frete não encontrado") })
    @GetMapping(value = { "/fretes/busca", "/fretes/busca/{parametro}", "/fretes/busca/{parametro}/{pagina}", "/fretes/busca/{parametro}/{pagina}/{tamanho}" },
        produces = { "application/json" })
    ResponseEntity<Page<Frete>> fretesBuscaGet(@Parameter(in = ParameterIn.QUERY, description = "Parâmetro para busca em todas as propriedades do frete" ,schema=@Schema()) 
    @PathVariable(value = "parametro", required = false) String parametro, 
    @Parameter(in = ParameterIn.QUERY, description = "Número da página para paginação" ,schema=@Schema( defaultValue="1")) 
    @PathVariable(value = "pagina", required = false) Optional<Integer> pagina,
    @Parameter(in = ParameterIn.QUERY, description = "Tamanho da página para paginação" ,schema=@Schema( defaultValue="10")) 
    @PathVariable(value = "tamanho", required = false) Optional<Integer> tamanho);


    @Operation(summary = "Remover um frete por ID", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Frete removido com sucesso"),
        @ApiResponse(responseCode = "404", description = "Frete não encontrado") })
    @DeleteMapping(value = "/fretes/{id}")
    ResponseEntity<Void> fretesIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID do frete a ser removido", required=true, schema=@Schema()) 
    @PathVariable("id") Integer id);


    @Operation(summary = "Atualizar dados de um frete por ID", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Frete atualizado com sucesso"),
        @ApiResponse(responseCode = "404", description = "Frete não encontrado") })
    @PutMapping(value = "/fretes/{id}",
        consumes = { "application/json" })
    ResponseEntity<Frete> fretesIdPut(@Parameter(in = ParameterIn.PATH, description = "ID do frete a ser atualizado", required=true, schema=@Schema()) 
    @PathVariable("id") Integer id,
    @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) 
    @Valid @RequestBody FreteInput body);


    @Operation(summary = "Cadastrar um novo frete", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Frete criado com sucesso") })
    @PostMapping(value = "/fretes",
        consumes = { "application/json" })
    ResponseEntity<Frete> fretesPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) 
    @Valid @RequestBody FreteInput body);
}
