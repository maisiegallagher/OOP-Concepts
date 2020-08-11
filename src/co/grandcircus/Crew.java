package co.grandcircus;

public class Crew {

	private String name;
	private String role;

	public Crew() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Crew(String name, String role) {
		this.name = name;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
