package com.bdb.onboarding.bdb.entites;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "tblentities")
@Entity
public class EntidadeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaturezaEntidade() {
		return naturezaEntidade;
	}

	public void setNaturezaEntidade(String naturezaEntidade) {
		this.naturezaEntidade = naturezaEntidade;
	}

	public String getTipoEntidade() {
		return tipoEntidade;
	}

	public void setTipoEntidade(String tipoEntidade) {
		this.tipoEntidade = tipoEntidade;
	}

	public Date getSocialDemographicReferenceDate() {
		return socialDemographicReferenceDate;
	}

	public void setSocialDemographicReferenceDate(Date socialDemographicReferenceDate) {
		this.socialDemographicReferenceDate = socialDemographicReferenceDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreet_moradaResidencia() {
		return street_moradaResidencia;
	}

	public void setStreet_moradaResidencia(String street_moradaResidencia) {
		this.street_moradaResidencia = street_moradaResidencia;
	}

	public String getMoradaCorrespondencia() {
		return moradaCorrespondencia;
	}

	public void setMoradaCorrespondencia(String moradaCorrespondencia) {
		this.moradaCorrespondencia = moradaCorrespondencia;
	}

	public String getPaisCorrespondencia() {
		return paisCorrespondencia;
	}

	public void setPaisCorrespondencia(String paisCorrespondencia) {
		this.paisCorrespondencia = paisCorrespondencia;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getIndicator1() {
		return indicator1;
	}

	public void setIndicator1(String indicator1) {
		this.indicator1 = indicator1;
	}

	public String getIndicator2() {
		return indicator2;
	}

	public void setIndicator2(String indicator2) {
		this.indicator2 = indicator2;
	}

	public String getNumber2() {
		return number2;
	}

	public void setNumber2(String number2) {
		this.number2 = number2;
	}

	public String getNumber1() {
		return number1;
	}

	public void setNumber1(String number1) {
		this.number1 = number1;
	}

	public String getEmissionReference() {
		return emissionReference;
	}

	public void setEmissionReference(String emissionReference) {
		this.emissionReference = emissionReference;
	}

	public String getDocVitalicio() {
		return docVitalicio;
	}

	public void setDocVitalicio(String docVitalicio) {
		this.docVitalicio = docVitalicio;
	}

	public String getSectorialCode() {
		return sectorialCode;
	}

	public void setSectorialCode(String sectorialCode) {
		this.sectorialCode = sectorialCode;
	}

	public String getResidenceCode() {
		return residenceCode;
	}

	public void setResidenceCode(String residenceCode) {
		this.residenceCode = residenceCode;
	}

	public String getReceivesSMSIndicator() {
		return receivesSMSIndicator;
	}

	public void setReceivesSMSIndicator(String receivesSMSIndicator) {
		this.receivesSMSIndicator = receivesSMSIndicator;
	}

	public String getReceivesEMAILIndicator() {
		return receivesEMAILIndicator;
	}

	public void setReceivesEMAILIndicator(String receivesEMAILIndicator) {
		this.receivesEMAILIndicator = receivesEMAILIndicator;
	}

	public String getEntidadeNaoSabeAssinar() {
		return entidadeNaoSabeAssinar;
	}

	public void setEntidadeNaoSabeAssinar(String entidadeNaoSabeAssinar) {
		this.entidadeNaoSabeAssinar = entidadeNaoSabeAssinar;
	}

	public String getEconomicActivityCode() {
		return economicActivityCode;
	}

	public void setEconomicActivityCode(String economicActivityCode) {
		this.economicActivityCode = economicActivityCode;
	}

	public String getEmployeeRoleInCompany() {
		return employeeRoleInCompany;
	}

	public void setEmployeeRoleInCompany(String employeeRoleInCompany) {
		this.employeeRoleInCompany = employeeRoleInCompany;
	}

	public Date getEmploymentHiringDate() {
		return employmentHiringDate;
	}

	public void setEmploymentHiringDate(Date employmentHiringDate) {
		this.employmentHiringDate = employmentHiringDate;
	}

	public Date getProfessionalInformationReferenceDate() {
		return professionalInformationReferenceDate;
	}

	public void setProfessionalInformationReferenceDate(Date professionalInformationReferenceDate) {
		this.professionalInformationReferenceDate = professionalInformationReferenceDate;
	}

	public String getFamiliarpessoadafuncaopublicaangolaoutropais() {
		return familiarpessoadafuncaopublicaangolaoutropais;
	}

	public void setFamiliarpessoadafuncaopublicaangolaoutropais(String familiarpessoadafuncaopublicaangolaoutropais) {
		this.familiarpessoadafuncaopublicaangolaoutropais = familiarpessoadafuncaopublicaangolaoutropais;
	}

	public String getNomeCompletoFamiliar() {
		return nomeCompletoFamiliar;
	}

	public void setNomeCompletoFamiliar(String nomeCompletoFamiliar) {
		this.nomeCompletoFamiliar = nomeCompletoFamiliar;
	}

	public String getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

	public String getMantemRelacaoComPessoaPoliticaAngolaOutroPais() {
		return mantemRelacaoComPessoaPoliticaAngolaOutroPais;
	}

	public void setMantemRelacaoComPessoaPoliticaAngolaOutroPais(String mantemRelacaoComPessoaPoliticaAngolaOutroPais) {
		this.mantemRelacaoComPessoaPoliticaAngolaOutroPais = mantemRelacaoComPessoaPoliticaAngolaOutroPais;
	}

	public String getNomeCompletoPessoaQueMantemRelacaoQueDesempenhaFuncaoPoliticaID() {
		return nomeCompletoPessoaQueMantemRelacaoQueDesempenhaFuncaoPoliticaID;
	}

	public void setNomeCompletoPessoaQueMantemRelacaoQueDesempenhaFuncaoPoliticaID(
			String nomeCompletoPessoaQueMantemRelacaoQueDesempenhaFuncaoPoliticaID) {
		this.nomeCompletoPessoaQueMantemRelacaoQueDesempenhaFuncaoPoliticaID = nomeCompletoPessoaQueMantemRelacaoQueDesempenhaFuncaoPoliticaID;
	}

	public String getNomeConjugue() {
		return nomeConjugue;
	}

	public void setNomeConjugue(String nomeConjugue) {
		this.nomeConjugue = nomeConjugue;
	}

	public String getNacionalidadeConjugue() {
		return nacionalidadeConjugue;
	}

	public void setNacionalidadeConjugue(String nacionalidadeConjugue) {
		this.nacionalidadeConjugue = nacionalidadeConjugue;
	}

	public Date getDataNascimentoConjugue() {
		return dataNascimentoConjugue;
	}

	public void setDataNascimentoConjugue(Date dataNascimentoConjugue) {
		this.dataNascimentoConjugue = dataNascimentoConjugue;
	}

	public String getNaturalidadeConjugue() {
		return naturalidadeConjugue;
	}

	public void setNaturalidadeConjugue(String naturalidadeConjugue) {
		this.naturalidadeConjugue = naturalidadeConjugue;
	}

	public String getTipoDocIdentificaoConjugue() {
		return tipoDocIdentificaoConjugue;
	}

	public void setTipoDocIdentificaoConjugue(String tipoDocIdentificaoConjugue) {
		this.tipoDocIdentificaoConjugue = tipoDocIdentificaoConjugue;
	}

	public String getNumeroDocIdentificacaoConjugue() {
		return numeroDocIdentificacaoConjugue;
	}

	public void setNumeroDocIdentificacaoConjugue(String numeroDocIdentificacaoConjugue) {
		this.numeroDocIdentificacaoConjugue = numeroDocIdentificacaoConjugue;
	}

	public String getDocVitalicioConjugue() {
		return docVitalicioConjugue;
	}

	public void setDocVitalicioConjugue(String docVitalicioConjugue) {
		this.docVitalicioConjugue = docVitalicioConjugue;
	}

	public Date getDataEmissaoDocConjugue() {
		return dataEmissaoDocConjugue;
	}

	public void setDataEmissaoDocConjugue(Date dataEmissaoDocConjugue) {
		this.dataEmissaoDocConjugue = dataEmissaoDocConjugue;
	}

	public Date getDataCaducidadeDocConjugue() {
		return dataCaducidadeDocConjugue;
	}

	public void setDataCaducidadeDocConjugue(Date dataCaducidadeDocConjugue) {
		this.dataCaducidadeDocConjugue = dataCaducidadeDocConjugue;
	}

	public String getCategoriaFiscal() {
		return categoriaFiscal;
	}

	public void setCategoriaFiscal(String categoriaFiscal) {
		this.categoriaFiscal = categoriaFiscal;
	}

	public Date getSocialEconomicReferenceDate() {
		return socialEconomicReferenceDate;
	}

	public void setSocialEconomicReferenceDate(Date socialEconomicReferenceDate) {
		this.socialEconomicReferenceDate = socialEconomicReferenceDate;
	}

	public Double getAnnualIncomeAmount() {
		return annualIncomeAmount;
	}

	public void setAnnualIncomeAmount(Double annualIncomeAmount) {
		this.annualIncomeAmount = annualIncomeAmount;
	}

	public String getAnnualIncomeCurrencyCode() {
		return annualIncomeCurrencyCode;
	}

	public void setAnnualIncomeCurrencyCode(String annualIncomeCurrencyCode) {
		this.annualIncomeCurrencyCode = annualIncomeCurrencyCode;
	}

	public Double getMonthlyIncomeAmount() {
		return monthlyIncomeAmount;
	}

	public void setMonthlyIncomeAmount(Double monthlyIncomeAmount) {
		this.monthlyIncomeAmount = monthlyIncomeAmount;
	}

	public String getMonthlyIncomeCurrencyCode() {
		return monthlyIncomeCurrencyCode;
	}

	public void setMonthlyIncomeCurrencyCode(String monthlyIncomeCurrencyCode) {
		this.monthlyIncomeCurrencyCode = monthlyIncomeCurrencyCode;
	}

	public Double getMonthlyExpensesAmount() {
		return monthlyExpensesAmount;
	}

	public void setMonthlyExpensesAmount(Double monthlyExpensesAmount) {
		this.monthlyExpensesAmount = monthlyExpensesAmount;
	}

	public String getMonthlyExpensesCurrencyCode() {
		return monthlyExpensesCurrencyCode;
	}

	public void setMonthlyExpensesCurrencyCode(String monthlyExpensesCurrencyCode) {
		this.monthlyExpensesCurrencyCode = monthlyExpensesCurrencyCode;
	}

	public String getCLIRIS() {
		return CLIRIS;
	}

	public void setCLIRIS(String cLIRIS) {
		CLIRIS = cLIRIS;
	}

	public String getPEP() {
		return PEP;
	}

	public void setPEP(String pEP) {
		PEP = pEP;
	}

	public String getPEPRES() {
		return PEPRES;
	}

	public void setPEPRES(String pEPRES) {
		PEPRES = pEPRES;
	}

	public String getRAML() {
		return RAML;
	}

	public void setRAML(String rAML) {
		RAML = rAML;
	}

	public String getDTREV() {
		return DTREV;
	}

	public void setDTREV(String dTREV) {
		DTREV = dTREV;
	}

	public String getEF() {
		return EF;
	}

	public void setEF(String eF) {
		EF = eF;
	}

	public String getSANCTI() {
		return SANCTI;
	}

	public void setSANCTI(String sANCTI) {
		SANCTI = sANCTI;
	}

	public String getSPINPE() {
		return SPINPE;
	}

	public void setSPINPE(String sPINPE) {
		SPINPE = sPINPE;
	}

	public String getFGD() {
		return FGD;
	}

	public void setFGD(String fGD) {
		FGD = fGD;
	}

	public String getN_processo() {
		return n_processo;
	}

	public void setN_processo(String n_processo) {
		this.n_processo = n_processo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public String getPaisemissaodoc() {
		return paisemissaodoc;
	}

	public void setPaisemissaodoc(String paisemissaodoc) {
		this.paisemissaodoc = paisemissaodoc;
	}

	public Date getDataemissaodoc() {
		return dataemissaodoc;
	}

	public void setDataemissaodoc(Date dataemissaodoc) {
		this.dataemissaodoc = dataemissaodoc;
	}

	public Date getDatavalidadedoc() {
		return datavalidadedoc;
	}

	public void setDatavalidadedoc(Date datavalidadedoc) {
		this.datavalidadedoc = datavalidadedoc;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getNatural() {
		return natural;
	}

	public void setNatural(String natural) {
		this.natural = natural;
	}

	public String getNacional() {
		return nacional;
	}

	public void setNacional(String nacional) {
		this.nacional = nacional;
	}

	public Integer getPaisresidencia() {
		return paisresidencia;
	}

	public void setPaisresidencia(Integer paisresidencia) {
		this.paisresidencia = paisresidencia;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public Integer getGenero() {
		return genero;
	}

	public void setGenero(Integer genero) {
		this.genero = genero;
	}

	public Integer getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(Integer estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Integer getRegimecasamento() {
		return regimecasamento;
	}

	public void setRegimecasamento(Integer regimecasamento) {
		this.regimecasamento = regimecasamento;
	}

	public Integer getHablitacao() {
		return hablitacao;
	}

	public void setHablitacao(Integer hablitacao) {
		this.hablitacao = hablitacao;
	}

	public Integer getFilhos() {
		return filhos;
	}

	public void setFilhos(Integer filhos) {
		this.filhos = filhos;
	}

	public Integer getAgregadoFamiliar() {
		return AgregadoFamiliar;
	}

	public void setAgregadoFamiliar(Integer agregadoFamiliar) {
		AgregadoFamiliar = agregadoFamiliar;
	}

	public Integer getFatca() {
		return fatca;
	}

	public void setFatca(Integer fatca) {
		this.fatca = fatca;
	}

	public Integer getAtividade() {
		return atividade;
	}

	public void setAtividade(Integer atividade) {
		this.atividade = atividade;
	}

	public Integer getProfissao() {
		return profissao;
	}

	public void setProfissao(Integer profissao) {
		this.profissao = profissao;
	}

	public String getEntidadepatronal() {
		return entidadepatronal;
	}

	public void setEntidadepatronal(String entidadepatronal) {
		this.entidadepatronal = entidadepatronal;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Column(unique = true, nullable = false, name = "nameEntidade")
    private String nome;

    @Column(length = 10, nullable = false, name = "identificationType")
    private String tipodocumento;

    @Column(length = 20, nullable = false, name = "documentNumber")
    private String numerodocumento;

    @Column(name = "emissionCountryCode")
    private String paisemissaodoc;

    @Column(name = "issuingDate")
    private Date dataemissaodoc;

    @Column(name = "expirationDate")
    private Date datavalidadedoc;

    @Column(name = "birthdate")
    private Date nascimento;

    @Column(name = "countryOfBirth")
    private String natural;

    @Column(name = "nationalityCountryCode")
    private String nacional;

    @Column(name = "residenceCountryCode")
    private Integer paisresidencia;

    @Column(length = 50, name = "fatherName")
    private String pai;

    @Column(length = 50, name = "motherName")
    private String mae;

    @Column(name = "genderCode")
    private Integer genero;

    @Column(name = "marithalStatusCode")
    private Integer estadoCivil;

    @Column(name = "matrimonialRegimeCode")
    private Integer regimecasamento;

    @Column(name = "academicDegreeCode")
    private Integer hablitacao;

    @Column(name = "numberOfChildren")
    private Integer filhos;

    @Column(name = "familyHousehold")
    private Integer AgregadoFamiliar;

    @Column(name = "usperson")
    private Integer fatca;
    
    @Column(name = "professionalActivityCode")
    private Integer atividade;

    @Column(name = "employmentTypeCode")
    private Integer profissao;

    @Column(length = 50, name = "employerDescription")
    private String entidadepatronal;

    @CreationTimestamp
    @Column(updatable = false, name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column
    private Date updatedAt;

    @Column
    private String naturezaEntidade;
    @Column
    private String tipoEntidade;
    @Column
    private Date socialDemographicReferenceDate;
    @Column
    private String email;
    @Column
    private String street_moradaResidencia;
    @Column
    private String moradaCorrespondencia;
    @Column
    private String paisCorrespondencia;
    @Column
    private String postalCode;
    @Column
    private String indicator1;
    @Column
    private String indicator2;
    @Column
    private String number2;
    @Column
    private String number1;
    @Column
    private String emissionReference;
    @Column
    private String docVitalicio;
    @Column
    private String sectorialCode;
    @Column
    private String residenceCode;
    @Column
    private String receivesSMSIndicator;
    @Column
    private String receivesEMAILIndicator;
    @Column
    private String entidadeNaoSabeAssinar;
    @Column
    private String economicActivityCode;
    @Column
    private String employeeRoleInCompany;
    @Column
    private Date employmentHiringDate;
    @Column
    private Date professionalInformationReferenceDate;
    @Column
    private String familiarpessoadafuncaopublicaangolaoutropais;
    @Column
    private String nomeCompletoFamiliar;
    @Column
    private String grauParentesco;
    @Column
    private String mantemRelacaoComPessoaPoliticaAngolaOutroPais;
    @Column
    private String nomeCompletoPessoaQueMantemRelacaoQueDesempenhaFuncaoPoliticaID;
    @Column
    private String nomeConjugue;
    @Column
    private String nacionalidadeConjugue;
    @Column
    private Date dataNascimentoConjugue;
    @Column
    private String naturalidadeConjugue;
    @Column
    private String tipoDocIdentificaoConjugue;
    @Column
    private String numeroDocIdentificacaoConjugue;
    @Column
    private String docVitalicioConjugue;
    @Column
    private Date dataEmissaoDocConjugue;
    @Column
    private Date dataCaducidadeDocConjugue;
    @Column
    private String categoriaFiscal;
    @Column
    private Date socialEconomicReferenceDate;
    
    @Column
    private Double annualIncomeAmount;
    @Column
    private String annualIncomeCurrencyCode;
    @Column
    private Double monthlyIncomeAmount;
    @Column
    private String monthlyIncomeCurrencyCode;
    @Column
    private Double monthlyExpensesAmount;
    @Column
    private String monthlyExpensesCurrencyCode;
    @Column
    private String CLIRIS;
    @Column
    private String PEP;
    @Column
    private String PEPRES;
    @Column
    private String RAML;
    @Column
    private String DTREV;
    @Column
    private String EF;
    @Column
    private String SANCTI;
    @Column
    private String SPINPE;
    @Column
    private String FGD;
    @Column
    private String n_processo;
    
}
