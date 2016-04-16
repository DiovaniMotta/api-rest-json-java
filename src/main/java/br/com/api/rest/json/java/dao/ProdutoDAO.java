package br.com.api.rest.json.java.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import br.com.api.rest.json.java.interfaces.Persist;
import br.com.api.rest.json.java.model.Fornecedor;
import br.com.api.rest.json.java.model.Produto;

/**
 * 
 * @author Diovani Bernardi da Motta Data: 15/04/2016 Classe responsável por
 *         efetuar a iteração com a camada de persitência de dados do sistema
 */
public class ProdutoDAO implements Persist<Produto> {

	public static List<Produto> produtos = new ArrayList<Produto>();

	static {
		/* Crio objetos do tipo Fornecedor */
		Fornecedor f1 = new Fornecedor(1L, "Fornecedor 001", "11.111.111/1111-11");
		Fornecedor f2 = new Fornecedor(2L, "Fornecedor 002", "22.222.222/2222-22");
		Fornecedor f3 = new Fornecedor(3L, "Fornecedor 003", "33.333.333/3333-33");
		Fornecedor f4 = new Fornecedor(4L, "Fornecedor 004", "44.444.444/4444-44");
		Fornecedor f5 = new Fornecedor(5L, "Fornecedor 005", "55.555.555/5555-55");
		Fornecedor f6 = new Fornecedor(6L, "Fornecedor 006", "66.666.666/6666-66");
		/* Crio objetos do tipo Produto */
		Produto p1 = new Produto(1L, "Produto 001", BigDecimal.TEN, BigDecimal.TEN, BigDecimal.TEN,
				Arrays.asList(f1, f2, f3, f4, f5, f6));
		Produto p2 = new Produto(1L, "Produto 002", BigDecimal.TEN, BigDecimal.TEN, BigDecimal.TEN,
				Arrays.asList(f1, f2, f3, f4, f5, f6));
		Produto p3 = new Produto(1L, "Produto 003", BigDecimal.TEN, BigDecimal.TEN, BigDecimal.TEN,
				Arrays.asList(f1, f2, f3, f4, f5, f6));
		Produto p4 = new Produto(1L, "Produto 004", BigDecimal.TEN, BigDecimal.TEN, BigDecimal.TEN,
				Arrays.asList(f1, f2, f3, f4, f5, f6));
		Produto p5 = new Produto(1L, "Produto 005", BigDecimal.TEN, BigDecimal.TEN, BigDecimal.TEN,
				Arrays.asList(f1, f2, f3, f4, f5, f6));
		/* Adiciono os objetos criados a lista */
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
	}

	public void save(Produto object) {
		produtos.add(object);
	}

	public void merge(Produto object) {
		produtos.add(object);
	}

	public void remove(Produto object) {
		produtos.remove(object);
	}

	public List<Produto> findAll() {
		return produtos;
	}

	public Produto findByID(Long ID) {
		Optional<Produto> produto = produtos.stream().filter(p -> p.getID().equals(ID)).findFirst();
		return produto.get();
	}

}
