package JavaPath4;

public class Employee {
	public String firstname; 
	public String lastname;
	private int salary;
	public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		salary = salaryInput;
	}
	public static void main(String[] args) {
		///Lab3
		Employee[] employee = new Employee[3] ;
		
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee("First name" + i, "Last Name" + i, 10000*i) ;
		}
		System.out.println(employee[1].firstname);
		System.out.println(employee[1].lastname);
		System.out.println(employee[1].salary);
	}
	public void hello() {
		System.out.println("Hello " + firstname );
	}
	public int getSalary() {
		return salary;
	}
	
}

