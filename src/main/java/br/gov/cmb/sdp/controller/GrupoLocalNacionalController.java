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

import br.gov.cmb.sdp.dto.GrupoFuncaoDTO;
import br.gov.cmb.sdp.service.GrupoFuncaoService;

@RestController
@RequestMapping("/api/grupo-local-nac")
public class GrupoLocalNacionalController {
	
	@Autowired
	private GrupoFuncaoService service;

    @GetMapping
    public List<GrupoFuncaoDTO> listar() {
        return service.buscarTodos();
    }

    @GetMapping("/{id}")
    public GrupoFuncaoDTO buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public GrupoFuncaoDTO salvar(@RequestBody GrupoFuncaoDTO dto) throws Exception {
        return service.salvar(dto);
    }

    @PutMapping("/{id}")
    public GrupoFuncaoDTO atualizar(@PathVariable Long id, @RequestBody GrupoFuncaoDTO dto) {
        return service.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

}
