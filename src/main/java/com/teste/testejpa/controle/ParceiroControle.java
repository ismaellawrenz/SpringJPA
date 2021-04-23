package com.teste.testejpa.controle;

import java.sql.SQLException;

import java.util.Optional;

import com.teste.testejpa.models.Parceiro;
import com.teste.testejpa.servicos.ParceiroServico;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@Controller("/parceiro")
public class ParceiroControle {
    private ParceiroServico repositorio;

    public ParceiroControle(ParceiroServico repositorio) {
        this.repositorio = repositorio;
    }

    @PostMapping()
    public Parceiro salvar(@RequestBody Parceiro parceiro) throws SQLException {
        return repositorio.salvar(parceiro);
    }

    @GetMapping("/{id}")
    public Optional<Parceiro> buscarPorId(@PathVariable Long id) {
        return repositorio.buscarPorId(id);
    }

    @GetMapping("/all")
    public Iterable<Parceiro> buscarTodos() {
        return repositorio.listarTudo();
    }

    @PutMapping()
    public Parceiro alterar(@RequestBody Parceiro parceiro) {
        return repositorio.alterar(parceiro);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        repositorio.deletar(id);
    }


}
