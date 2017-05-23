package com.ciandt.repository;

import com.ciandt.domain.DadoPopulacional;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface DadosPopulacionaisRepository extends CrudRepository<DadoPopulacional, Long> {

    DadoPopulacional findByAno(final String ano);


}
