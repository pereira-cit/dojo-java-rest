package com.ciandt.domain;

import lombok.Data;

@Data
public class EstatisticaAnoResponse {
	private final String ano;
	
	public EstatisticaAnoResponse(DadoPopulacional pop) {
		this.ano = pop.getAno();
	}
}
