package manytoonee3.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytoonee3.dto.Employee;

public class EmployeeDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}
	
	public void saveEmployee(Employee employee) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
	
	public void saveEmployee(List<Employee> employees) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		for(Employee employee:employees) {
			entityManager.persist(employee);
		}
		entityTransaction.commit();
		
	}
	
}
