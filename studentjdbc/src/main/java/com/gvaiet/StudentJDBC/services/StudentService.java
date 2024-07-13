package com.gvaiet.StudentJDBC.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gvaiet.StudentJDBC.entities.Address;
import com.gvaiet.StudentJDBC.entities.Student;

public class StudentService {

	public String insertStudent(Student student) {
		String returnMsg = "Problem Occured During Inserting Student record.";
		int addressId = 0;
		String insertAddressQuery = "INSERT INTO " + "address(area, landmark, city, pincode) " + "VALUES(?,?,?,?)";
		String insertStudentQuery = "INSERT INTO " + "student(rollNo,name,courseName,addressId)" + "VALUES(?,?,?,?)";
		Connection connection = null;
		try {

			connection = getJDBCConnection();
			PreparedStatement statement = connection.prepareStatement(insertAddressQuery,
					Statement.RETURN_GENERATED_KEYS);
			Address address = student.getAddress();

			statement.setString(1, address.getArea());
			statement.setString(2, address.getLandMark());
			statement.setString(3, address.getCity());
			statement.setString(4, address.getPincode());
			statement.execute();
			ResultSet keys = statement.getGeneratedKeys();
			while (keys.next())
				addressId = keys.getInt(1);

			PreparedStatement statement1 = connection.prepareStatement(insertStudentQuery);
			statement1.setInt(1, student.getRollNo());
			statement1.setString(2, student.getName());
			statement1.setString(3, student.getCourseName());
			if (addressId > 0)
				statement1.setInt(4, addressId);
			else
				statement1.setString(4, null);

			if (statement1.executeUpdate() > 0)
				returnMsg = "SuccessFully Inserted Student Record..";

			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return returnMsg;
	}

	public String deleteStudent(int id) {
		
		String returnMessage="Problem Occured During Deletion of Record..";
		String selectQuery = "SELECT * FROM student WHERE id=?";
		String deleteAddressQ = "DELETE FROM address WHERE id=?";
		String deleteStudentQ = "DELETE FROM student WHERE id=?";
		int addressId=0;
		try(
				Connection connection=getJDBCConnection()
			){
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				addressId=result.getInt(4);
			}
			
			PreparedStatement dStatement1 = connection.prepareStatement(deleteStudentQ);
			dStatement1.setInt(1, id);
			dStatement1.execute();
			
			PreparedStatement dStatement2 = connection.prepareStatement(deleteAddressQ);
			dStatement2.setInt(1, addressId);
			
			if(dStatement2.executeUpdate()>0)
				returnMessage="Successfully Deleted..";
				
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		return returnMessage;
	}

	public String updateStudent(Student student, int id) {
		return null;
	}

	public Student selectStudent(int id) {
		Student student = null;

		String selectQuery = "SELECT rollNo, name, courseName, area, landmark, city, pincode"
				+ " FROM student JOIN address ON addressId=address.id" + " WHERE student.id=?";

		try (Connection connection = getJDBCConnection()) {
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			statement.setInt(1, id);

			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Address address = new Address(result.getString(5), result.getString(4), result.getString(7),
						result.getString(6));

				student = new Student(result.getInt(1), result.getString(2), result.getString(3), address);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return student;
	}

	public List<Student> selectAllStudent() {
		
		List<Student> studentList = new ArrayList<>();
		Student student = null;

		String selectQuery = "SELECT rollNo, name, courseName, area, landmark, city, pincode"
				+ " from student join address on addressId=address.id";

		try (Connection connection = getJDBCConnection()) {
			PreparedStatement statement = connection.prepareStatement(selectQuery);

			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Address address = new Address(result.getString(5), result.getString(4), result.getString(7),
						result.getString(6));

				student = new Student(result.getInt(1), result.getString(2), result.getString(3), address);
				
				studentList.add(student);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return studentList;
	}

	private Connection getJDBCConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/gvaiet_db", "root", "root");
	}
}
