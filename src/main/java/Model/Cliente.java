package Model;

public class Cliente {

	private int id_clie;
	private String nome;
	private String endereco;
	private String cpf;

	public Cliente(int id_clie, String nome, String endereco, String cpf) {
		super();
		this.id_clie = id_clie;
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
	}

	public int getId() {
		return id_clie;
	}

	public void setId(int id) {
		this.id_clie = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
