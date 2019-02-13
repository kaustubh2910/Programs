package com.serialization.demo;

import java.io.Serializable;

public class TestClass implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empId;
	private String empName;
	private transient int Salary;

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	static TestClass obj = new TestClass();

	private TestClass() {

	}

	public static TestClass getBean() {

		return obj;
	}
	
	public void TestSerialization() {
		System.out.println("Successfull !!!");
	}

}
