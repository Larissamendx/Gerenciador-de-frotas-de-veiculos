package models;

class Motorista {
	
	private String nome;
	private int id;
	private int cpf;
	private String login;
	private String senha;
	private String licenca;
	
	public Motorista(String nome, String login, String senha, String licenca, int id, int cpf) {
		
		this.nome = nome;
		this.setLogin(login);
		this.setSenha(senha);
		this.setLicenca(licenca);
		this.setId(id);
		this.setCpf(cpf);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLicenca() {
		return licenca;
	}

	public void setLicenca(String licenca) {
		this.licenca = licenca;
	}
	
	
}
