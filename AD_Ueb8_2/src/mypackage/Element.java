package mypackage;

public class Element {

	private int key = 0;
	private Element nextElement;
	private Element prevElement;
	
	public Element(int key) {
		this.key = key;
		nextElement = null;
		prevElement = null;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Element getNextElement() {
		return nextElement;
	}

	public void setNextElement(Element nextElement) {
		this.nextElement = nextElement;
	}

	public Element getPrevElement() {
		return prevElement;
	}

	public void setPrevElement(Element prevElement) {
		this.prevElement = prevElement;
	}
	
	
	
	
}
