package com.ciandt.service;

import com.ciandt.repository.DadosPopulacionaisRepository;
import com.ciandt.domain.DadoPopulacional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DadosPopulacionaisServiceimpl implements DadosPopulacionaisService {

    @Autowired
    private DadosPopulacionaisRepository dadosPopulacionaisRepository;

    @Override
    public DadoPopulacional obterPopulacaoPorAno(final Optional<String> ano) {

        final String anoCenso = ano.get();

        if (!ano.isPresent()) {
            throw new IllegalArgumentException("Parametro Ano é Obrigatório");
        }

        return dadosPopulacionaisRepository.findByAno(anoCenso);
    }
}
