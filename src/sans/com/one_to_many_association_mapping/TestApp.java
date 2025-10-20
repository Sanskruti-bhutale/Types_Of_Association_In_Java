package sans.com.one_to_many_association_mapping;

public class TestApp {

	public static void main(String[] args) {
		Employee e1=new Employee("10","Rohit","MI");
		Employee e2=new Employee("10","Virat","RCB");
		Employee e3=new Employee("10","Sachin ","CSK");
		Employee []emps=new Employee[3];
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e3;
		
		//Costructor Injection
		Department department = new Department("IPL16" , "BCCI" , emps);
		department.getDepartmentDetails();

	}

}
