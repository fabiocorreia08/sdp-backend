package br.gov.cmb.sdp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.cmb.sdp.dto.FuncaoDTO;
import br.gov.cmb.sdp.enuns.TipoFuncaoEnum;
import br.gov.cmb.sdp.service.FuncaoService;

@RestController
@RequestMapping("/api/funcao")
public class FuncaoController {

	@Autowired
	private FuncaoService service;

    @GetMapping
    public List<FuncaoDTO> listar() {
        return service.buscarTodos();
    }

    @GetMapping("/{id}")
    public FuncaoDTO buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @GetMapping("/tipo-funcao/{tipoFuncao}")
    public Optional<FuncaoDTO> buscarPorTipoFuncao(@PathVariable TipoFuncaoEnum tipoFuncao) {
        return service.buscarPorTipoFuncao(tipoFuncao);
    }
    
    @PostMapping
    public FuncaoDTO salvar(@RequestBody FuncaoDTO dto) throws Exception {
        return service.salvar(dto);
    }

    @PutMapping("/{id}")
    public FuncaoDTO atualizar(@PathVariable Long id, @RequestBody FuncaoDTO dto) {
        return service.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

}
