
public class User {
	
	public static enum Passenger{
		STUDENT,
		DISABLED,
		ADULT,
		SENIOR_CITIZEN;
	}
	
	private Passenger type;
	
	public User() {
		
	}

	public Passenger getType() {
		return type;
	}

	public void setType(Passenger type) {
		this.type = type;
	}

}
