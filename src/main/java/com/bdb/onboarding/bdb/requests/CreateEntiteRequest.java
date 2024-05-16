package com.bdb.onboarding.bdb.requests;

import java.sql.Date;

import com.bdb.onboarding.bdb.entites.EntidadeEntity;

public record CreateEntiteRequest(
		String nome,
		String tipodoc,
		String numerodocumento,
		String paisemissaodoc,
		Date dataemissaodoc,
		Date datavalidadedoc,
		Date datanascimento,
		String natural,
		String nacional,
		Integer paisresidencia,
		String pai,
		String mae,
		Integer genero,
		Integer estadoCivil,
		Integer regimecasamento,
		Integer hablitacao,
		Integer filhos,
		Integer agregado,
		Date datareferencia,
		Integer fatca,
		Integer atividade,
		Integer profissao,
		String entidadepatronal
		) {
	public EntidadeEntity toEntite() {
		EntidadeEntity entidade = new EntidadeEntity();

		entidade.setNome(nome);
		entidade.setTipodocumento(tipodoc);
		entidade.setNumerodocumento(numerodocumento);
		entidade.setPaisemissaodoc(paisemissaodoc);
		entidade.setDataemissaodoc(dataemissaodoc);
		entidade.setDatavalidadedoc(datavalidadedoc);
		entidade.setNascimento(datanascimento);
		entidade.setNatural(natural);
		entidade.setNacional(nacional);
		entidade.setPaisresidencia(paisresidencia);
		entidade.setPai(pai);
		entidade.setMae(mae);
		entidade.setGenero(genero);
		entidade.setEstadoCivil(estadoCivil);
		entidade.setRegimecasamento(regimecasamento);
		entidade.setHablitacao(hablitacao);
		entidade.setFilhos(filhos);
		entidade.setAgregadoFamiliar(agregado);
		entidade.setFatca(fatca);
		entidade.setAtividade(atividade);
		entidade.setProfissao(profissao);
		entidade.setEntidadepatronal(entidadepatronal);
		
        return entidade;
    }
}
