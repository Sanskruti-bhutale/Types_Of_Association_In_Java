package sans.com.many_to_one_association_mapping;

public class TestApp {
	public static void main(String []args) {
		
		Branch branch = new Branch();
		branch.setBid("IND100");
		branch.setBname("NIT");
		
		Student s1 = new Student();
		s1.setSid("10");
		s1.setSname("omkar");
		s1.setSaddr("MI");
		
		Student s2 = new Student();
		s2.setSid("11");
		s2.setSname("Annay");
		s2.setSaddr("MI");
		
		Student s3 = new Student();
		s3.setSid("12");
		s3.setSname("Om");
		s3.setSaddr("MI");
		
		
		System.out.println("Student details are :: ");
		System.out.println("ID        ::   "+s1.getSid());
		System.out.println("NAME      ::   "+s1.getSname());
		System.out.println("ADDR      ::   "+s1.getSaddr());
		System.out.println("BRANCHID  ::   " +branch.getBid());
		System.out.println("BRANCHID  ::   " +branch.getBname());
		System.out.println("==============================================");
		
		System.out.println("Student details are :: ");
		System.out.println("ID        ::   "+s2.getSid());
		System.out.println("NAME      ::   "+s2.getSname());
		System.out.println("ADDR      ::   "+s2.getSaddr());
		System.out.println("BRANCHID  ::   " +branch.getBid());
		System.out.println("BRANCHID  ::   " +branch.getBname());
		System.out.println("==============================================");
		
		System.out.println("Student details are :: ");
		System.out.println("ID        ::   "+s3.getSid());
		System.out.println("NAME      ::   "+s3.getSname());
		System.out.println("ADDR      ::   "+s3.getSaddr());
		System.out.println("BRANCHID  ::   " +branch.getBid());
		System.out.println("BRANCHID  ::   " +branch.getBname());
		System.out.println("==============================================");
		
	}

}
