package com.teste.testejpa.repositorio;

import com.teste.testejpa.models.Parceiro;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "parceiro", path = "parceiro")
public interface ParceiorRepositorio extends  PagingAndSortingRepository<Parceiro, Long>{
    
}
