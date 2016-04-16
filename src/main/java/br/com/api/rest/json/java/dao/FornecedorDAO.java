package br.com.api.rest.json.java.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.api.rest.json.java.interfaces.Persist;
import br.com.api.rest.json.java.model.Fornecedor;

/**
 * 
 * @author Diovani Bernardi da Motta Data: 15/04/2016 Classe responsável por
 *         efetuar a iteração com a camada de persitência de dados do sistema
 */
public class FornecedorDAO implements Persist<Fornecedor> {

	private static List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

	static {
		/* Crio objetos do tipo Fornecedor */
		Fornecedor f1 = new Fornecedor(1L, "Fornecedor 001", "11.111.111/1111-11");
		Fornecedor f2 = new Fornecedor(2L, "Fornecedor 002", "22.222.222/2222-22");
		Fornecedor f3 = new Fornecedor(3L, "Fornecedor 003", "33.333.333/3333-33");
		Fornecedor f4 = new Fornecedor(4L, "Fornecedor 004", "44.444.444/4444-44");
		Fornecedor f5 = new Fornecedor(5L, "Fornecedor 005", "55.555.555/5555-55");
		Fornecedor f6 = new Fornecedor(6L, "Fornecedor 006", "66.666.666/6666-66");
		/*Adiciono a lista*/
		fornecedores.add(f1);
		fornecedores.add(f2);
		fornecedores.add(f3);
		fornecedores.add(f4);
		fornecedores.add(f5);
		fornecedores.add(f6);
	}

	@Override
	public void save(Fornecedor object) {
		fornecedores.add(object);
	}

	@Override
	public void merge(Fornecedor object) {
		fornecedores.add(object);
	}

	@Override
	public void remove(Fornecedor object) {
		fornecedores.remove(object);
	}

	@Override
	public List<Fornecedor> findAll() {
		return fornecedores;
	}

	@Override
	public Fornecedor findByID(Long ID) {
		Optional<Fornecedor> fornecedor = fornecedores.stream().filter(f -> f.getID().equals(ID)).findFirst();
		return fornecedor.get();
	}

}
