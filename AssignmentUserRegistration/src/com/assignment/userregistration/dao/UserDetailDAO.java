package com.assignment.userregistration.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.assignment.userregistration.entity.UserDetail;

public enum UserDetailDAO {

	INSTANCE;

	@SuppressWarnings("unchecked")
	public List<UserDetail> listUsers() {
		EntityManager em = EntityFactoryService.get().createEntityManager();
		// read the existing entries
		Query q = em.createQuery("select m from UserDetail m");
		List<UserDetail> details = q.getResultList();
		return details;
	}

	public void add(String userName, String phoneNo,
			String email, String address) {
		synchronized (this) {
			EntityManager em = EntityFactoryService.get().createEntityManager();
			UserDetail detail = new UserDetail(userName, email, phoneNo,
					address);
			em.persist(detail);
			em.close();
		}
	}

	public void remove(long id) {
		EntityManager em = EntityFactoryService.get().createEntityManager();
		try {

			UserDetail detail = em.find(UserDetail.class, id);
			em.remove(detail);
		} finally {
			em.close();
		}
	}
}
