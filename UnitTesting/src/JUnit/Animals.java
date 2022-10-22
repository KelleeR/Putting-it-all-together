package JUnit;

public class Animals {
	private String type;
	private String name;
	
	public Animals(String _type, String _name) {
		this.setType(_type);
		this.setName(_name);
	}
	
	public static String animalsName(){
		return "Bingo";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.type + " " + this.name;
	}
	
	
}
