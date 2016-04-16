package br.com.api.rest.json.java.interfaces;

import java.util.List;

/**
 * 
 * @author Diovani Bernardi da Motta Data: 15/04/2015 Inteface responsável por
 *         definir o comportamento padrão oferecido as classe de controle da API
 * @param <T>
 *            o tipo de dados que será usado na iteração com a API
 */
public interface Controller<T> {

	/**
	 * Método responsável por salvar um objeto
	 * 
	 * @param object
	 *            o objeto a ser persistido
	 */
	public void save(T object);

	/**
	 * Método responsável por atualizar um objeto
	 * 
	 * @param object
	 *            o objeto a ser persistido
	 */
	public void merge(T object);

	/**
	 * Método responsável por remover um objeto
	 * 
	 * @param object
	 *            o objeto a ser persistido
	 */
	public void remove(T object);

	/**
	 * Método responsável por retornar uma lista de objetos da API
	 * 
	 * @return uma lista de objetos do tipo especificado
	 */
	public List<T> findAll();

	/**
	 * Método responsável por retornar um objeto através do seu id
	 * 
	 * @param ID
	 *            o ID que se deseja retorna o objeto
	 * @return um objeto do tipo especificado
	 */
	public T findByID(Long ID);
}
