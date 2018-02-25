package tree.core;

public class Link {
	
	private Node upperNode;
	private Node lowerNode;
	private boolean active;
	public Node getUpperNode() {
		return upperNode;
	}
	public void setUpperNode(Node upperNode) {
		this.upperNode = upperNode;
	}
	public Node getLowerNode() {
		return lowerNode;
	}
	public void setLowerNode(Node lowerNode) {
		this.lowerNode = lowerNode;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	

}
