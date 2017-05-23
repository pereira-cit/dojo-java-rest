package com.ciandt.service;

import com.ciandt.domain.DadoPopulacional;

import java.util.Optional;


public interface DadosPopulacionaisService {

    DadoPopulacional obterPopulacaoPorAno(final Optional<String> ano);

}
