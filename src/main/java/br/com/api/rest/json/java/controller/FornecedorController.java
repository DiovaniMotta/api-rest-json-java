package br.com.api.rest.json.java.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.api.rest.json.java.bussiness.FornecedorBusiness;
import br.com.api.rest.json.java.interfaces.Controller;
import br.com.api.rest.json.java.model.Fornecedor;

/**
 * 
 * @author Diovani Bernardi da Motta. Data: 15/04/2016 Classe responsável por
 *         interceptar e devolver respostas geradas pela API
 */
@Path("/fornecedor")
public class FornecedorController implements Controller<Fornecedor> {

	private FornecedorBusiness fornecedorBusiness = new FornecedorBusiness();

	@POST
	@Path("/salvar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void save(Fornecedor object) {
		fornecedorBusiness.save(object);
	}

	@POST
	@Path("/atualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void merge(Fornecedor object) {
		fornecedorBusiness.merge(object);
	}

	@POST
	@Path("/excluir")
	@Consumes(MediaType.APPLICATION_JSON)
	public void remove(Fornecedor object) {
		fornecedorBusiness.remove(object);
	}

	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Fornecedor> findAll() {
		return fornecedorBusiness.findAll();
	}

	@GET
	@Path("/unico/{ID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Fornecedor findByID(@PathParam("ID") Long ID) {
		return fornecedorBusiness.findByID(ID);
	}
}
