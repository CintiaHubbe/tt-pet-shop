package br.com.tt.web.pet.controller.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.tt.web.pet.dao.Dao;
import br.com.tt.web.pet.model.Pet;
import br.com.tt.web.pet.model.Proprietario;

@ManagedBean
@SessionScoped
public class ProprietarioBean {

	private Proprietario proprietario = new Proprietario();
	private Dao proprietarioDao = new Dao();
	private List<Proprietario> lista = proprietarioDao.buscarTodos(proprietario);

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public void salvar() {
		proprietarioDao.salvar(proprietario);
		lista = proprietarioDao.buscarTodos(proprietario);
		proprietario = new Proprietario();
		System.out.println("Salvo com sucesso!");
	}

	public List<Proprietario> getLista() {
		return lista;
	}

	public void setLista(List<Proprietario> lista) {
		this.lista = lista;
	}
}
