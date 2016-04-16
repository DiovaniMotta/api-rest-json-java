package br.com.api.rest.json.java.bussiness;

import java.util.List;

import br.com.api.rest.json.java.dao.ProdutoDAO;
import br.com.api.rest.json.java.interfaces.Business;
import br.com.api.rest.json.java.model.Produto;

/**
 * 
 * @author Diovani Bernardi da Motta Data: 15/04/2016 Classe responsável por
 *         efetuar o encapsulamento da regra de negócio associada a entidade
 *         persitente
 */
public class ProdutoBusiness implements Business<Produto> {

	private ProdutoDAO produtoDAO = new ProdutoDAO();

	public void save(Produto object) {
		produtoDAO.save(object);
	}

	public void merge(Produto object) {
		produtoDAO.merge(object);
	}

	public void remove(Produto object) {
		produtoDAO.remove(object);
	}

	public List<Produto> findAll() {
		return produtoDAO.findAll();
	}

	public Produto findByID(Long ID) {
		return produtoDAO.findByID(ID);
	}

}
