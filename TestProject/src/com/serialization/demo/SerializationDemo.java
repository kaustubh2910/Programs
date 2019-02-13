package com.serialization.demo;

public class SerializationDemo {

	public static void main(String[] args) throws ClassNotFoundException {

		TestClass testObj = TestClass.getBean();
		SznService service = new SznService(); 
		service.sendInputObject(testObj);
		service.getSezn();
		
		DsznService dsznservice = new DsznService();
		TestClass finalObject = (TestClass) dsznservice.getDSezn();
		
		finalObject.TestSerialization();

	}
}
