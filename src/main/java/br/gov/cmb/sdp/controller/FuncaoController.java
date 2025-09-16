package br.gov.cmb.sdp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.cmb.sdp.model.Funcao;
import br.gov.cmb.sdp.service.FuncaoService;

@RestController
@RequestMapping("/api/funcoes")
public class FuncaoController {

	@Autowired
	private FuncaoService funcaoService;

	@GetMapping
	public List<Funcao> buscarTodos() {
		return funcaoService.buscarTodos();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Funcao> getProductById(@PathVariable Long id) {
		Optional<Funcao> funcao = funcaoService.buscarPorId(id);
		return funcao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

}
