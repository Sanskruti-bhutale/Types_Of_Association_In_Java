package sans.com.many_to_many_association_mapping;

public class Student {
	private String sid;
	private String sname;
	private String saddr;
	
	//HAS_A variable
	private Course[] course;
	
	//Constructor Injection
	public Student(String sid, String sname, String saddr, Course[] course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.course = course;
	}
	
	public void getStudentDetails() {
		System.out.println("STUDETN DETAILS ARE :: ");
		System.out.println("SID  IS    :: "+sid);
		System.out.println("SNAME  IS  :: "+sname);
		System.out.println("SADDR  IS  :: "+saddr);
		System.out.println();
		System.out.println("COURSE DETAILS ARE :: ");
		for(Course course:course) {
			System.out.println("CID   IS    :: "+course.cid);
			System.out.println("CNAME   IS  :: "+course.cname);
			System.out.println("CCOST   IS  :: "+course.ccost);
		
			System.out.println();
			
		}
		System.out.println("=========================================");
	}
	
	
	  
	
}
