package br.com.fiap.checkpoint1.controller;

import br.com.fiap.checkpoint1.controller.dto.EmpregadoCreate;
import br.com.fiap.checkpoint1.model.Empregado;
import br.com.fiap.checkpoint1.service.EmpregadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empregados")
public class EmpregadosController {
    @Autowired
    private EmpregadosService empregadosService;

    @GetMapping
    public List<Empregado> listAll() {
        return empregadosService.list();
    }

    @PostMapping
    public Empregado create(EmpregadoCreate dto) {
        Empregado empregadoInsert = new Empregado();
        empregadoInsert.setNome(dto.getNome());
        empregadoInsert.setEndereco(dto.getEndereco());

        return empregadosService.save(empregadoInsert);
    }

    @PutMapping
    public Empregado update(Empregado empregado) {
        return empregadosService.save(empregado);
    }
}
