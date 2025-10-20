package sans.com.one_to_many_association_mapping;

//Target object
public class Department {
	private String dId;
	private String dName;
	
	private Employee[] emps;

	public Department(String dId, String dName, Employee[] emps) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.emps = emps;
	}
	
	public void getDepartmentDetails() {
		System.out.println("Department Ddetails");
		System.out.println("--------------------------------");
		System.out.println("Department Id : "+dId);
		System.out.println("Department Name : "+dName);
		System.out.println();
		System.out.println("Employeee details are : ");
		System.out.println("--------------------------------");
		for(Employee employee:emps) {
			System.out.println(" Employee id :: "+employee.eid);
			System.out.println(" Employee name :: "+employee.ename);
			System.out.println(" Employee address :: "+employee.eaddr);
			System.out.println();
		}
		
		
		
	}
	
	

}
