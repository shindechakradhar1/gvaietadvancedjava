package com.gvaiet.springemployeecrud.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.gvaiet.springemployeecrud.entities.EAddress;
import com.gvaiet.springemployeecrud.entities.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String addEmployee(Employee employee) {
		String msg="";
		
		try(Session session=getSessionFactory().openSession()){
			
			Transaction transaction = session.getTransaction();
			transaction.begin();
			
			EAddress eAddress = employee.getAddress();
			eAddress.setEmployee(employee);
//			session.saveOrUpdate(employee);
			
//			session
//			.createNativeQuery("insert into employee(eid, name, age) values(:id, :name, :age)")
			session.createNamedQuery("addEmployee")
			.setParameter("id", employee.geteId())
			.setParameter("name", employee.getName())
			.setParameter("age", employee.getAge()).executeUpdate();
			transaction.commit();
			msg="Successfully Inserted..";
		}catch(Exception e) {
			msg=e.getMessage();		
		}
		
		return msg;
	}

	private SessionFactory getSessionFactory() {
		return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> employeeList;
		try(Session session=getSessionFactory().openSession()){
			employeeList=session.createQuery("FROM Employee", Employee.class).list();
		}
		
		
		return employeeList;
	}

	@Override
	public String deleteEmployee(int id) {
		String msg="";
		try(Session session=getSessionFactory().openSession()){
			Transaction transaction = session.getTransaction();
			transaction.begin();
//			session.delete(session.get(Employee.class, id));
			session.delete(session.load(Employee.class, id));
			transaction.commit();
			msg="Record Deleted...";
		}catch (Exception e) {
			msg=e.getMessage();
		}
		return msg;
	}

	@Override
	public Employee updateEmployee(int id) {
		Employee employee;
		try(Session session=getSessionFactory().openSession()){
			employee=session.get(Employee.class, id);
//			Query<Employee> empQuery = session.createQuery("SELECT e FROM Employee e left join fetch e.address ea where e.eId=:eid and ea.addressId=:aid");
//			empQuery.setParameter("eid", id);
//			empQuery.setParameter("aid", id);
//			employee= empQuery.getSingleResult();
			
			
//			employee=session.createNamedQuery("findByName", Employee.class)
//					.setParameter("name", "BBB")
//					.getSingleResult();
			
//			Query namedQuery = session.getNamedQuery("findByArea");
//			namedQuery.setParameter("area","shelu");
//			
//			employee=(Employee)namedQuery.getSingleResult();
			
		}
		return employee;
	}
	
}
