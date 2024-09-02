package model;

import java.util.Date;

public class Caixa extends Produto {

	private int id_caixa;
	private float valor_total;
	private float quant_total;

	public Caixa(int id_clie, String nome, String endereco, String cpf, int id_prod, Date data_vali, float valor_prod,
			String codigo_prod) {
		super(id_clie, nome, endereco, cpf, id_prod, data_vali, valor_prod, codigo_prod);
		// TODO Auto-generated constructor stub
	}

	public Caixa(int id_clie, String nome, String endereco, String cpf, int id_caixa, float valor_total,
			float quant_total) {
		super(id_clie, nome, endereco, cpf);
		this.id_caixa = id_caixa;
		this.valor_total = valor_total;
		this.quant_total = quant_total;
	}

	public int getId_caixa() {
		return id_caixa;
	}

	public void setId_caixa(int id_caixa) {
		this.id_caixa = id_caixa;
	}

	public float getValor_total() {
		return valor_total;
	}

	public void setValor_total(float valor_total) {
		this.valor_total = valor_total;
	}

	public float getQuant_total() {
		return quant_total;
	}

	public void setQuant_total(float quant_total) {
		this.quant_total = quant_total;
	}

}
