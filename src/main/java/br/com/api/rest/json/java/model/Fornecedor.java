package br.com.api.rest.json.java.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Diovani Bernardi da Motta Data: 15/04/2016 Classe modelo usada como
 *         exemplo de entidade persistente
 */
@XmlRootElement
public class Fornecedor implements Serializable {

	private static final long serialVersionUID = 6265729338971780551L;
	private Long ID;
	private String razaoSocial;
	private String cnpj;

	public Fornecedor() {
		super();
	}

	public Fornecedor(Long iD, String razaoSocial, String cnpj) {
		super();
		ID = iD;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
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
		Fornecedor other = (Fornecedor) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fornecedor [ID=" + ID + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + "]";
	}
}
