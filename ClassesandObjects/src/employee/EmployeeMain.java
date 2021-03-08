package employee;

public class EmployeeMain {
	
	public static void main(String args[]) {
		
		Employee emp1 = new Employee(001, "Michael Scott", 32, "mas4u19@gmail.com");
		Employee emp2 = new Employee(002, "Rocky Balboa", 55, "thisisnotatest@gmail.com");
		Employee emp3 = new Employee(003, "Heather Shannon", 34);
		Employee emp4 = new Employee(004, "Cameron Jack", 81);
		Employee emp5 = new Employee();
		Projects proj1 = new Projects(199);
		Projects proj2 = new Projects(299, "Testing", "Dell");
		Projects proj3 = new Projects(399, "Implementing", "Acer");
		PresentAddress add1 = new PresentAddress();
		PresentAddress add2 = new PresentAddress("Route21", "Cleveland", "Ohio", "44109", 75);
		PresentAddress add3 = new PresentAddress("Route 22", "Columbus", "Ohio", "55123", 81);
		PermanentAddress pAdd1 = new PermanentAddress("Route 23", "Parma", "Ohio", "55123", 66);
		PermanentAddress pAdd2 = new PermanentAddress("Route 24", "Cincinnati", "Ohio", "34445", 85);
		PermanentAddress pAdd3 = new PermanentAddress("Route 25", "Brooklyn", "Ohio", "33445", 92);		
		
		emp5.setName("John Doe");
		emp5.setId(005);
		emp5.setAge(23);
		emp5.setEmail("testing123@email.com");	
		proj1.setProjectName("Planning");
		proj1.setClientName("HP");
		add1.setAid(68);
		add1.setStreetName("Route20");
		add1.setCity("Independence");
		add1.setState("Ohio");
		add1.setZip("44109");
		System.out.print(emp1.getId()+ ", ");
		System.out.print(emp1.getName()+ ", ");
		System.out.print(emp1.getAge()+ ", ");
		System.out.println(emp1.getEmail());
		System.out.println(emp5.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());
		System.out.println("\n");
		System.out.print(proj1.getProjectId()+ ", ");
		System.out.print(proj1.getProjectName()+ ", ");
		System.out.println(proj1.getClientName());
		System.out.println(proj2.toString());
		System.out.println(proj3.toString());
		System.out.println(add1.toString());	
		System.out.println(add2.toString());	
		System.out.println(add3.toString());	
		System.out.println(pAdd1.toString());	
		System.out.println(pAdd2.toString());	
		System.out.println(pAdd3.toString());	
	}
}