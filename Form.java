package Homework2;

import java.util.ArrayList;
import java.util.Date;

public class Form {

	public static void main(String[] args) {
		// Create a new object of Employee
		Employee Emp = new Employee();
		Emp.setId(555);
		Emp.setCreatedDate(new Date());
		Emp.setCreatedBy("Admin");
		Emp.setFirstName("secure");
		Emp.setLastName("me");
		Emp.setBirthDate(Main.NewDate(1993, 7, 17));
		Emp.setSalary(100);

		System.out.println("\n------------------ Employee ------------------");
		System.out.println(Emp.getView());

		// Create an object Developer From Employee object
		Developer Dev = new Developer(Emp);
		Dev.setComment("C, C++, JAVA");

		System.out.println("\n------------------ Developer ------------------");
		System.out.println(Dev.getView());

		TeamLeader Leader = new TeamLeader(Emp);
		Leader.setProjectNum(9);
		System.out.println("\n------------------ TeamLeader ------------------");
		System.out.println(Leader.getView());
		
		ArrayList<Employee> listEmp= new ArrayList<Employee>();
		listEmp.add(Emp);
		listEmp.add(Dev);
		listEmp.add(Leader);
		//Loop on the array and display the information using the getDataView Method
		System.out.println("\n------------------ Loop Print Array ------------------");
		listEmp.forEach(ls -> System.out.println(ls.getView()));
		
		System.out.println("\n------------------ Display the information by accessing directly to the object ------------------");
		
		Developer dev = new Developer();
		dev.setSalary(1000);
		dev.setLastName("secure");
		dev.setFirstName("me");
		dev.setComment("C#, F#, VB, PHP");
		System.out.println( dev.getView());

		

	}

}

