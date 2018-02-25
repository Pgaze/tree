package tree.core;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Node {
	
	protected UUID uuid;
	protected String label;
	
	
	
	public Node(String label) {
		this.label = label;
		this.uuid = UUID.randomUUID();
	}
	
	public Node() {}
	
	
	



	public UUID getUuid() {
		return uuid;
	}

	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	

}
