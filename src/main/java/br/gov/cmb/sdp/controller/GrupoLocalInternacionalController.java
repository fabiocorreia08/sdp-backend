package br.gov.cmb.sdp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.cmb.sdp.dto. GrupoLocalInternacionalDTO;
import br.gov.cmb.sdp.service.GrupoLocalInternacionalService;

@RestController
@RequestMapping("/api/grupo-local-internacional")
public class GrupoLocalInternacionalController {
	
	@Autowired
	private GrupoLocalInternacionalService service;

    @GetMapping
    public List< GrupoLocalInternacionalDTO> listar() {
        return service.buscarTodos();
    }

    @GetMapping("/{id}")
    public  GrupoLocalInternacionalDTO buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public  GrupoLocalInternacionalDTO salvar(@RequestBody  GrupoLocalInternacionalDTO dto) throws Exception {
        return service.salvar(dto);
    }

    @PutMapping("/{id}")
    public  GrupoLocalInternacionalDTO atualizar(@PathVariable Long id, @RequestBody  GrupoLocalInternacionalDTO dto) {
        return service.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

}
