package br.com.antonio.entity.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.antonio.entity.util.HibernateUtil;

public class DaoGeneric<T> {

	public void salvar(T entidade) {
		EntityManager entityManager = HibernateUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entidade);
		entityTransaction.commit();
		entityManager.close();
	}
}
