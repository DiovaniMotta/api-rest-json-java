package br.com.api.rest.json.java.bussiness;

import java.util.List;

import br.com.api.rest.json.java.dao.FornecedorDAO;
import br.com.api.rest.json.java.interfaces.Business;
import br.com.api.rest.json.java.model.Fornecedor;

/**
 * 
 * @author Diovani Bernardi da Motta Data: 15/04/2016 Classe responsável por
 *         efetuar o encapsulamento da regra de negócio associada a entidade
 *         persitente
 */
public class FornecedorBusiness implements Business<Fornecedor> {

	private FornecedorDAO fornecedorDAO = new FornecedorDAO();

	public void save(Fornecedor object) {
		fornecedorDAO.save(object);
	}

	public void merge(Fornecedor object) {
		fornecedorDAO.merge(object);
	}

	public void remove(Fornecedor object) {
		fornecedorDAO.remove(object);
	}

	public List<Fornecedor> findAll() {
		return fornecedorDAO.findAll();
	}

	public Fornecedor findByID(Long ID) {
		return fornecedorDAO.findByID(ID);
	}

}
