package br.com.api.rest.json.java.interfaces;

import java.util.List;

/**
 * 
 * @author Diovani Bernardi da Motta Data: 15/04/2015 Inteface respons�vel por
 *         definir o comportamento padr�o oferecido as classe de controle da API
 * @param <T>
 *            o tipo de dados que ser� usado na itera��o com a API
 */
public interface Controller<T> {

	/**
	 * M�todo respons�vel por salvar um objeto
	 * 
	 * @param object
	 *            o objeto a ser persistido
	 */
	public void save(T object);

	/**
	 * M�todo respons�vel por atualizar um objeto
	 * 
	 * @param object
	 *            o objeto a ser persistido
	 */
	public void merge(T object);

	/**
	 * M�todo respons�vel por remover um objeto
	 * 
	 * @param object
	 *            o objeto a ser persistido
	 */
	public void remove(T object);

	/**
	 * M�todo respons�vel por retornar uma lista de objetos da API
	 * 
	 * @return uma lista de objetos do tipo especificado
	 */
	public List<T> findAll();

	/**
	 * M�todo respons�vel por retornar um objeto atrav�s do seu id
	 * 
	 * @param ID
	 *            o ID que se deseja retorna o objeto
	 * @return um objeto do tipo especificado
	 */
	public T findByID(Long ID);
}
