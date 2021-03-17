package com.bharath.patterns.abstractfactory;

public class Test {

	public static void main(String[] args) {

		DaoAbstractFactory daf = DaoFactoryProducer.produce("xml");
		Dao dao = daf.createDao("emp");
		dao.save();
		
		Dao deptdao = daf.createDao("dept");
		deptdao.save();
		
		DaoAbstractFactory dbdaf = DaoFactoryProducer.produce("db");
		Dao dbempdao = dbdaf.createDao("emp");
		dbempdao.save();
		
		Dao dbdeptdao = dbdaf.createDao("dept");
		dbdeptdao.save();
		
		
		
		
	}

}
