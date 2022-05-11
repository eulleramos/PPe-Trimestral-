package br.senai.repository;

import br.senai.model.Filial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilialRepository extends JpaRepository<Filial, Long> {
    public Filial findByLocalizacao(String localizacao);
    public Filial findByNome(String nome);
    public List<Filial> findByRazaoSocial(String razaoSocial);
}
