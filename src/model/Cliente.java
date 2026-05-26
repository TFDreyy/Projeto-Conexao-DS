package model;

public class Cliente {
	private int id;
    private String nome;
    private String nomeSocial;
    private String cpf;
    private String genero;
    private boolean afrodescendente;
    private boolean escolaridadePublica;
    private String dataNascimento;
    private String localNascimento;
    private String nacionalidade;
    private String paisOrigem;
    private String filiacao1;
    private String filiacao2;
    private String responsavelLegal;
    private String grauParentesco;
    private String habilitacao;
    private String periodo;
    private String serieModulo;
    private String ruaAvenida;
    private String bairro;
    private String complemento;
    private String apto;
    private String bloco;
    private String cep;
    private String cidade;
    private String telefone;
    private String celular;
    private String email;
    private boolean estudaAtualmenteEtec;
    private boolean estudaOutraEtec;
    private boolean jaEstudouEtec;
    private boolean concluiuEnsinoMedio;
    private String escolaEnsinoMedio;

    public Cliente() {
    }

    public Cliente(String nome, String nomeSocial, String cpf, String genero,
                   boolean afrodescendente, boolean escolaridadePublica,
                   String dataNascimento, String localNascimento,
                   String nacionalidade, String paisOrigem,
                   String filiacao1, String filiacao2,
                   String responsavelLegal, String grauParentesco,
                   String habilitacao, String periodo, String serieModulo,
                   String ruaAvenida, String bairro, String complemento,
                   String apto, String bloco, String cep, String cidade,
                   String telefone, String celular, String email,
                   boolean estudaAtualmenteEtec, boolean estudaOutraEtec,
                   boolean jaEstudouEtec, boolean concluiuEnsinoMedio,
                   String escolaEnsinoMedio) {

        this.nome = nome;
        this.nomeSocial = nomeSocial;
        this.cpf = cpf;
        this.genero = genero;
        this.afrodescendente = afrodescendente;
        this.escolaridadePublica = escolaridadePublica;
        this.dataNascimento = dataNascimento;
        this.localNascimento = localNascimento;
        this.nacionalidade = nacionalidade;
        this.paisOrigem = paisOrigem;
        this.filiacao1 = filiacao1;
        this.filiacao2 = filiacao2;
        this.responsavelLegal = responsavelLegal;
        this.grauParentesco = grauParentesco;
        this.habilitacao = habilitacao;
        this.periodo = periodo;
        this.serieModulo = serieModulo;
        this.ruaAvenida = ruaAvenida;
        this.bairro = bairro;
        this.complemento = complemento;
        this.apto = apto;
        this.bloco = bloco;
        this.cep = cep;
        this.cidade = cidade;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.estudaAtualmenteEtec = estudaAtualmenteEtec;
        this.estudaOutraEtec = estudaOutraEtec;
        this.jaEstudouEtec = jaEstudouEtec;
        this.concluiuEnsinoMedio = concluiuEnsinoMedio;
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

    public Cliente(int id, String nome, String nomeSocial, String cpf, String genero,
            boolean afrodescendente, boolean escolaridadePublica,
            String dataNascimento, String localNascimento,
            String nacionalidade, String paisOrigem,
            String filiacao1, String filiacao2,
            String responsavelLegal, String grauParentesco,
            String habilitacao, String periodo, String serieModulo,
            String ruaAvenida, String bairro, String complemento,
            String apto, String bloco, String cep, String cidade,
            String telefone, String celular, String email,
            boolean estudaAtualmenteEtec, boolean estudaOutraEtec,
            boolean jaEstudouEtec, boolean concluiuEnsinoMedio,
            String escolaEnsinoMedio) {
        
    	this.id = id;
    	this.nome = nome;
        this.nomeSocial = nomeSocial;
        this.cpf = cpf;
        this.genero = genero;
        this.afrodescendente = afrodescendente;
        this.escolaridadePublica = escolaridadePublica;
        this.dataNascimento = dataNascimento;
        this.localNascimento = localNascimento;
        this.nacionalidade = nacionalidade;
        this.paisOrigem = paisOrigem;
        this.filiacao1 = filiacao1;
        this.filiacao2 = filiacao2;
        this.responsavelLegal = responsavelLegal;
        this.grauParentesco = grauParentesco;
        this.habilitacao = habilitacao;
        this.periodo = periodo;
        this.serieModulo = serieModulo;
        this.ruaAvenida = ruaAvenida;
        this.bairro = bairro;
        this.complemento = complemento;
        this.apto = apto;
        this.bloco = bloco;
        this.cep = cep;
        this.cidade = cidade;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.estudaAtualmenteEtec = estudaAtualmenteEtec;
        this.estudaOutraEtec = estudaOutraEtec;
        this.jaEstudouEtec = jaEstudouEtec;
        this.concluiuEnsinoMedio = concluiuEnsinoMedio;
        this.escolaEnsinoMedio = escolaEnsinoMedio;
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isAfrodescendente() {
		return afrodescendente;
	}

	public void setAfrodescendente(boolean afrodescendente) {
		this.afrodescendente = afrodescendente;
	}

	public boolean isEscolaridadePublica() {
		return escolaridadePublica;
	}

	public void setEscolaridadePublica(boolean escolaridadePublica) {
		this.escolaridadePublica = escolaridadePublica;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getLocalNascimento() {
		return localNascimento;
	}

	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public String getFiliacao1() {
		return filiacao1;
	}

	public void setFiliacao1(String filiacao1) {
		this.filiacao1 = filiacao1;
	}

	public String getFiliacao2() {
		return filiacao2;
	}

	public void setFiliacao2(String filiacao2) {
		this.filiacao2 = filiacao2;
	}

	public String getResponsavelLegal() {
		return responsavelLegal;
	}

	public void setResponsavelLegal(String responsavelLegal) {
		this.responsavelLegal = responsavelLegal;
	}

	public String getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

	public String getHabilitacao() {
		return habilitacao;
	}

	public void setHabilitacao(String habilitacao) {
		this.habilitacao = habilitacao;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getSerieModulo() {
		return serieModulo;
	}

	public void setSerieModulo(String serieModulo) {
		this.serieModulo = serieModulo;
	}

	public String getRuaAvenida() {
		return ruaAvenida;
	}

	public void setRuaAvenida(String ruaAvenida) {
		this.ruaAvenida = ruaAvenida;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getApto() {
		return apto;
	}

	public void setApto(String apto) {
		this.apto = apto;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEstudaAtualmenteEtec() {
		return estudaAtualmenteEtec;
	}

	public void setEstudaAtualmenteEtec(boolean estudaAtualmenteEtec) {
		this.estudaAtualmenteEtec = estudaAtualmenteEtec;
	}

	public boolean isEstudaOutraEtec() {
		return estudaOutraEtec;
	}

	public void setEstudaOutraEtec(boolean estudaOutraEtec) {
		this.estudaOutraEtec = estudaOutraEtec;
	}

	public boolean isJaEstudouEtec() {
		return jaEstudouEtec;
	}

	public void setJaEstudouEtec(boolean jaEstudouEtec) {
		this.jaEstudouEtec = jaEstudouEtec;
	}

	public boolean isConcluiuEnsinoMedio() {
		return concluiuEnsinoMedio;
	}

	public void setConcluiuEnsinoMedio(boolean concluiuEnsinoMedio) {
		this.concluiuEnsinoMedio = concluiuEnsinoMedio;
	}

	public String getEscolaEnsinoMedio() {
		return escolaEnsinoMedio;
	}

	public void setEscolaEnsinoMedio(String escolaEnsinoMedio) {
		this.escolaEnsinoMedio = escolaEnsinoMedio;
	}
}
