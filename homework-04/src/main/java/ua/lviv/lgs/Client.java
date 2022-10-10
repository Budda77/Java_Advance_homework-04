package ua.lviv.lgs;

public class Client {
	private String firstName;
	private String laststName;
	private String email;
	private String password;
	public Client(String firstName, String laststName, String email, String password) {
		super();
		this.firstName = firstName;
		this.laststName = laststName;
		this.email = email;
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLaststName() {
		return laststName;
	}
	public void setLaststName(String laststName) {
		this.laststName = laststName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Client [firstName=" + firstName + ", laststName=" + laststName + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
	

}
