package model;

import java.util.Date;

public class Produto extends Cliente {

	private int id_prod;
	private Date data_vali;
	private float valor_prod;
	private String codigo_prod;

	public Produto(int id_clie, String nome, String endereco, String cpf) {
		super(id_clie, nome, endereco, cpf);
		// TODO Auto-generated constructor stub
	}

	public Produto(int id_clie, String nome, String endereco, String cpf, int id_prod, Date data_vali, float valor_prod,
			String codigo_prod) {
		super(id_clie, nome, endereco, cpf);
		this.id_prod = id_prod;
		this.data_vali = data_vali;
		this.valor_prod = valor_prod;
		this.codigo_prod = codigo_prod;
	}

	public int getId_prod() {
		return id_prod;
	}

	public void setId_prod(int id_prod) {
		this.id_prod = id_prod;
	}

	public Date getData_vali() {
		return data_vali;
	}

	public void setData_vali(Date data_vali) {
		this.data_vali = data_vali;
	}

	public float getValor_prod() {
		return valor_prod;
	}

	public void setValor_prod(float valor_prod) {
		this.valor_prod = valor_prod;
	}

	public String getCodigo_prod() {
		return codigo_prod;
	}

	public void setCodigo_prod(String codigo_prod) {
		this.codigo_prod = codigo_prod;
	}

}
