package br.senai.service;

import br.senai.model.Filial;

import java.util.List;

public interface FilialService {

    public List<Filial> findAll();
    public Filial findByNome(String nome);
    public Filial save(Filial filial);

}
