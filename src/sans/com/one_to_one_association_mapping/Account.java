package sans.com.one_to_one_association_mapping;
//Dependent object
public class Account {
	 private String accNo;
	private  String accName;
	 private String accType;
	public Account(String accNo, String accName, String accType) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
	}
	
	public void getAccountDetails() {
		System.out.println("===========================================    ");
		System.out.println("ACCOUNT DETAILS ARE :: ");
		System.out.println("ACCNO :: "+accNo);
		System.out.println("ACCNAME :: "+accName);
		System.out.println("ACCTYPE :: "+accType);
	}
	 
	
}
