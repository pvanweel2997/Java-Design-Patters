package com.bharath.patterns.abstractfactory;

public class DaoFactoryProducer {
	public static DaoAbstractFactory produce(String factoryType) {
		DaoAbstractFactory daoAbstractFactory = null;
		if ("xml".equals(factoryType)) {
			daoAbstractFactory = new XMLDaoFactory();
		} else if("db".equals(factoryType)) {
			daoAbstractFactory = new DBDaoFactory();
		}
		return daoAbstractFactory;
	}
}
