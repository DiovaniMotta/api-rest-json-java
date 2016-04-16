package br.com.api.rest.json.java.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.api.rest.json.java.bussiness.ProdutoBusiness;
import br.com.api.rest.json.java.interfaces.Controller;
import br.com.api.rest.json.java.model.Produto;

/**
 * 
 * @author Diovani Bernardi da Motta. Data: 15/04/2016 Classe responsável por
 *         interceptar e devolver respostas geradas pela API
 */
@Path("/produto")
public class ProdutoController implements Controller<Produto> {

	private ProdutoBusiness produtoBusiness = new ProdutoBusiness();

	@POST
	@Path("/salvar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void save(Produto object) {
		produtoBusiness.save(object);
	}

	@POST
	@Path("/atualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void merge(Produto object) {
		produtoBusiness.merge(object);
	}

	@POST
	@Path("/excluir")
	@Consumes(MediaType.APPLICATION_JSON)
	public void remove(Produto object) {
		produtoBusiness.remove(object);
	}

	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Produto> findAll() {
		return produtoBusiness.findAll();
	}

	@GET
	@Path("/unico/{ID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Produto findByID(@PathParam("ID") Long ID) {
		return produtoBusiness.findByID(ID);
	}

}
