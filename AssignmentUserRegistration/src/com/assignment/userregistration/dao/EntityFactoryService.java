package com.assignment.userregistration.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityFactoryService {

	private static final EntityManagerFactory emfInstance = Persistence
			.createEntityManagerFactory("transactions-optional");

	private EntityFactoryService() {
	}

	public static EntityManagerFactory get() {
		return emfInstance;
	}
}
