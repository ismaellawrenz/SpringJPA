package com.teste.testejpa.servicos;

import java.util.List;
import java.util.Optional;

import com.teste.testejpa.models.Parceiro;
import com.teste.testejpa.repositorio.ParceiorRepositorio;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ParceiroServico {

    private final ParceiorRepositorio repositorio;

    public ParceiroServico(ParceiorRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public Parceiro salvar(Parceiro parceiro) {
        return repositorio.save(parceiro);
    }

    public List<Parceiro> listarTudo() {
        return (List<Parceiro>) repositorio.findAll();
    }

    public Optional<Parceiro> buscarPorId(Long id) {
        return repositorio.findById(id);
    }

    public Parceiro alterar(Parceiro parceiro){
        return repositorio.save(parceiro);
    }

    public ResponseEntity <?> deletar(Long id){
        return repositorio.findById(id)
        .map(record -> {
            repositorio.deleteById(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());        
    }

}
