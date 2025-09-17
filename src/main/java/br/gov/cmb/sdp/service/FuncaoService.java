package br.gov.cmb.sdp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.cmb.sdp.model.Funcao;
import br.gov.cmb.sdp.repository.FuncaoRepository;

@Service
public class FuncaoService {

	@Autowired
    private FuncaoRepository funcaoRepository;

    public List<Funcao> buscarTodos() {
        return funcaoRepository.findAll();
    }

    public Optional<Funcao> buscarPorId(Long id) {
        return funcaoRepository.findById(id);
    }

    public Funcao salvar(Funcao product) {
        return funcaoRepository.save(product);
    }

    public Funcao atualizar(Long id, Funcao funcaoAtualizada) {
    	Funcao funcao = funcaoRepository.findById(id).orElseThrow(() -> new RuntimeException("Registro não encontrado"));
    	//funcao.getTipoFuncao(funcaoAtualizada.getTipoFuncao().getCodigo());    	
        return funcaoRepository.save(funcao);
    }

    public void deletar(Long id) {
    	Funcao funcao = funcaoRepository.findById(id).orElseThrow(() -> new RuntimeException("Registro não encontrado"));
    	funcaoRepository.delete(funcao);
    }

}
