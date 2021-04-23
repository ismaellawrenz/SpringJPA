package com.teste.testejpa.servicos;

import java.util.Optional;

import com.teste.testejpa.models.Parceiro;
import com.teste.testejpa.repositorio.ParceiorRepositorio;

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

    public Iterable<Parceiro> listarTudo() {
        return repositorio.findAll();
    }

    public Optional<Parceiro> buscarPorId(Long id) {
        return repositorio.findById(id);
    }

    public Parceiro alterar(Parceiro parceiro){
        return repositorio.save(parceiro);
    }

    public void deletar(Long id){
        repositorio.deleteById(id);
    }

}
