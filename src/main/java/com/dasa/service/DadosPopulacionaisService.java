package com.dasa.service;

import com.dasa.domain.DadoPopulacional;

import java.util.Optional;


public interface DadosPopulacionaisService {

    DadoPopulacional obterPopulacaoPorAno(final Optional<String> ano);

}
