package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Veiculo;
import br.com.fiap.jpa.dao.VeiculoDao;

public class VeiculoDaoImpl implements VeiculoDao {

	private EntityManager em;
	
	public VeiculoDaoImpl(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Veiculo veiculo) {
		em.persist(veiculo);
	}

	public Veiculo procurar(Integer id) {
		return em.find(Veiculo.class, 1);
	}

	public void atualizar(Veiculo veiculo) {
		em.merge(veiculo);
	}

	public void apagar(Integer id) {
		Veiculo veiculo = procurar(id);
		em.remove(id);
	}

	public void commit() {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();	
		}catch(Exception e) {
			em.getTransaction().rollback();
			throw new CommitException();
		}
	}
	
}
