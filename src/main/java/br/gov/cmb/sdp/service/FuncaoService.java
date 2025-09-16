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
	private FuncaoRepository repository;
	
	public List<Funcao> buscarTodos() {
		return repository.findAll();
	}

	public Optional<Funcao> buscarPorId(Long id) {
		return repository.findById(id);
	}	

	public Funcao salvar(Funcao funcao) {
		return repository.save(funcao);
	}

	public Funcao atualizar(Long id, Funcao funcao) {
		return null;
	}

	public void deletar(Long id) {
		repository.deleteById(id);
	}

}
