package com.ciandt.controllers;

import com.ciandt.domain.DadoPopulacional;
import com.ciandt.domain.EstatisticaAnoResponse;
import com.ciandt.service.DadosPopulacionaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class SampleController {

    @Autowired
    DadosPopulacionaisService service;

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello =)";
    }

    @RequestMapping("/2010")
    public EstatisticaAnoResponse get2010data() {

        DadoPopulacional pop = service.obterPopulacaoPorAno(Optional.of("2010"));
        EstatisticaAnoResponse stat = new EstatisticaAnoResponse(pop);

        return stat;
    }

}
