package br.senai.service;

import br.senai.model.Filial;
import br.senai.repository.FilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilialServiceImpl implements FilialService{

    @Autowired
    FilialRepository filialRepository;

    @Override
    public List<Filial> findAll() {
        return filialRepository.findAll();
    }

    @Override
    public Filial findByNome(String nome) {
        return null;
    }

    @Override
    public Filial save(Filial filial){
        try{
            return filialRepository.save(filial);
        }catch (Exception e){
            throw e;
        }
    }
}
