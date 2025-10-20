package sans.com.many_to_many_association_mapping;

public class TestApp {
	public static void main(String []args) {
		
		
		Course c1 = new Course("A11","JAVA",1000);
		Course c2 = new Course("B11","Python",1000);
		Course c3 = new Course("C11","Blockchain",1000);
		
		Course []course =new Course[3];
		course[0]=c1;
		course[1]=c2;
		course[2]=c3;
		
		Student s1 = new Student("IND10","SANS","MI",course);
		Student s2 = new Student("IND7","OM","CSK",course);
		Student s3 = new Student("IND18","VIRAT","RCB",course);
		s1.getStudentDetails();
		s2.getStudentDetails();
		s3.getStudentDetails();
		
	}

}
