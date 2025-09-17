package br.gov.cmb.sdp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity<Funcao> buscarPorId(@PathVariable Long id) {
        return funcaoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Funcao salvar(@RequestBody Funcao product) {
        return funcaoService.salvar(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Funcao> atualizar(@PathVariable Long id, @RequestBody Funcao productDetails) {
        return ResponseEntity.ok(funcaoService.atualizar(id, productDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Funcao> deletar(@PathVariable Long id) {
    	funcaoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

}
