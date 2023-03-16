package br.com.fiap.checkpoint1.service;

import br.com.fiap.checkpoint1.model.Empregado;
import br.com.fiap.checkpoint1.repository.EmpregadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpregadosService {
    @Autowired
    private EmpregadosRepository empregadosRepository;

    public List<Empregado> list() {
        return empregadosRepository.findAll();
    }
    public Empregado save(Empregado empregado) {
        return empregadosRepository.save(empregado);
    }

}
