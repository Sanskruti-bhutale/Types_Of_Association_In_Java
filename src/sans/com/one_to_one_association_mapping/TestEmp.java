package sans.com.one_to_one_association_mapping;

public class TestEmp {

	public static void main(String[] args) {
			Account account=new Account("Sans123","SBI","Saving");
			
			//Constructor Injection
			Employee employee=new Employee("IND10","OMKAR", "MUMBAI", account);
			employee.getEmployeeDetails(); 

	}

}
