package JUnit;

import java.util.*;

public class Animals {
	private String type;
	private String name;
	
	public Animals(String _type, String _name) {
		this.setType(_type);
		this.setName(_name);
	}
	
	public Animals() {
		
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
	
	static Animals[] Zoo;
	
	public void PopulateZoo(Animals [] zoo){
		Animals animal1 = new Animals("Cat", "Joe");
		Animals animal2 = new Animals("Turtle", "Robert");
		Animals animal3 = new Animals("Bird", "Bird");
		Animals animal4 = new Animals("Shark", "Melissa");
		
		Zoo[0]=(animal1);
		Zoo[1]=(animal2);
		Zoo[2]=(animal3);
		Zoo[3]=(animal4);
	}
	
	public String toString() {
		return this.type + " " + this.name;
	}
	
	
}
