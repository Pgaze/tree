package tree.core;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Tree{
	
	protected UUID uuid;
	private String name;
	private int numberOfLevel;
	private List<Integer> nodesByLevel;
	private Map<Integer,Node> nodes;
	
	
	public Tree(String name) {
		this.name = name;
	}
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public int getNumberOfLevel() {
		return numberOfLevel;
	}



	public void setNumberOfLevel(int numberOfLevel) {
		this.numberOfLevel = numberOfLevel;
	}
	
	
	



	
	

}
