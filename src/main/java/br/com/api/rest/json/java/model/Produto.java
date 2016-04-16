package br.com.api.rest.json.java.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @author Diovani Bernardi da Motta Data: 15/04/2016 Classe modelo usada como
 *         exemplo de entidade persistente
 */
@XmlRootElement
public class Produto implements Serializable {

	private static final long serialVersionUID = 3436571407590752186L;
	private Long ID;
	private String descricao;
	private BigDecimal quantidade;
	private BigDecimal precoVenda;
	private BigDecimal precoCusto;
	private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

	public Produto() {
		super();
	}

	public Produto(Long iD, String descricao, BigDecimal quantidade, BigDecimal precoVenda, BigDecimal precoCusto,
			List<Fornecedor> fornecedores) {
		super();
		ID = iD;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.precoVenda = precoVenda;
		this.precoCusto = precoCusto;
		this.fornecedores = fornecedores;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}

	public BigDecimal getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(BigDecimal precoCusto) {
		this.precoCusto = precoCusto;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [ID=" + ID + ", descricao=" + descricao + ", quantidade=" + quantidade + ", precoVenda="
				+ precoVenda + ", precoCusto=" + precoCusto + ", fornecedores=" + fornecedores + "]";
	}
}
